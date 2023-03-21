
<?php

require_once('funciones/funciones_input.php');

    $nombre = test_input( $_POST['nombre'] ?? null );
    $email = test_input( $_POST['email'] ?? null );
    $edad = test_input( $_POST['edad'] ?? null );
    $servicios = $_POST['servicios'] ?? array();
    $mensaje = test_input( $_POST['mensaje'] ?? null );
    $contraseña = test_input($_POST['contraseña'] ?? null);
    $errores = array();

    if( isset($_POST['submit']) ) {

      if( empty($nombre) ){
          array_push($errores, 'Usted debe ingresar un nombre de usuario.');
      }

      if( filter_var($email, FILTER_VALIDATE_EMAIL) == FALSE ){
          array_push($errores, 'Usted debe ingresar un correo electrónico con formato válido.');
      }

      $opciones_edad = array(
          'options' => array(
              'min_range' => 1,
              'max_range' => 120
          )
      );

      if(strlen($contraseña) < 6){
          array_push($errores,  'La clave debe tener al menos 6 caracteres');
       }
       if(strlen($contraseña) > 16){
           array_push($errores,  'La clave no puede tener más de 16 caracteres');
       }
       if (!preg_match('`[a-z]`',$contraseña)){
           array_push($errores,  'La clave debe tener al menos una letra minúscula');
       }
       if (!preg_match('`[A-Z]`',$contraseña)){
           array_push($errores, 'La clave debe tener al menos una letra mayúscula');
       }
       if (!preg_match('`[0-9]`',$contraseña)){
           array_push($errores, 'La clave debe tener al menos un caracter numérico');
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
    <title>Registro</title>
    <link rel="stylesheet" href="css/registro.css">
    <?php require_once('layout/css.php');?>
  </head>
<body>
  <?php require_once('_nav.php') ?>
  
  <div class="page pb-4 d-flex flex-row justify-content-center align-items-center">    
      <ul>
          <?php foreach($errores as $error): ?>
          <li class=" text-danger list-unstyled"> <?php echo $error ?> </li>
          <?php endforeach ?>
        </ul>
      <form action="registrarse.php" method = "POST">  
     <div class="contenedor d-flex mx-auto">
      <div class="left bg-light position-relative">
      <div class="login">Registro</div>
      <div class="eula m-5">Al registrarse, usted acepta todos los terminos y condiciones de nuestra marca.</div>
    </div>
    
    <div class="right position-relative">
      <div class="form p-4">
        <label for="email">Email</label>
        <input type="email" class="form-control" name="email" id="email" value="<?php echo $email ?>" >
        <label for="nombre">Nombre de usuario</label>
        <input type="text" class="form-control" name="nombre" id="nombre" value="<?php echo $nombre ?>">
        <label for="password">Contraseña</label>
        <input type="password" class="form-control" name="contraseña" id="contraseña">
        <label for="image">Adjunte su foto de perfil</label>
        <input type="file" name="image" id="image" class="border-0">
        <button type="submit" id="submit" class="w-25 mx-auto d-block" name="submit"> Enviar </button>
      </div>
    </div>
  </div>
</form>
</div>


<?php require_once('_footer.php') ?>
<?php require_once('layout/js.php')?>

</body>
</html>