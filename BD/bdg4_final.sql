-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-06-2022 a las 20:19:30
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdg4_final`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actividad_laboral`
--

CREATE TABLE `actividad_laboral` (
  `id_actividad` int(11) NOT NULL,
  `nombre_actividad` varchar(100) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `entregable` varchar(50) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `fecha_entrega` date DEFAULT NULL,
  `fecha_modificacion` date DEFAULT NULL,
  `fecha_publicacion` date DEFAULT NULL,
  `hora_entrega` time DEFAULT NULL,
  `id_area` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `actividad_laboral`
--

INSERT INTO `actividad_laboral` (`id_actividad`, `nombre_actividad`, `descripcion`, `entregable`, `estado`, `fecha_entrega`, `fecha_modificacion`, `fecha_publicacion`, `hora_entrega`, `id_area`) VALUES
(1, 'Revisar Inventario', 'Revisar inventario existente para control de inventario', 'Si', 'activo', '2021-05-18', '2021-05-13', '2021-04-13', '09:00:00', 1),
(2, 'Empaquetar productos', 'Empacar ultimos productos en cajas para su comercializacion', 'Si', 'activo', '2021-06-27', '2021-06-22', '2020-06-13', '08:00:00', 5),
(3, 'Calcular Nomina', 'Calcular nomina de la empresa', 'SI', 'activo', '2021-08-26', '2021-08-21', '2021-08-13', '07:00:00', 3),
(4, 'Entrega de informe sobre quimicos utilizados', 'Informe sobre quimicos usados para la elaboracion del ultimo cargamento de cueros', 'No', 'activo', '2021-09-15', '2021-09-10', '2021-10-13', '17:00:00', 2),
(5, 'Revision de calidad de productos nuevos', 'Revisar estado de los nuevos quimicos adquiridos', 'No', 'activo', '2021-10-25', '2021-10-20', '2021-12-13', '12:00:00', 2),
(6, 'Informe sobre pedidos', 'Informe sobre pedidos hechos en los ultimos meses con sus gastos', 'Si', 'activo', '2021-12-04', '2021-11-29', '2021-02-13', '14:30:00', 5),
(7, 'Reunion con proveedores', 'Reunion con nuevos proveedores para firma de contrato', 'Si', 'activo', '2022-01-13', '2022-01-08', '2021-04-13', '07:30:00', 4),
(8, 'Reunion con inversionistas', 'Reunion de negocios con nuevos inversionistas', 'No', 'activo', '2021-10-22', '2021-10-17', '2021-04-14', '09:00:00', 4),
(9, 'Fabricacion de cueros para zapato', 'Comienzo de elaboracion del nuevo cargamento de cueros para zapato', 'No', 'activo', '2021-12-04', '2021-11-29', '2021-04-15', '08:00:00', 2),
(10, 'Revisar Inventario', 'Revisar inventario existente para control de inventario', 'Si', 'activo', '2022-01-13', '2022-01-08', '2021-04-16', '07:00:00', 1),
(11, 'Empaquetar productos', 'Empacar ultimos productos en cajas para su comercializacion', 'Si', 'activo', '2021-10-22', '2021-10-17', '2021-04-17', '17:00:00', 5),
(12, 'Calcular Nomina', 'Calcular nomina de la empresa', 'SI', 'activo', '2021-12-04', '2021-11-29', '2021-04-18', '12:00:00', 3),
(13, 'Entrega de informe sobre quimicos utilizados', 'Informe sobre quimicos usados para la elaboracion del ultimo cargamento de cueros', 'No', 'activo', '2022-01-13', '2022-01-08', '2021-04-19', '14:30:00', 2),
(14, 'Revision de calidad de productos nuevos', 'Revisar estado de los nuevos quimicos adquiridos', 'No', 'activo', '2021-10-22', '2021-10-17', '2021-04-20', '07:30:00', 2),
(15, 'Informe sobre pedidos', 'Informe sobre pedidos hechos en los ultimos meses con sus gastos', 'Si', 'activo', '2021-12-04', '2021-11-29', '2021-02-13', '09:00:00', 5),
(16, 'Reunion con proveedores', 'Reunion con nuevos proveedores para firma de contrato', 'Si', 'activo', '2021-10-22', '2021-10-17', '2021-04-13', '08:00:00', 4),
(17, 'Reunion con inversionistas', 'Reunion de negocios con nuevos inversionistas', 'No', 'activo', '2021-12-04', '2021-11-29', '2021-10-08', '07:00:00', 4),
(18, 'Fabricacion de cueros para zapato', 'Comienzo de elaboracion del nuevo cargamento de cueros para zapato', 'No', 'activo', '2022-01-13', '2022-01-08', '2021-04-19', '17:00:00', 2),
(19, 'Revisar Inventario', 'Revisar inventario existente para control de inventario', 'Si', 'activo', '2021-10-22', '2021-10-17', '2021-04-20', '12:00:00', 1),
(20, 'Empaquetar productos', 'Empacar ultimos productos en cajas para su comercializacion', 'Si', 'activo', '2021-12-04', '2021-11-29', '2021-02-13', '14:30:00', 5),
(21, 'Calcular Nomina', 'Calcular nomina de la empresa', 'SI', 'activo', '2021-12-04', '2021-11-29', '2021-04-13', '07:30:00', 3),
(22, 'Entrega de informe sobre quimicos utilizados', 'Informe sobre quimicos usados para la elaboracion del ultimo cargamento de cueros', 'No', 'activo', '2022-01-13', '2022-01-08', '2021-10-08', '09:00:00', 2),
(23, 'Revision de calidad de productos nuevos', 'Revisar estado de los nuevos quimicos adquiridos', 'No', 'activo', '2021-10-22', '2021-10-17', '2021-04-19', '08:00:00', 2),
(24, 'Informe sobre pedidos', 'Informe sobre pedidos hechos en los ultimos meses con sus gastos', 'Si', 'activo', '2021-12-04', '2021-11-29', '2021-04-20', '07:00:00', 5),
(25, 'Reunion con proveedores', 'Reunion con nuevos proveedores para firma de contrato', 'Si', 'activo', '2021-10-22', '2021-10-17', '2021-02-13', '17:00:00', 4),
(26, 'Reunion con inversionistas', 'Reunion de negocios con nuevos inversionistas', 'No', 'activo', '2021-12-04', '2021-11-29', '2021-04-13', '12:00:00', 4),
(27, 'Revisar Inventario', 'Revisar inventario existente para control de inventario', 'No', 'activo', '2022-01-13', '2022-01-08', '2021-04-16', '14:30:00', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `agentes`
--

CREATE TABLE `agentes` (
  `id_agente` int(11) NOT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `celular` varchar(11) DEFAULT NULL,
  `contraseña` varchar(255) DEFAULT NULL,
  `correo` varchar(255) DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `rol_id_rol` int(11) NOT NULL,
  `contrasena` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `agentes`
--

INSERT INTO `agentes` (`id_agente`, `apellido`, `celular`, `contraseña`, `correo`, `estado`, `nombre`, `rol_id_rol`, `contrasena`) VALUES
(1, 'LOPEZ', '3214905454', NULL, 'AL01@mrtwL.com', 'activo', 'ANTONIO', 1, NULL),
(2, 'SANCHEZ', '3234567789', NULL, 'MS02@mrtwL.com', 'activo', 'MARIA CARMEN', 1, NULL),
(3, 'LINARES', '3024552433', NULL, 'JS03@mrtwL.com', 'activo', 'JOSE', 1, NULL),
(4, 'POVEDA', '3045663212', NULL, 'MP04@mrtwL.com', 'activo', 'MANUEL', 1, NULL),
(5, 'SARMIENTO', '3216779091', NULL, 'CS05@mrtwL.com', 'activo', 'CARMEN', 1, NULL),
(6, 'RODRIGUEZ', '3102554302', NULL, 'AR06@mrtwL.com', 'activo', 'ANA', 1, NULL),
(7, 'QUINTERO', '3115026625', NULL, 'CQ07@mrtwL.com', 'activo', 'CRISTIAN', 1, NULL),
(8, 'CUESTA', '3123237865', NULL, 'LC08@mrtwL.com', 'activo', 'LUCIA ', 1, NULL),
(9, 'LOPEZ', '3216407890', NULL, 'LC08@mrtwL.com', 'activo', 'PABLO', 1, NULL),
(10, 'VALERO', '3134553218', NULL, 'AV10@mrtwL.com', 'activo', 'ANGIE', 1, NULL),
(11, 'RINCON', '3234556577', NULL, 'JR11@mrtwL.com', 'activo', 'JOSE MARIA', 1, NULL),
(12, 'SABOGAL', '3214908788', NULL, 'SS12@mrtwL.com', 'activo', 'SERGIO', 1, NULL),
(13, 'SANABRIA', '3112445625', NULL, 'FS13@mrtwL.com', 'activo', 'FERNANDO', 1, NULL),
(14, 'MURIEL', '3123234567', NULL, 'PM14@mrtwL.com', NULL, 'JUAN ALBERTO', 1, NULL),
(15, 'MINA', '3119087744', NULL, 'MM15@mrtwL.com', 'activo', 'MANUELA ', 1, NULL),
(16, 'MEDINA', '31245557790', NULL, 'MM16@mrtwL.com', 'activo', 'MERCEDES', 1, NULL),
(17, 'APONTE', '3132667809', NULL, 'JA17@mrtwL.com', 'activo', 'JULIA', 1, NULL),
(18, 'ACOSTA', '3214557790', NULL, 'RA18@mrtwL.com', 'activo', 'RAUL', 1, NULL),
(19, 'BENAVIDES', '3102998854', NULL, 'IB19@mrtwL.com', 'activo', 'IVAN', 1, NULL),
(20, 'MONGUI', '3126009897', NULL, 'EM20@mrtwL.com', 'activo', 'ENRIQUE', 1, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `area_empresarial`
--

CREATE TABLE `area_empresarial` (
  `id_area` int(11) NOT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `nombre_area` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `area_empresarial`
--

INSERT INTO `area_empresarial` (`id_area`, `estado`, `nombre_area`) VALUES
(1, 'activo', 'Contabilidad'),
(2, 'activo', 'Manofactura'),
(3, 'activo', 'Bienestar al empleado'),
(4, 'activo', 'Administrativa'),
(5, 'activo', 'Envios');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calendario`
--

CREATE TABLE `calendario` (
  `id_calendario` int(11) NOT NULL,
  `end` date DEFAULT NULL,
  `start` date DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `id_actividad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `calendario`
--

INSERT INTO `calendario` (`id_calendario`, `end`, `start`, `title`, `id_actividad`) VALUES
(1, '2022-05-01', '2022-04-14', 'Tarea', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `canales`
--

CREATE TABLE `canales` (
  `id_canal` int(11) NOT NULL,
  `descripcion_canal` varchar(255) DEFAULT NULL,
  `nombre_canal` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `capacitaciones`
--

CREATE TABLE `capacitaciones` (
  `id_capacitacion` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `dni` int(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `nombre_capacitacion` varchar(255) DEFAULT NULL,
  `nombre_encargado` varchar(255) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `capacitaciones`
--

INSERT INTO `capacitaciones` (`id_capacitacion`, `descripcion`, `dni`, `email`, `estado`, `fecha`, `hora`, `nombre_capacitacion`, `nombre_encargado`, `telefono`) VALUES
(1, 'Aumenta tu autoestima', 1157306346, 'joaquinca@gmail.com', 'activo', '2022-01-08', '13:30:00', 'Autoestima', 'Joaquim Carvajal', 2147483647),
(2, 'La importancia del trabajo en equipo', 1187938547, 'jenniahn@gmail.com', 'activo', '2021-10-17', '15:00:00', 'Trabajo en equipo', 'Jennifer Ahmed', 2147483647),
(3, 'Como expresar tu idea de una mejora manera', 1575489764, 'peteriba@gmail.com', 'activo', '2021-11-29', '08:30:00', 'Expresa tus ideas', 'Peter Ibañez', 2147483647),
(4, 'La organización del tiempo', 1295712470, 'mnugran@gmail.com', 'activo', '2022-01-08', '09:45:00', 'Organización', 'Manuel Grande', 2147483647),
(5, 'la importancia de escuchar', 1453715768, 'joaquinca@gmail.com', 'activo', '2021-10-17', '13:30:00', 'Escucha!!', 'Joaquim Carvajal', 2147483647),
(6, 'Mejora tu actitud', 1224213722, 'jenniahn@gmail.com', 'activo', '2021-11-29', '15:00:00', 'Actitud', 'Jennifer Ahmed', 2147483647),
(7, 'Aumenta tu autoestima', 1189947234, 'annmuriel@gmail.com', 'activo', '2022-01-08', '08:30:00', 'Autoestima', 'Anna Muriel', 2147483647),
(8, 'La importancia del trabajo en equipo', 1337940113, 'domingca@gmail.com', 'activo', '2021-10-17', '09:45:00', 'el trabajo en equipo', 'Domingo Camacho', 2147483647),
(9, 'Como expresar tu idea de una mejora manera', 1358276900, 'joaquinca@gmail.com', 'activo', '2021-11-29', '13:30:00', 'Expresa tus ideas', 'Joaquim Carvajal', 2147483647),
(10, 'La importancia de la organización a la hora de trabajar', 1381892029, 'jenniahn@gmail.com', 'activo', '2022-01-08', '15:00:00', 'organización en el trabajo', 'Jennifer Ahmed', 2147483647),
(11, 'la importancia de escuchar', 1566775967, 'peteriba@gmail.com', 'activo', '2021-10-17', '08:30:00', 'Escucha!!', 'Peter Ibañez', 2147483647),
(12, 'La actitud y la aptitud', 1324910786, 'mnugran@gmail.com', 'activo', '2021-11-29', '09:45:00', 'Diferencias entre aptitud y actitud', 'Manuel Grande', 2147483647);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `computador`
--

CREATE TABLE `computador` (
  `id_computador` int(11) NOT NULL,
  `color` varchar(20) DEFAULT NULL,
  `descripcion` varchar(250) DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL,
  `id_usuarios` int(11) DEFAULT NULL,
  `marca` varchar(50) DEFAULT NULL,
  `modelo` varchar(30) DEFAULT NULL,
  `id_inventario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `computador`
--

INSERT INTO `computador` (`id_computador`, `color`, `descripcion`, `estado`, `id_usuarios`, `marca`, `modelo`, `id_inventario`) VALUES
(2, 'Azul', 'Indisponible', 'activo', 1, 'HP Pavilion', '15-cw1012la', 2),
(3, 'Blanco', 'Disponible', 'activo', 1, 'Acer AS 3', '3-A315-51-30C', 2),
(4, 'Negro', 'Indisponible', 'activo', 1, 'HP', '14-bs006la', 2),
(5, 'Negro', 'Disponible', 'activo', 1, 'Acer Aspire 3', '3-A315', 2),
(6, 'Morado', 'Indisponible', 'activo', 1, 'Lenovo YOG', '730-12lKb', 2),
(8, 'Morado', 'Disponible', 'activo', 1, 'Acer', '3-A315-51-30C', 2),
(10, 'Negro', 'Indisponible', 'activo', 1, 'Aspire 3', '3-A315', 2),
(11, 'Rojo', 'Disponible', 'activo', 1, 'Lenovo', '730', 2),
(20, 'Negro', 'Disponible', 'activo', 1, 'Aspire 1', '3-A315', 2),
(22, 'Azul', 'Indisponible', 'inactivo', 0, 'hp', 'rds2', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `developer_tutorial`
--

CREATE TABLE `developer_tutorial` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `ciudad` varchar(50) NOT NULL,
  `estado` varchar(50) NOT NULL,
  `rol` varchar(50) NOT NULL,
  `celular` bigint(50) NOT NULL,
  `clave` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `developer_tutorial`
--

INSERT INTO `developer_tutorial` (`id`, `nombre`, `direccion`, `ciudad`, `estado`, `rol`, `celular`, `clave`) VALUES
(1, 'Sara Leon', 'Calle 123', 'Bogota', 'activo', 'empleado', 312784, '123456'),
(2, 'Andres Medina', 'Calle 183', 'Cali', 'activo', 'administrador', 321762, '345213'),
(3, 'Lorena Mora', 'Calle2', 'Bogot�', 'activo', 'cliente', 321456, '12345'),
(4, 'Kevin Pinilla', 'Calle3', 'Cali', 'activo', 'cliente', 3232456, '54321');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entregables`
--

CREATE TABLE `entregables` (
  `id_entregables` int(11) NOT NULL,
  `fecha_entrega` date DEFAULT NULL,
  `formato` tinyblob DEFAULT NULL,
  `hora_entrega` time DEFAULT NULL,
  `id_actividad` int(11) DEFAULT NULL,
  `id_usuario` int(11) NOT NULL,
  `estado` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE `inscripcion` (
  `id_inscripcion` int(11) NOT NULL,
  `area_empresarial` varchar(30) DEFAULT NULL,
  `dni_empleado` int(11) DEFAULT NULL,
  `genero` varchar(10) DEFAULT NULL,
  `nombre_empleado` varchar(50) DEFAULT NULL,
  `id_capacitacion` int(11) DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `insumos`
--

CREATE TABLE `insumos` (
  `id_insumo` int(11) NOT NULL,
  `cantidad_disponible` int(10) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL,
  `id_proveedor` int(11) DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `nombre_insumo` varchar(15) DEFAULT NULL,
  `id_inventario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `insumos`
--

INSERT INTO `insumos` (`id_insumo`, `cantidad_disponible`, `descripcion`, `estado`, `id_proveedor`, `id_usuario`, `nombre_insumo`, `id_inventario`) VALUES
(1, 100, 'Disponible', 'inactivo', 1, 1, 'Acetona', 1),
(3, 238, 'Disponible', 'activo', 1, 1, 'Benceno', 1),
(4, 2, 'Agotado', 'activo', 7, 7, 'Amoniaco', 1),
(5, 150, 'Disponible', 'activo', 1, 1, 'Monoxido', 1),
(6, 0, 'Agotado', 'activo', 7, 7, 'Cloro', 1),
(7, 98, 'Disponible', 'activo', 1, 1, 'Formaldehido', 1),
(8, 7, 'Agotado', 'activo', 7, 7, 'Sulfuro', 1),
(9, 156, 'Disponible', 'activo', 1, 1, 'Hidroxido', 1),
(10, 12, 'Agotado', 'activo', 7, 7, 'Acidos', 1),
(11, 220, 'Disponible', 'activo', 1, 1, 'Tolueno', 1),
(12, 1, 'Agotado', 'activo', 7, 7, 'Alcohol', 1),
(13, 300, 'Disponible', 'activo', 1, 1, 'Eter', 1),
(14, 0, 'Agotado', 'activo', 7, 7, 'Marmol', 1),
(15, 821, 'Disponible', 'activo', 1, 1, 'Silice', 1),
(16, 5, 'Agotado', 'activo', 7, 7, 'Alumina', 1),
(17, 111, 'Disponible', 'activo', 1, 1, 'Cal viva', 1),
(18, 3, 'Agotado', 'activo', 7, 7, 'Polio', 1),
(19, 6, 'Agotado', 'activo', 7, 7, 'Poliotileno', 1),
(20, 0, 'Agotado', 'activo', 7, 7, 'Bases liquidas', 1),
(21, 180, 'Disponible', 'activo', NULL, 0, 'Bases', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventarios`
--

CREATE TABLE `inventarios` (
  `id_inventario` int(11) NOT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `nombre_inventario` varchar(15) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `inventarios`
--

INSERT INTO `inventarios` (`id_inventario`, `id_usuario`, `nombre_inventario`, `stock`) VALUES
(1, 1, 'Insumos', 20),
(2, 2, 'Computadores', 20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE `pedidos` (
  `id_pedido` int(11) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `detalle_pedido` varchar(60) DEFAULT NULL,
  `fecha_pedido` date DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `precio_pedido` int(11) DEFAULT NULL,
  `nombre_insumo` varchar(50) DEFAULT NULL,
  `estado` varchar(20) NOT NULL,
  `id_insumo` int(11) DEFAULT NULL,
  `id_proveedor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`id_pedido`, `cantidad`, `detalle_pedido`, `fecha_pedido`, `id_usuario`, `precio_pedido`, `nombre_insumo`, `estado`, `id_insumo`, `id_proveedor`) VALUES
(1, 421, 'No renovado', NULL, 0, 10299, 'Alcohol', 'activo', NULL, 1),
(2, 728, 'No renovado', NULL, 0, 9188, 'Polio', 'activo', NULL, 2),
(3, 900, 'Renovado', NULL, 0, 12300, 'Formaldehido', 'activo', NULL, 7),
(4, 51, 'Renovado', NULL, 0, 7199, 'Cloro', 'activo', NULL, 2),
(5, 9188, 'Renovado', NULL, 0, 16277, 'Bases', 'activo', NULL, 3),
(6, 817, 'No renovado', NULL, 0, 192888, 'Tolueno', 'activo', NULL, 6),
(7, 28, 'No renovado', NULL, 0, 19000, 'Benceno', 'activo', NULL, 6),
(8, 291, 'Renovado', NULL, 0, 18277, 'Silice', 'activo', NULL, 1),
(9, 12, 'Renovado', NULL, 0, 20000, 'Aceite', 'activo', NULL, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `permiso_acceso`
--

CREATE TABLE `permiso_acceso` (
  `id_permiso` int(11) NOT NULL,
  `acceso` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

CREATE TABLE `prestamos` (
  `id_prestamo` int(11) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `detalle` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `nombres_usuario` varchar(50) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `estado` varchar(20) NOT NULL,
  `id_computador` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `prestamos`
--

INSERT INTO `prestamos` (`id_prestamo`, `cantidad`, `detalle`, `email`, `fecha`, `id_usuario`, `nombres_usuario`, `telefono`, `estado`, `id_computador`) VALUES
(1, 1, 'Computador entregado\r\n', 'carmisabe@gmail.com', '2022-04-01', 2, 'Carmina Sabater Estevez', '2233797', 'aceptado', 2),
(6, 1, 'No entregado', 'lore@gmail.com', NULL, 23, 'Lorena Mora', '23456765', 'aceptado', 6),
(7, 1, 'No entregado', 'sandra@gmail.com', NULL, 45, 'Sandra Camila', '23456765', 'rechazado', 10),
(9, 1, 'No entregado', 'sandra@gmail.com', NULL, 23, 'Lorena Mora', '23456765', 'aceptado', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `id_proveedor` int(11) NOT NULL,
  `estado` varchar(20) DEFAULT NULL,
  `nombre_proveedor` varchar(25) DEFAULT NULL,
  `correo_proveedor` varchar(50) NOT NULL,
  `telefono` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`id_proveedor`, `estado`, `nombre_proveedor`, `correo_proveedor`, `telefono`) VALUES
(1, 'inactivo', 'Tatiana Romero', 'tati@gmail.com', 312675487),
(2, 'inactivo', 'Roberto Carlos', 'robert@gmail.com', 917264432),
(3, 'inactivo', 'Sofia Muñoz', 'sofi@gmail.com', 916287165),
(4, 'inactivo', 'Pablo Torres', 'pablo@gmail.com', 356927164),
(5, 'inactivo', 'Santiago Serrano', 'santip@gmail.com', 826179823),
(6, 'inactivo', 'Antonio Rivas', 'ant@gmail.com', 183768971),
(7, 'inactivo', 'Alejandro Tivate', 'alejot@gmail.com', 285981275),
(8, 'inactivo', 'Daniel Molina', 'daniel@gmail.com', 982547826),
(9, 'inactivo', 'lorena bibiana', 'angelapl@gmail.com', 3195);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `id_rol` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `nom_rol` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`id_rol`, `descripcion`, `estado`, `nom_rol`) VALUES
(1, 'Usuario con todos los permisos del sistema', 'activo', 'ADMINISTRADOR'),
(2, 'Usuario con permisos de lectura o consulta', 'activo', 'EMPLEADO'),
(3, 'Usuario con todos los permisos de las tablas de actividad laboral que puede asignar actividades a los empleados', 'activo', 'JEFE DE AREA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol_permiso`
--

CREATE TABLE `rol_permiso` (
  `id_rol` int(11) NOT NULL,
  `id_permiso` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `solicitudes`
--

CREATE TABLE `solicitudes` (
  `id_solicitud` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL,
  `estado1` varchar(25) DEFAULT NULL,
  `prioridad` varchar(25) DEFAULT NULL,
  `rol_id_rol` int(11) DEFAULT NULL,
  `fecha_de_solicitud` date DEFAULT NULL,
  `tipo_incidente` varchar(25) DEFAULT NULL,
  `total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `solicitudes`
--

INSERT INTO `solicitudes` (`id_solicitud`, `descripcion`, `estado`, `estado1`, `prioridad`, `rol_id_rol`, `fecha_de_solicitud`, `tipo_incidente`, `total`) VALUES
(1, 'SIN SEÑAL', 'activo', 'PENDIENTE', 'MEDIA', 0, '2022-03-11', 'RED', 1),
(2, 'ROUTER DAÑADO', 'activo', 'PENDIENTE', 'MEDIA', 1, '2022-08-19', 'RED', 1),
(3, 'FALLO EN EL DISCO DURO', 'activo', 'PENDIENTE', 'ALTA', 2, '2022-03-25', 'HARDWARE', 1),
(4, 'SEÑAL INTERMITENTE', 'activo', 'SOLUCIONADO', 'BAJA', 2, '2022-05-22', 'RED', 1),
(5, 'PANTALLA AZUL', 'activo', 'PENDIENTE', 'ALTA', 1, '2022-08-01', 'SOFTWARE', 1),
(6, 'ROUTER DESACTIVADO', 'activo', 'SOLUCIONADO', 'BAJA', 1, '2022-03-02', 'RED', 1),
(7, 'FALLA EN EL SISTEMA OPERATIVO', 'activo', 'PENDIENTE', 'ALTA', 0, '2022-01-05', 'SOFTWARE', 1),
(8, 'FALLO EN LA MEMORIA RAM', 'activo', 'PENDIENTE', 'ALTA', 2, '2022-08-22', 'HARDWARE', 1),
(9, 'NO ABREN LOS PROGRAMAS ', 'activo', 'SOLUCIONADO', 'ALTA', 1, '2022-05-20', 'SOFTWARE', 1),
(10, 'SEÑAL CAIDA', 'activo', 'SOLUCIONADO', 'BAJA', 2, '2022-03-21', 'RED', 1),
(11, 'Falla en el navegador web (no deja descargar archivos)', 'activo', 'SOLUCIONADO', 'MEDIA', 0, '2022-04-21', 'SOFTWARE', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `solicitudes_usuarios`
--

CREATE TABLE `solicitudes_usuarios` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(20) DEFAULT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `tipo_falla` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `dni` int(11) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `fecha_ingreso` date DEFAULT NULL,
  `fecha_de_nacimiento` date DEFAULT NULL,
  `horario` varchar(11) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `password` varchar(200) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `id_area` int(11) DEFAULT NULL,
  `id_calendario` int(11) DEFAULT NULL,
  `id_inventario` int(11) NOT NULL,
  `id_rol` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `dni`, `email`, `estado`, `fecha_ingreso`, `fecha_de_nacimiento`, `horario`, `nombre`, `password`, `telefono`, `tipo`, `username`, `id_area`, `id_calendario`, `id_inventario`, `id_rol`) VALUES
(1, 1000567489, 'keadpina@gmail.com', 'activo', '2022-05-01', '2003-10-30', '9 AM', 'Kevin Pinilla', '$2a$10$Oc/6oVVfBZgNpVP5oHURBuPBYmQrZT3nRG6axHh8Y/XE9UrgBiUl.', '123456778', 'ADMINISTRADOR', 'Kevin Pinilla', 1, 1, 1, 1),
(2, 1101234567, 'csanchex486@gmail.com', 'activo', '2022-04-01', '1997-05-14', '6 AM', 'Cristian Albeiro', '$2a$10$Oc/6oVVfBZgNpVP5oHURBuPBYmQrZT3nRG6axHh8Y/XE9UrgBiUl.', '3132456577', 'EMPLEADO', 'Albeiro', 2, 1, 1, 2),
(3, 23445678, 'sandraherre936@gmail.com', 'activo', '2021-12-01', '2002-05-01', '9 AM', 'Sandra Vargas', '$2a$10$Oc/6oVVfBZgNpVP5oHURBuPBYmQrZT3nRG6axHh8Y/XE9UrgBiUl.', '123456789', 'EMPLEADO', 'Sandra V', 3, 1, 1, 2),
(4, 322245564, 'est.csanchez4@smart.edu.co', 'activo', '2021-08-01', '2002-05-01', '6 AM', 'Carlos Sanchez', '$2a$10$Oc/6oVVfBZgNpVP5oHURBuPBYmQrZT3nRG6axHh8Y/XE9UrgBiUl.', '3132345676', 'JEFE DE AREA', 'Carlos S', 1, 1, 1, 3),
(5, 1002234556, 'lmora9@misena.edu.co', 'activo', '2022-05-01', '1992-05-01', '9 AM', 'Lorena Mora', '$2a$10$Oc/6oVVfBZgNpVP5oHURBuPBYmQrZT3nRG6axHh8Y/XE9UrgBiUl.', '1238765491', 'EMPLEADO', 'Lorena M', 5, 1, 1, 2),
(6, 1321223334, 'saritaleo2022@gmail.com', 'activo', '2022-01-13', '1988-05-02', '6 AM', 'Sara Leonor', '$2a$10$Oc/6oVVfBZgNpVP5oHURBuPBYmQrZT3nRG6axHh8Y/XE9UrgBiUl.', '3132454534', 'EMPLEADO', 'Sara L', 4, 1, 1, 2),
(7, 108887912, 'siahbueno19@gmail.com', 'activo', '2021-12-01', '1989-05-16', '9 AM', 'Simon Bueno', '$2a$10$Oc/6oVVfBZgNpVP5oHURBuPBYmQrZT3nRG6axHh8Y/XE9UrgBiUl.', '3142434422', 'JEFE DE AREA', 'Simon B', 5, 1, 1, 3),
(8, 1002708990, 'torrecilla@gmail.com', 'activo', '2022-05-02', '2003-05-01', '6 AM', 'Luisa Torrecilla', '$2a$10$Oc/6oVVfBZgNpVP5oHURBuPBYmQrZT3nRG6axHh8Y/XE9UrgBiUl.', '3164961456', 'EMPLEADO', 'Luisa T', 5, 1, 1, 2),
(9, 2003456667, 'arnulfoyeye3@gmail.com', 'activo', '2022-05-02', '1984-05-29', '9 AM', 'Arnulfo Perez', '$2a$10$Oc/6oVVfBZgNpVP5oHURBuPBYmQrZT3nRG6axHh8Y/XE9UrgBiUl.', '3144567890', 'EMPLEADO', 'Arnulfo P', 1, 1, 1, 2),
(10, 1000234442, 'sofialas999@gmail.com', 'activo', '2022-05-01', '1993-05-05', '6 AM', 'Sofia Lastre', '$2a$10$Oc/6oVVfBZgNpVP5oHURBuPBYmQrZT3nRG6axHh8Y/XE9UrgBiUl.', '3122345678', 'EMPLEADO', 'Sofia L', 4, 1, 1, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios_soli`
--

CREATE TABLE `usuarios_soli` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(80) DEFAULT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `tipo_falla` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_actividad`
--

CREATE TABLE `usuario_actividad` (
  `id_usuario` int(11) NOT NULL,
  `id_actividad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_capacitacion`
--

CREATE TABLE `usuario_capacitacion` (
  `id_capacitacion` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actividad_laboral`
--
ALTER TABLE `actividad_laboral`
  ADD PRIMARY KEY (`id_actividad`),
  ADD KEY `FKpoassqpehpved0u55d5u6i1xs` (`id_area`);

--
-- Indices de la tabla `agentes`
--
ALTER TABLE `agentes`
  ADD PRIMARY KEY (`id_agente`),
  ADD KEY `FKp7rw0vdvdyk3qtugyf4l7xfgf` (`rol_id_rol`);

--
-- Indices de la tabla `area_empresarial`
--
ALTER TABLE `area_empresarial`
  ADD PRIMARY KEY (`id_area`);

--
-- Indices de la tabla `calendario`
--
ALTER TABLE `calendario`
  ADD PRIMARY KEY (`id_calendario`),
  ADD KEY `FKp1gmmiddkol4fco59b8ndakqo` (`id_actividad`);

--
-- Indices de la tabla `canales`
--
ALTER TABLE `canales`
  ADD PRIMARY KEY (`id_canal`);

--
-- Indices de la tabla `capacitaciones`
--
ALTER TABLE `capacitaciones`
  ADD PRIMARY KEY (`id_capacitacion`);

--
-- Indices de la tabla `computador`
--
ALTER TABLE `computador`
  ADD PRIMARY KEY (`id_computador`),
  ADD KEY `FK4pemhd3ivxrbv18imxb9euugu` (`id_inventario`);

--
-- Indices de la tabla `entregables`
--
ALTER TABLE `entregables`
  ADD PRIMARY KEY (`id_entregables`),
  ADD KEY `FKe75rea526dsfosl7lqvek5px5` (`id_actividad`),
  ADD KEY `FK8krh0q0un89a9o4597fwpbw6w` (`id_usuario`);

--
-- Indices de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD PRIMARY KEY (`id_inscripcion`),
  ADD KEY `FKm1h8t4y6ys1mx77j0a4mifdc2` (`id_capacitacion`),
  ADD KEY `FKruuy04jmqo9dse7uefhhfifs2` (`id_usuario`);

--
-- Indices de la tabla `insumos`
--
ALTER TABLE `insumos`
  ADD PRIMARY KEY (`id_insumo`),
  ADD KEY `FKbdanv56uq5ncnoopa3oblh19s` (`id_inventario`);

--
-- Indices de la tabla `inventarios`
--
ALTER TABLE `inventarios`
  ADD PRIMARY KEY (`id_inventario`);

--
-- Indices de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`id_pedido`),
  ADD KEY `FKmjgo0vvryie5kw8bqqwq3lm90` (`id_insumo`),
  ADD KEY `FK12i3hujtnp0nondwqdmlyk374` (`id_proveedor`);

--
-- Indices de la tabla `permiso_acceso`
--
ALTER TABLE `permiso_acceso`
  ADD PRIMARY KEY (`id_permiso`);

--
-- Indices de la tabla `prestamos`
--
ALTER TABLE `prestamos`
  ADD PRIMARY KEY (`id_prestamo`),
  ADD KEY `FKa07r6v90bum8e9rljmpiuo1j1` (`id_computador`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`id_proveedor`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`id_rol`);

--
-- Indices de la tabla `rol_permiso`
--
ALTER TABLE `rol_permiso`
  ADD KEY `FK4icnmnvwp1pq2xs4qf9cyvm3o` (`id_permiso`),
  ADD KEY `FKsxc3d8lmtj7em6n8j0wl4jwco` (`id_rol`);

--
-- Indices de la tabla `solicitudes`
--
ALTER TABLE `solicitudes`
  ADD PRIMARY KEY (`id_solicitud`);

--
-- Indices de la tabla `solicitudes_usuarios`
--
ALTER TABLE `solicitudes_usuarios`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`),
  ADD KEY `FKbavkia4ti9jtx3n7msw5uswwc` (`id_area`),
  ADD KEY `FKaahpnye57deg69r7giu4kcb3p` (`id_calendario`),
  ADD KEY `FK1ow398muxrrnrmaf9nqkpj36i` (`id_inventario`),
  ADD KEY `FK5ubh1vhgk6g42j7twprjlvmpu` (`id_rol`);

--
-- Indices de la tabla `usuarios_soli`
--
ALTER TABLE `usuarios_soli`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario_actividad`
--
ALTER TABLE `usuario_actividad`
  ADD KEY `FKcid0d942cnc4u4jpjci8bq53q` (`id_actividad`),
  ADD KEY `FKd25apy1rdncuwuejtuha76vo0` (`id_usuario`);

--
-- Indices de la tabla `usuario_capacitacion`
--
ALTER TABLE `usuario_capacitacion`
  ADD KEY `FKlpwpivj655jyi7cfa61xjlrsv` (`id_usuario`),
  ADD KEY `FKeknwiawkxqjyedxxaajpy7la0` (`id_capacitacion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `actividad_laboral`
--
ALTER TABLE `actividad_laboral`
  MODIFY `id_actividad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de la tabla `agentes`
--
ALTER TABLE `agentes`
  MODIFY `id_agente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `area_empresarial`
--
ALTER TABLE `area_empresarial`
  MODIFY `id_area` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `calendario`
--
ALTER TABLE `calendario`
  MODIFY `id_calendario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `canales`
--
ALTER TABLE `canales`
  MODIFY `id_canal` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `capacitaciones`
--
ALTER TABLE `capacitaciones`
  MODIFY `id_capacitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `computador`
--
ALTER TABLE `computador`
  MODIFY `id_computador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `entregables`
--
ALTER TABLE `entregables`
  MODIFY `id_entregables` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  MODIFY `id_inscripcion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `insumos`
--
ALTER TABLE `insumos`
  MODIFY `id_insumo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `inventarios`
--
ALTER TABLE `inventarios`
  MODIFY `id_inventario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `id_pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `permiso_acceso`
--
ALTER TABLE `permiso_acceso`
  MODIFY `id_permiso` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `prestamos`
--
ALTER TABLE `prestamos`
  MODIFY `id_prestamo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `id_proveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `id_rol` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `solicitudes`
--
ALTER TABLE `solicitudes`
  MODIFY `id_solicitud` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `solicitudes_usuarios`
--
ALTER TABLE `solicitudes_usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `usuarios_soli`
--
ALTER TABLE `usuarios_soli`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `actividad_laboral`
--
ALTER TABLE `actividad_laboral`
  ADD CONSTRAINT `FKpoassqpehpved0u55d5u6i1xs` FOREIGN KEY (`id_area`) REFERENCES `area_empresarial` (`id_area`);

--
-- Filtros para la tabla `agentes`
--
ALTER TABLE `agentes`
  ADD CONSTRAINT `FKp7rw0vdvdyk3qtugyf4l7xfgf` FOREIGN KEY (`rol_id_rol`) REFERENCES `rol` (`id_rol`);

--
-- Filtros para la tabla `calendario`
--
ALTER TABLE `calendario`
  ADD CONSTRAINT `FKp1gmmiddkol4fco59b8ndakqo` FOREIGN KEY (`id_actividad`) REFERENCES `actividad_laboral` (`id_actividad`);

--
-- Filtros para la tabla `canales`
--
ALTER TABLE `canales`
  ADD CONSTRAINT `FK9tpjfdwxhbm6vlrjtvbc70lc2` FOREIGN KEY (`id_canal`) REFERENCES `solicitudes_usuarios` (`id`);

--
-- Filtros para la tabla `computador`
--
ALTER TABLE `computador`
  ADD CONSTRAINT `FK4pemhd3ivxrbv18imxb9euugu` FOREIGN KEY (`id_inventario`) REFERENCES `inventarios` (`id_inventario`);

--
-- Filtros para la tabla `entregables`
--
ALTER TABLE `entregables`
  ADD CONSTRAINT `FK8krh0q0un89a9o4597fwpbw6w` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`),
  ADD CONSTRAINT `FKe75rea526dsfosl7lqvek5px5` FOREIGN KEY (`id_actividad`) REFERENCES `actividad_laboral` (`id_actividad`);

--
-- Filtros para la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD CONSTRAINT `FKm1h8t4y6ys1mx77j0a4mifdc2` FOREIGN KEY (`id_capacitacion`) REFERENCES `capacitaciones` (`id_capacitacion`),
  ADD CONSTRAINT `FKruuy04jmqo9dse7uefhhfifs2` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`);

--
-- Filtros para la tabla `insumos`
--
ALTER TABLE `insumos`
  ADD CONSTRAINT `FKbdanv56uq5ncnoopa3oblh19s` FOREIGN KEY (`id_inventario`) REFERENCES `inventarios` (`id_inventario`);

--
-- Filtros para la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD CONSTRAINT `FK12i3hujtnp0nondwqdmlyk374` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id_proveedor`),
  ADD CONSTRAINT `FKmjgo0vvryie5kw8bqqwq3lm90` FOREIGN KEY (`id_insumo`) REFERENCES `insumos` (`id_insumo`);

--
-- Filtros para la tabla `prestamos`
--
ALTER TABLE `prestamos`
  ADD CONSTRAINT `FKa07r6v90bum8e9rljmpiuo1j1` FOREIGN KEY (`id_computador`) REFERENCES `computador` (`id_computador`);

--
-- Filtros para la tabla `rol_permiso`
--
ALTER TABLE `rol_permiso`
  ADD CONSTRAINT `FK4icnmnvwp1pq2xs4qf9cyvm3o` FOREIGN KEY (`id_permiso`) REFERENCES `permiso_acceso` (`id_permiso`),
  ADD CONSTRAINT `FKsxc3d8lmtj7em6n8j0wl4jwco` FOREIGN KEY (`id_rol`) REFERENCES `rol` (`id_rol`);

--
-- Filtros para la tabla `solicitudes_usuarios`
--
ALTER TABLE `solicitudes_usuarios`
  ADD CONSTRAINT `solicitudes_usuarios_ibfk_1` FOREIGN KEY (`id`) REFERENCES `solicitudes` (`id_solicitud`);

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `FK5ubh1vhgk6g42j7twprjlvmpu` FOREIGN KEY (`id_rol`) REFERENCES `rol` (`id_rol`),
  ADD CONSTRAINT `FKaahpnye57deg69r7giu4kcb3p` FOREIGN KEY (`id_calendario`) REFERENCES `calendario` (`id_calendario`),
  ADD CONSTRAINT `FKbavkia4ti9jtx3n7msw5uswwc` FOREIGN KEY (`id_area`) REFERENCES `area_empresarial` (`id_area`),
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`id_inventario`) REFERENCES `inventarios` (`id_inventario`);

--
-- Filtros para la tabla `usuario_actividad`
--
ALTER TABLE `usuario_actividad`
  ADD CONSTRAINT `FKcid0d942cnc4u4jpjci8bq53q` FOREIGN KEY (`id_actividad`) REFERENCES `actividad_laboral` (`id_actividad`),
  ADD CONSTRAINT `FKd25apy1rdncuwuejtuha76vo0` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`);

--
-- Filtros para la tabla `usuario_capacitacion`
--
ALTER TABLE `usuario_capacitacion`
  ADD CONSTRAINT `FKeknwiawkxqjyedxxaajpy7la0` FOREIGN KEY (`id_capacitacion`) REFERENCES `capacitaciones` (`id_capacitacion`),
  ADD CONSTRAINT `FKlpwpivj655jyi7cfa61xjlrsv` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
