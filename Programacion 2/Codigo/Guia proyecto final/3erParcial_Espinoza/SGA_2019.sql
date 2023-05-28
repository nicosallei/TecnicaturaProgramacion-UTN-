/*
SQLyog Ultimate v9.02 
MySQL - 5.6.17 : Database - SGA_2019
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`SGA_2019` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci */;

USE `SGA_2019`;

/*Table structure for table `Alumno` */

DROP TABLE IF EXISTS `Alumno`;

CREATE TABLE `Alumno` (
  `dni_alu` bigint(10) unsigned NOT NULL,
  `nombre_alu` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `ape_alu` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `domic_alu` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tel_alu` varchar(30) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`dni_alu`),
  CONSTRAINT `FK_Alumno1` FOREIGN KEY (`dni_alu`) REFERENCES `Nota` (`dni_alu_not`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `Alumno` */

insert  into `Alumno`(`dni_alu`,`nombre_alu`,`ape_alu`,`domic_alu`,`tel_alu`) values (17987654,'Eloisa','Carrizo','Las Heras 638','+542616667898'),(23909090,'Silvina','Martin','Las Heras 232','+542613456799'),(34747593,'Dulce','Espinoza','Mendoza 989','+542614567389'),(36859930,'Rocio','Espinoza','Mendoza 324','+542613867479'),(37413456,'Gonzalo','Christol','Las Heras 2654','+542615656678'),(38098567,'Emma','Nespolo','Las Heras 2354','+542616765432'),(40987654,'Faustino','Lillo','Godoy Cruz','+542615678888'),(45678901,'Benjamin','Planinsek','Lujan 2342','+542615678990');

/*Table structure for table `Materia` */

DROP TABLE IF EXISTS `Materia`;

CREATE TABLE `Materia` (
  `cod_mat` int(5) NOT NULL AUTO_INCREMENT,
  `descr_mat` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `can_hor_mat` int(2) DEFAULT NULL,
  `dni_prof_mat` bigint(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`cod_mat`),
  KEY `FK_Materia` (`dni_prof_mat`),
  CONSTRAINT `FK_Materia` FOREIGN KEY (`dni_prof_mat`) REFERENCES `Profesor` (`dni_prof`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `Materia` */

insert  into `Materia`(`cod_mat`,`descr_mat`,`can_hor_mat`,`dni_prof_mat`) values (37,'Publicidad',4,12931134),(38,'Fundamentos',4,11413117),(43,'Geometria',3,23567894),(44,'Estadistica',3,20987654),(45,'Geografia',5,11413117),(46,'Programacion',4,23567894);

/*Table structure for table `Nota` */

DROP TABLE IF EXISTS `Nota`;

CREATE TABLE `Nota` (
  `dni_alu_not` bigint(10) unsigned NOT NULL,
  `cod_mat_not` int(5) NOT NULL,
  `nota_not` int(2) DEFAULT NULL,
  PRIMARY KEY (`dni_alu_not`,`cod_mat_not`),
  KEY `FK_Nota` (`cod_mat_not`),
  CONSTRAINT `FK_Nota` FOREIGN KEY (`cod_mat_not`) REFERENCES `Materia` (`cod_mat`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `Nota` */

insert  into `Nota`(`dni_alu_not`,`cod_mat_not`,`nota_not`) values (17987654,38,9),(23909090,37,5),(23909090,38,9),(23909090,44,7),(34747593,38,10),(34747593,43,6),(34747593,45,7),(36859930,37,5),(36859930,38,5),(36859930,43,5),(37413456,38,7),(37413456,45,9),(38098567,37,7);

/*Table structure for table `Profesor` */

DROP TABLE IF EXISTS `Profesor`;

CREATE TABLE `Profesor` (
  `dni_prof` bigint(10) unsigned NOT NULL,
  `nom_prof` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `ape_prof` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `domic_prof` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tel_prof` varchar(30) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`dni_prof`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `Profesor` */

insert  into `Profesor`(`dni_prof`,`nom_prof`,`ape_prof`,`domic_prof`,`tel_prof`) values (11413117,'Carlos','Espinoza','Mendoza 345','+542616603997'),(12931134,'Silvia','Angeli','Mendoza 7878','+542616804698'),(20987654,'Jimena','Torres','Maipu 654','+542614543224'),(23567894,'Rodrigo','Gonzalez','Maipu 3245','+542613671245'),(25987654,'Gabriela','Blanco','Guaymallen 234','+542615767676');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
