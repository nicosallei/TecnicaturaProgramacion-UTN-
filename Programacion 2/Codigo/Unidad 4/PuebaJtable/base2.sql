/*
SQLyog Ultimate v9.63 
MySQL - 5.5.5-10.1.19-MariaDB : Database - basegestion2
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`basegestion2` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `basegestion2`;

/*Table structure for table `persona` */

DROP TABLE IF EXISTS `persona`;

CREATE TABLE `persona` (
  `id_persona` int(11) NOT NULL AUTO_INCREMENT,
  `cuil` int(12) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_persona`),
  UNIQUE KEY `indiceCuil` (`cuil`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `persona` */

insert  into `persona`(`id_persona`,`cuil`,`nombre`,`apellido`) values (1,22,'sergio','sosa'),(2,165,'alberto','cortez'),(5,9999,'julio','boca');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
