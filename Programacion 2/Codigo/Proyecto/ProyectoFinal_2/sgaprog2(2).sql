-- phpMyAdmin SQL Dump
-- version 4.2.0
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 11-06-2023 a las 03:37:47
-- Versión del servidor: 5.6.17
-- Versión de PHP: 5.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `sgaprog2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE IF NOT EXISTS `alumno` (
  `alu_dni` int(11) NOT NULL,
  `alu_nombre` varchar(45) DEFAULT NULL,
  `alu_apellido` varchar(45) DEFAULT NULL,
  `alu_fec_nac` date DEFAULT NULL,
  `alu_domicilio` varchar(45) DEFAULT NULL,
  `alu_telefono` varchar(45) DEFAULT NULL,
  `alu_insc_cod` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`alu_dni`, `alu_nombre`, `alu_apellido`, `alu_fec_nac`, `alu_domicilio`, `alu_telefono`, `alu_insc_cod`) VALUES
(9564857, 'Rut', 'Romera', '2012-06-21', 'San Juan', '+2647564657', 4432),
(13457345, 'Carmelo', 'Del Rio', '2012-06-21', 'San Juan', '+2647564657', NULL),
(43678645, 'Joseba', 'Infante', '2020-06-11', 'Mendoza', '+2617564657', 1123);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cursado`
--

CREATE TABLE IF NOT EXISTS `cursado` (
  `cur_alu_dni` int(11) NOT NULL,
  `cur_mat_cod` int(11) DEFAULT NULL,
  `cur_nota` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cursado`
--

INSERT INTO `cursado` (`cur_alu_dni`, `cur_mat_cod`, `cur_nota`) VALUES
(9564857, 135, 8),
(78465756, 136, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE IF NOT EXISTS `materia` (
  `mat_cod` int(11) NOT NULL,
  `mat_nombre` varchar(45) DEFAULT NULL,
  `mat_prof_dni` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`mat_cod`, `mat_nombre`, `mat_prof_dni`) VALUES
(134, 'Matematica', 35112416),
(135, 'Quimica', 47112111),
(136, 'Robotica', 47112111),
(137, 'Fisica Nuclear', 47118211);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
 ADD PRIMARY KEY (`alu_dni`), ADD UNIQUE KEY `alu_dni_UNIQUE` (`alu_dni`), ADD KEY `FK_inscripcion_idx` (`alu_insc_cod`);

--
-- Indices de la tabla `cursado`
--
ALTER TABLE `cursado`
 ADD KEY `FK_materia_idx` (`cur_mat_cod`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
 ADD PRIMARY KEY (`mat_cod`), ADD KEY `FK_profesor_idx` (`mat_prof_dni`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alumno`
--
ALTER TABLE `alumno`
ADD CONSTRAINT `FK_inscripcion` FOREIGN KEY (`alu_insc_cod`) REFERENCES `inscripcion` (`insc_cod`) ON DELETE SET NULL ON UPDATE SET NULL;

--
-- Filtros para la tabla `cursado`
--
ALTER TABLE `cursado`
ADD CONSTRAINT `FK_materia` FOREIGN KEY (`cur_mat_cod`) REFERENCES `materia` (`mat_cod`) ON DELETE SET NULL ON UPDATE SET NULL;

--
-- Filtros para la tabla `materia`
--
ALTER TABLE `materia`
ADD CONSTRAINT `FK_profesor` FOREIGN KEY (`mat_prof_dni`) REFERENCES `profesor` (`prof_dni`) ON DELETE SET NULL ON UPDATE SET NULL;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
