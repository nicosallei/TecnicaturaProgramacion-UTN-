-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-06-2023 a las 08:13:54
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sgaprog2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
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
(11111111, 'prueba 2', 'bbbbb', '2013-06-13', 'tucuman', '231541892', NULL),
(12345678, 'pedro', 'sanchez', '2013-06-13', 'San juan', '26345879', NULL),
(39768444, 'nicolas', 'sallei', '1996-06-29', 'Neuquen', '2613911245', NULL),
(45678345, 'Maria', 'Freire', '2020-06-11', 'Mendoza', '+2617564657', NULL),
(65678345, 'Jaume', 'Polo', '2020-06-11', 'Mendoza', '+2617564657', NULL),
(78465756, 'Erika', 'Poveda', '2020-06-11', 'Mendoza', '+2617564657', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carrera`
--

CREATE TABLE `carrera` (
  `car_cod` int(11) NOT NULL,
  `car_nombre` varchar(45) DEFAULT NULL,
  `car_duracion` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `carrera`
--

INSERT INTO `carrera` (`car_cod`, `car_nombre`, `car_duracion`) VALUES
(32, 'Ciencias De La Computacion', '5 Años'),
(323, 'Ingenieria Civil', '5 Años'),
(546, 'Licenciatura en Higiene y Seguridad', '2 Años'),
(5464, 'Licenciatura en Enología', '2 Años'),
(35464, 'Tec. Superior en Programación', '2 Años');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cursado`
--

CREATE TABLE `cursado` (
  `cur_alu_dni` int(11) NOT NULL,
  `cur_mat_cod` int(11) NOT NULL,
  `cur_nota` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cursado`
--

INSERT INTO `cursado` (`cur_alu_dni`, `cur_mat_cod`, `cur_nota`) VALUES
(11111111, 15, 2),
(11111111, 137, 1),
(12345678, 12, 7),
(39768444, 137, 10),
(45678345, 134, 10),
(78465756, 134, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE `inscripcion` (
  `insc_cod` int(11) NOT NULL,
  `insc_nombre` varchar(45) DEFAULT NULL,
  `insc_fecha` date DEFAULT NULL,
  `insc_car_cod` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `inscripcion`
--

INSERT INTO `inscripcion` (`insc_cod`, `insc_nombre`, `insc_fecha`, `insc_car_cod`) VALUES
(1123, 'Joseba Infante', '2020-06-12', 5464),
(4432, 'Rut Romera', '2020-06-12', 32);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `mat_cod` int(11) NOT NULL,
  `mat_nombre` varchar(45) DEFAULT NULL,
  `mat_prof_dni` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`mat_cod`, `mat_nombre`, `mat_prof_dni`) VALUES
(1, 'Deporte', NULL),
(12, 'Lengua', NULL),
(15, 'Arquitectura', NULL),
(134, 'Matematica', 35112416),
(137, 'Fisica Nuclear', 47118211),
(255, 'prueba', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesor` (
  `prof_dni` int(11) NOT NULL,
  `prof_nombre` varchar(45) DEFAULT NULL,
  `prof_apellido` varchar(45) DEFAULT NULL,
  `prof_fec_nac` varchar(45) DEFAULT NULL,
  `prof_domicilio` varchar(45) DEFAULT NULL,
  `prof_telefono` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`prof_dni`, `prof_nombre`, `prof_apellido`, `prof_fec_nac`, `prof_domicilio`, `prof_telefono`) VALUES
(35112416, 'Maximino', 'De La Fuente', '2020-06-17', 'Neuquen', '+235854732'),
(47112111, 'Geronimo', 'Chen', '2020-06-17', 'Neuquen', '+235854732'),
(47118211, 'Ernesto', 'Vera', '2020-06-17', 'Neuquen', '+235854732'),
(47118232, 'Eloi', 'Arjona', '2020-06-17', 'Neuquen', '+235854732'),
(47238232, 'Marcos', 'Dionisio', '2020-06-17', 'Neuquen', '+235854732'),
(47238432, 'Daniel', 'Aroca', '2020-06-17', 'Neuquen', '+235854732');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`alu_dni`),
  ADD UNIQUE KEY `alu_dni_UNIQUE` (`alu_dni`),
  ADD KEY `FK_inscripcion_idx` (`alu_insc_cod`);

--
-- Indices de la tabla `carrera`
--
ALTER TABLE `carrera`
  ADD PRIMARY KEY (`car_cod`);

--
-- Indices de la tabla `cursado`
--
ALTER TABLE `cursado`
  ADD PRIMARY KEY (`cur_alu_dni`,`cur_mat_cod`),
  ADD KEY `FK_materia_idx` (`cur_mat_cod`) USING BTREE;

--
-- Indices de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD PRIMARY KEY (`insc_cod`),
  ADD KEY `FK_carrera_idx` (`insc_car_cod`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`mat_cod`),
  ADD KEY `FK_profesor_idx` (`mat_prof_dni`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD PRIMARY KEY (`prof_dni`);

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
  ADD CONSTRAINT `cursado_ibfk_2` FOREIGN KEY (`cur_mat_cod`) REFERENCES `materia` (`mat_cod`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `cursado_ibfk_3` FOREIGN KEY (`cur_alu_dni`) REFERENCES `alumno` (`alu_dni`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD CONSTRAINT `FK_carrera` FOREIGN KEY (`insc_car_cod`) REFERENCES `carrera` (`car_cod`) ON DELETE SET NULL ON UPDATE SET NULL;

--
-- Filtros para la tabla `materia`
--
ALTER TABLE `materia`
  ADD CONSTRAINT `FK_profesor` FOREIGN KEY (`mat_prof_dni`) REFERENCES `profesor` (`prof_dni`) ON DELETE SET NULL ON UPDATE SET NULL;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
