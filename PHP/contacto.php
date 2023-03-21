<?php

require_once('funciones/funciones_input.php');

    $nombre = test_input( $_POST['nombre'] ?? null ); // test input borra espacios // post es el psot del metodoen el formulario
    $apellido = test_input($_POST['apellido'] ?? null);
    $telefono = test_input( $_POST['telefono'] ?? null );
    $email = test_input( $_POST['email'] ?? null );
    $consulta = $_POST['consulta'] ?? array();
    $mensaje = test_input( $_POST['mensaje'] ?? null );
    $errores = array();

    if( isset($_POST['submit']) ) { // isset si apreto boton

      if( empty($nombre) ){ //empty si esta vacio
          array_push($errores, 'Usted debe ingresar un nombre.');
      }
      if( empty($apellido) ){
        array_push($errores, 'Usted debe ingresar un apellido.');
    }
    
    $opciones_telefono = array(
        'options' => array(
            'min_range' => 1,
            'max_range' => 12
        )
    );
    if( filter_var($telefono, FILTER_VALIDATE_INT, $opciones_telefono) == FALSE){ // FILTER_VALIDATE_INT que todos sean enteros (funcion php)
      array_push($errores, 'Usted debe ingresar un numero valido.');
    }
      if( filter_var($email, FILTER_VALIDATE_EMAIL) == FALSE ){
          array_push($errores, 'Usted debe ingresar un correo electrónico con formato válido.');
      }



      if(empty($consulta)){
        array_push($errores, 'Usted debe seleccionar un tipo de consulta.');
      }

      if( empty($mensaje) ){
        array_push($errores, 'Usted debe ingresar un mensaje junto con su consulta.');
    }

      if( count($errores) == 0 ){
          header('Location: resultado_formulario.php');
      }
      
  }
?>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contacto</title>
    <link rel="stylesheet" href="css/form.css">
    <?php require_once('layout/css.php');?>
</head>
<body>
    <?php require_once('_nav.php') ?>

    <ul class="errores">
      <?php foreach($errores as $error): ?> 
      <li class=" text-danger list-unstyled"> <?php echo $error ?> </li>
      <?php endforeach ?> 
    </ul>
    <section id="contacto p-3">
    <form action="contacto.php" method = "POST" class="formulario">
          <div class="contacto">
            <div class="img-izquierda"></div>
            <div class="px-4 py-3">
              <div class="items">
                <label for="apellido">Apellido</label>
                <input type="text" class="form-control" name="apellido" id="apellido" value="<?php echo $apellido ?>">
              </div>
              <div class="items">
                <label for="nombre">Nombre</label>
                <input type="text" class="form-control" name="nombre" id="nombre" value="<?php echo $nombre ?>">
              </div>
              <div class="items">
                <label for="telefono">Telefono</label>
                <input type="number" class="form-control" name="telefono" id="telefono" value="<?php echo $telefono ?>">
              </div>
              <div class="items">
                <label for="email">Email</label>
                <input type="email" class="form-control" name="email" id="email" value="<?php echo $email ?>">
              </div>
              <div class="items">
                <label for="consulta">Tipo de consulta</label>
                <select name="consulta" id="consulta">
                    <option value="">Seleccione una consulta</option>
                    <option value="pedido">Quiero realizar un pedido personalido</option>
                    <option value="sugerencia">Quiero realizar una consulta / sugerencia</option>
                    <option value="reclamo">Quiero realizar un reclamo</option>
                    <option value="otro">Otros</option>
                </select>
              </div>
                <textarea name="mensaje" id="mensaje" placeholder="Escriba los detalles aqui" cols="35" rows="8"></textarea>
                <button type="submit" id="submit" class="w-25 mx-auto d-block" name="submit"> Enviar </button>
            </div>
          </div>
        </form>
        
      </section>

    <?php require_once('_footer.php') ?>
    <?php require_once('layout/js.php')?>
</body>
</html>
