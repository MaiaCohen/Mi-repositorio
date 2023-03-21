-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-12-2022 a las 02:34:58
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `prod`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE `categorias` (
  `id_cat` int(11) NOT NULL,
  `nombres` varchar(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`id_cat`, `nombres`) VALUES
(1, 'Anillos'),
(2, 'Aritos'),
(3, 'Colgantes');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(55) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `estrellas` int(11) NOT NULL,
  `precio` float(9,2) NOT NULL,
  `descuento` float(9,2) NOT NULL,
  `stock` int(11) NOT NULL,
  `categoria_id` int(11) NOT NULL,
  `imagen` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `nombre`, `descripcion`, `estrellas`, `precio`, `descuento`, `stock`, `categoria_id`, `imagen`) VALUES
(1, 'Jewloods Knot', 'Pendientes largos en oro rosa con diamantes', 5, 5500.00, 500.00, 0, 2, 'img/productos/1.png'),
(2, 'Jewloods Victoria', 'Pendientes de rama de diamantes en platino, pequeños', 1, 1500.00, 0.00, 3, 2, 'img/productos/2.png'),
(3, 'Olive Leaf Climber de Paloma Picasso', 'Pendientes en plata de ley', 5, 6500.00, 350.00, 4, 2, 'img/productos/3.png'),
(4, 'Jewloods Love Blue', 'Pendientes de corazón en plata, mini', 4, 3500.00, 0.00, 2, 2, 'img/productos/4.png'),
(5, 'Jewloods Victoria', 'Pendientes en platino con diamantes, mini', 1, 1200.00, 100.00, 2, 2, 'img/productos/5.png'),
(6, 'Jewloods Pearls and South Sea', 'Pendientes en oro rosa con perlas cultivadas del Mar del Sur y diamantes', 2, 2500.00, 300.00, 2, 2, 'img/productos/6.png'),
(7, 'Jewloods Knot', 'Pendientes en oro amarillo con diamantes', 3, 3200.00, 0.00, 2, 2, 'img/productos/7.png'),
(8, 'Jewloods Open Heart de Elsa Peretti', 'Pendientes de botón corazon en oro rosa, 11mm', 1, 950.00, 100.00, 2, 2, 'img/productos/8.png'),
(9, 'Jewloods Palomas Studio Baguette', 'Pendientes estilo barra en oro de 18 ct con rubelitas', 5, 4800.00, 400.00, 4, 2, 'img/productos/9.png'),
(10, 'Jewloods Palomas Studio', 'Pendientes hexagonales azules de 18 ct con tanzanitas', 4, 4300.00, 700.00, 3, 2, 'img/productos/10.png'),
(11, 'Jewloods Sixteen Stone Ring', 'Anillo Sixteen Stone en oro de 18k con diamantes', 0, 4900.00, 0.00, 0, 1, 'img/productos/11.png'),
(12, 'Jewloods Laurel Ring', 'Anillo de enredadera con desviación, oro amarillo y diamantes', 4, 4200.00, 200.00, 0, 1, 'img/productos/12.png'),
(13, 'Jewloods Leaf Stone', 'Argolla de enredadera en oro rosa con diamantes.', 2, 1900.00, 300.00, 0, 1, 'img/productos/13.png'),
(14, 'Jewloods V Ring', 'Anillo V de Soleste en platino con diamantes', 3, 2200.00, 200.00, 10, 1, 'img/productos/14.png'),
(15, 'Jewloods Incrusted Stone', 'Anillo completo en oro con diamantes', 4, 4600.00, 400.00, 12, 1, 'img/productos/15.png'),
(16, 'Jewloods Silver Light', 'Anillo angosto, oro blanco 18k, diamante en pavé', 5, 5400.00, 350.00, 0, 1, 'img/productos/16.png'),
(17, 'Jewloods Blue Island', 'Anillo en plata con zafiros de Montana, angosto', 2, 1750.00, 250.00, 20, 1, 'img/productos/17.png'),
(18, 'Jewloods Four Stars', 'Anillo Soleste en oro de 18 quilates con diamantes', 4, 4500.00, 0.00, 20, 1, 'img/productos/18.png'),
(19, 'Jewloods Sixteen Stone Ring blue', 'Anillo Sixteen Stone con diamantes y zafiros', 3, 3100.00, 0.00, 10, 1, 'img/productos/19.png'),
(20, 'Jewloods Rising Storm', 'Anillo Sixteen Stone de platino con diamantes', 5, 5900.00, 0.00, 20, 1, 'img/productos/20.png'),
(21, 'Jewloods Knot', 'Colgante en oro amarillo', 3, 2700.00, 0.00, 10, 3, 'img/productos/21.png'),
(22, 'Jewloods Victoria Pink Diamond', 'Colgante con círculo de vid de diamantes, oro rosa 18 ct, pequeño', 4, 3400.00, 250.00, 10, 3, 'img/productos/22.png'),
(23, 'Jewloods Victoria Platinum', 'Colgante en platino con diamantes, pequeño', 4, 3900.00, 0.00, 4, 3, 'img/productos/23.png'),
(24, 'Jewloods X Atlas', 'Colgante entrelazado cerrado en oro amarillo', 1, 1450.00, 150.00, 0, 3, 'img/productos/24.png'),
(25, 'Jewloods Knot', 'Colgante Elsa Peretti by the Yard en plata con aguamarinas', 2, 1800.00, 200.00, 12, 3, 'img/productos/25.png'),
(26, 'Jewloods Diamonds by the Yard', 'Colgante Soleste en platino con diamantes de corte brillante redondo', 2, 1850.00, 0.00, 20, 3, 'img/productos/26.png'),
(27, 'Jewloods Sapphire and Diamond', 'Colgante Soleste de platino con un zafiro y diamantes', 3, 2600.00, 0.00, 20, 3, 'img/productos/27.png'),
(28, 'Jewloods Diamond and Turquoise', 'Colgante circular con turquesa y diamantes en oro blanco de 18k', 5, 5100.00, 350.00, 0, 3, 'img/productos/28.png'),
(29, 'Jewloods Mini Crown Key', 'Colgante circular con nácar y diamantes', 0, 3950.00, 0.00, 0, 3, 'img/productos/29.png'),
(30, 'Jewloods Pearl and Diamond', 'Colgante en platino con una perla del mar del Sur y diamantes', 0, 5700.00, 950.00, 0, 3, 'img/productos/30.png');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`id_cat`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `categoria_id` (`categoria_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categorias`
--
ALTER TABLE `categorias`
  MODIFY `id_cat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`categoria_id`) REFERENCES `categorias` (`id_cat`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
