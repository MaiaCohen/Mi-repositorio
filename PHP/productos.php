<?php

require_once('funciones/funciones_paginador.php');
require_once('funciones/funciones_productos.php');
require_once('conf/conf.php');

////////////////////////////////////////////////////


try{
    $conexion = new PDO('mysql:host='.DB_HOST.';dbname='.DB_NAME.';charset=utf8', DB_USER, DB_PASSWORD);
}catch(PDOException $e){
    header('Location: error404.php');
}

$productos = getProductos($conexion);

$categoria = $_GET['categoria'] ?? null;

$producto = getProductosByTipo($conexion, $categoria);


//Cantidad de empleados en total.
$cantidad = count($producto);
//Página actual.
$pagina_actual = $_GET['pag'] ?? 1;
//Cuántos registros por página.
$cuantos_por_pagina = 10;

$paginado_enlaces = paginador_enlaces($cantidad, $pagina_actual, $cuantos_por_pagina);

$productos = paginador_lista($producto, $pagina_actual, $cuantos_por_pagina);



unset($conexion);


?>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Productos</title>
    <?php require_once('layout/css.php');?>
</head>
<body>
    <?php require_once('_nav.php') ?>
    
    <section class="py-5 bg-productos">
        <div class="container text-white">
            <h1 class="text text-center mt-3 mb-3"> JEWLOODS </h1>
            <form action="productos.php" method="get" class="mb-4">
                <div class="mb-1">
                    <label for="categoria" class="form-label"> <strong>Productos</strong>  </label>
                    <select name="categoria" id="categoria" class="form-control">
                        <option value=""> Seleccione un producto </option>
                        <option value="2"> Aritos </option>
                        <option value="3"> Colgantes </option>
                        <option value="1"> Anillos </option>
                        <option value=""> Todos los productos </option>
                    </select>
                </div>
                <button type="submit" class="btn btn-dark mt-lg-2 ms-2"> Buscar </button>
                <a href="list-productos.php" class="btn btn-primary mt-lg-2 ms-2"> Agregar productos </a>
            </div>
            <div class="container px-4 px-lg-5 mt-5">
                <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
                    <?php if (count($productos) > 0){  ?>
                    <?php foreach($productos as $items) {  if ($items['stock'] > 0) { ?>
                    <div class="col mb-5">
                    <div class="card h-100">
                    <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">En venta</div>
                    <?php  } else { ?>
                    <div class="col mb-5">
                    <div class="card h-100 bg-stock">
                    <div class="badge text-white position-absolute stock" style="top: 0.5rem; right: 0.5rem">Sin stock</div>
                    <?php  } ?>               
                            <!-- Imagen del producto -->
                            <img class="card-img-top" src="<?php echo BASE_URL . $items['imagen'] ?>" alt="..." />
                            <!-- Detalles del producto -->
                            <div class="card-body p-4 p-lg-1">
                                <div class="text-center">
                                    <!-- Nombre del producto -->
                                    <h5 class="fw-bolder"> <?php echo $items['nombre']  ?> </h5>
                                    <p> <?php echo $items['descripcion'] ?> </p>
                                    <!-- Valoracion de producto -->
                                    <div class="d-flex justify-content-center small text-warning mb-2">
                                        <?php for($i = 0; $i < $items['estrellas']; $i++) {?>
                                        <div class="bi-star-fill"></div>
                                        <?php } ?>
                                    </div>
                                    <!-- Precio de producto -->
                                    <?php if ($items['descuento'] == 0){?>
                                    <span> $ <?php echo $items['precio']; } else {?> </span>
                                    <span class="text-muted text-decoration-line-through">
                                     $<?php echo $items['precio'];?></span> $<span><?php echo $items['precio'] - $items['descuento']; }?></span>

                                </div>
                            </div>
                            <!-- Acciones de producto -->
                            <?php  if ($items['stock'] > 0) { ?>
                            <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                <div class="text-center"><a class="btn bordes mt-auto" href="#">Añadir al carro</a></div>
                            </div>
                            <?php } ?>
                        </div>
                    </div>
                    <?php } ?>
                    <?php }; ?>
                    </div>
                </div>
                <nav aria-label="Page navigation example">
            <ul class="pagination justify-content-center">
                <?php if($paginado_enlaces['anterior']): ?>
                    <li class="page-item">
                        <a class="page-link" href="?pag=<?php echo $paginado_enlaces['primero'] ?>"> Principio </a>                        
                    </li>
                    <li class="page-item">
                        <a class="page-link" href="?pag=<?php echo $paginado_enlaces['anterior'] ?>"> <?php echo $paginado_enlaces['anterior'] ?> </a>
                    </li>
                <?php endif ?>
                <li class="page-item active"> 
                    <span class="page-link">
                        <?php echo $paginado_enlaces['actual'] ?> 
                    </span>
                </li>
                <?php if($paginado_enlaces['siguiente']): ?>
                    <li class="page-item">
                        <a class="page-link" href="?pag=<?php echo $paginado_enlaces['siguiente'] ?>"> <?php echo $paginado_enlaces['siguiente'] ?> </a>
                    </li>
                    <li class="page-item">
                    <a class="page-link" href="?pag=<?php echo $paginado_enlaces['ultimo'] ?>"> Final </a>
                    </li>
                <?php endif ?>
            </ul>
        </nav>
            </div>
        </section>
        
    <?php require_once('_footer.php') ?>
    <?php require_once('layout/js.php')?>
</body>
</html>
