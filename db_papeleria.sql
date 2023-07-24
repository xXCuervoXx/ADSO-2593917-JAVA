-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 24-07-2023 a las 00:26:01
-- Versión del servidor: 8.0.31
-- Versión de PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_papeleria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `cedula` int NOT NULL,
  `nombres` varchar(255) NOT NULL,
  `apellidos` varchar(255) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `telefono` varchar(255) NOT NULL,
  PRIMARY KEY (`cedula`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cedula`, `nombres`, `apellidos`, `direccion`, `email`, `telefono`) VALUES
(1089096739, 'Andres Felipe', 'Cuervo Sanchez', 'Cuba', 'Cuervoandres95@gmail.com', '3218271281'),
(1022410, 'Juann', 'Gomez', 'Los puentes', 'juan@gmail.com', '1221235');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `item_factura`
--

DROP TABLE IF EXISTS `item_factura`;
CREATE TABLE IF NOT EXISTS `item_factura` (
  `id_factura` int NOT NULL AUTO_INCREMENT,
  `cliente` varchar(255) NOT NULL,
  `id_producto` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `cantidad` int NOT NULL,
  `precio` int NOT NULL,
  `fecha` varchar(255) NOT NULL,
  PRIMARY KEY (`id_factura`)
) ENGINE=MyISAM AUTO_INCREMENT=48 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `item_factura`
--

INSERT INTO `item_factura` (`id_factura`, `cliente`, `id_producto`, `nombre`, `cantidad`, `precio`, `fecha`) VALUES
(35, '', '12', 'Manzana', 1, -1000, '23/07/2023'),
(42, '', '11', 'Banano', 1, 1500, '23/07/2023'),
(47, '', '13', 'Uva', 3, -2100, '23/07/2023'),
(40, '', '11', 'Banano', 1, 1500, '23/07/2023'),
(46, 'Andres Felipe', '13', 'Uva', 3, 2100, '23/07/2023'),
(44, '', '13', 'Uva', 2, 1400, '23/07/2023'),
(26, '', '12', 'Manzana', 1, 500, '24/07/2023'),
(25, '', '12', 'Manzana', 1, 500, '23/07/2023'),
(45, '', '13', 'Uva', 2, 1400, '23/07/2023');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

DROP TABLE IF EXISTS `productos`;
CREATE TABLE IF NOT EXISTS `productos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `cantidad` int NOT NULL,
  `precio` int NOT NULL,
  `costo` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `nombre`, `cantidad`, `precio`, `costo`) VALUES
(13, 'Uva', 12, 700, 400),
(14, 'Fresa', 12, 2000, 500);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
