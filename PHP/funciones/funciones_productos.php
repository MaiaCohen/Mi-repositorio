<?php 

function getProductos(PDO $conexion)
{

    $consulta = $conexion->prepare('
        SELECT id, nombre, categoria_id, descripcion, estrellas, precio, descuento, stock, imagen
        FROM productos
    ');

    $consulta->execute();

    $productos = $consulta->fetchAll(PDO::FETCH_ASSOC);

    return $productos;

}

function getProductosByTipo(PDO $conexion, $categoria)
{
    if ($categoria) {
        $consulta = $conexion->prepare('
            SELECT id, nombre, categoria_id, descripcion, estrellas, precio, descuento, stock, imagen
            FROM productos
            WHERE categoria_id = :categoria
        ');
        
        $consulta->bindValue(':categoria', $categoria);
    } else {
        $consulta = $conexion->prepare('
                SELECT id, nombre, categoria_id, descripcion, estrellas, precio, descuento, stock, imagen
                FROM productos
            ');
    }

    $consulta->execute();

    $producto = $consulta->fetchAll(PDO::FETCH_BOTH);

    return $producto;

}

?>