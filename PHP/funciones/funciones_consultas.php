<?php

try{
    $conexion = new PDO('mysql:host='.DB_HOST.';dbname='.DB_NAME.';charset=utf8', DB_USER, DB_PASSWORD);
}catch(PDOException $e){
    header('Location: error.php');
}

function getCategorias(PDO $conexion)
{
    $consulta = $conexion->prepare('
        SELECT id_cat, nombres
        FROM categorias
        ORDER BY nombres
    ');
    $consulta->execute();
    $categorias = $consulta->fetchAll(PDO::FETCH_ASSOC);
    return $categorias;
}

function addProducto(PDO $conexion, $data)
{
    $consulta = $conexion->prepare('
        INSERT INTO productos(nombre, descripcion, precio, categoria_id, imagen, descuento, estrellas, stock)
        VALUES(:nombre, :descripcion, :precio, :categoria_id, :imagen, :descuento, :estrellas, :stock)
    ');
    
    $consulta->bindValue(':nombre', $data['nombre']);
    $consulta->bindValue(':descripcion', $data['descripcion']);
    $consulta->bindValue(':precio', $data['precio']);
    $consulta->bindValue(':descuento', $data['descuento']);
    $consulta->bindValue(':estrellas', $data['estrellas']);
    $consulta->bindValue(':stock', $data['stock']);
    $consulta->bindValue(':categoria_id', $data['categoria_id']);
    $consulta->bindValue(':imagen', $data['imagen']);
    $consulta->execute();
}

function getProductos(PDO $conexion)
{
    $consulta = $conexion->prepare('
        SELECT prod.id, prod.nombre, prod.precio, prod.descripcion, prod.categoria_id, prod.imagen, cat.nombres categoria_nombre
        FROM productos prod
        INNER JOIN categorias cat
        ON prod.categoria_id = cat.id_cat
    ');
    $consulta->execute();
    $productos = $consulta->fetchAll(PDO::FETCH_ASSOC);
    return $productos;
}

function getProductoById(PDO $conexion, $id)
{
    $consulta = $conexion->prepare('
        SELECT id, nombre, descripcion, precio, categoria_id, imagen, descuento, estrellas, stock
        FROM productos
        WHERE id = :id
    ');
    $consulta->bindValue(':id', $id);
    $consulta->execute();
    $producto = $consulta->fetch(PDO::FETCH_ASSOC);
    return $producto;
}

function updateProducto(PDO $conexion, $id, $data)
{
    $consulta = $conexion->prepare('
        UPDATE productos
        SET 
            nombre = :nombre,
            descripcion = :descripcion,
            precio = :precio,
            descuento = :descuento,
            estrellas = :estrellas,
            stock = :stock,
            categoria_id = :categoria_id,
            imagen = :imagen
        WHERE id = :id
    ');
    $consulta->bindValue(':nombre', $data['nombre']);
    $consulta->bindValue(':descripcion', $data['descripcion']);
    $consulta->bindValue(':precio', $data['precio']);
    $consulta->bindValue(':descuento', $data['descuento']);
    $consulta->bindValue(':estrellas', $data['estrellas']);
    $consulta->bindValue(':stock', $data['stock']);
    $consulta->bindValue(':categoria_id', $data['categoria_id']);
    $consulta->bindValue(':imagen', $data['imagen']);
    $consulta->bindValue(':id', $id);
    $consulta->execute();
}

function deleteProducto(PDO $conexion, $id)
{
    $consulta = $conexion->prepare('
        DELETE FROM productos
        WHERE id = :id
    ');
    $consulta->bindValue(':id', $id);
    $consulta->execute();
}

?>