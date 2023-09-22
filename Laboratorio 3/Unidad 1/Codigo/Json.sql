/*
SQLyog Community v13.2.0 (64 bit)
MySQL - 8.1.0 : Database - json
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`json` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `json`;

/*Table structure for table `escritor` */

DROP TABLE IF EXISTS `escritor`;

CREATE TABLE `escritor` (
  `id` int NOT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `dni` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `escritor` */

insert  into `escritor`(`id`,`apellido`,`nombre`,`dni`) values 
(1,'García Márquez','Gabriel','1234567890');

/*Table structure for table `libro` */

DROP TABLE IF EXISTS `libro`;

CREATE TABLE `libro` (
  `nombre` varchar(100) DEFAULT NULL,
  `anio_publicacion` int DEFAULT NULL,
  `editorial` varchar(100) DEFAULT NULL,
  `idEscritor` int DEFAULT NULL,
  KEY `libro_ibfk_1` (`idEscritor`),
  CONSTRAINT `libro_ibfk_1` FOREIGN KEY (`idEscritor`) REFERENCES `escritor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `libro` */

insert  into `libro`(`nombre`,`anio_publicacion`,`editorial`,`idEscritor`) values 
('probando',1997,'Editorial Xx',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
