/*
SQLyog Ultimate v9.63 
MySQL - 5.5.5-10.1.19-MariaDB : Database - mibase
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mibase` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `mibase`;

/*Table structure for table `persona` */

DROP TABLE IF EXISTS `persona`;

CREATE TABLE `persona` (
  `nombre` varchar(40) DEFAULT NULL,
  `apellido_1` varchar(40) DEFAULT NULL,
  `apellido_2` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `persona` */

insert  into `persona`(`nombre`,`apellido_1`,`apellido_2`) values ('alberto','cortez','ficarra'),('eduardo','cortez','ficarra');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
