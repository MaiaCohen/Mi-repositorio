<?php

function test_input($data) {
    $data = trim($data); // elimina espacios
    $data = stripslashes($data); // elimina barras invertidas
    $data = htmlspecialchars($data); // modifica carac especiales
    return $data;
  }

?>