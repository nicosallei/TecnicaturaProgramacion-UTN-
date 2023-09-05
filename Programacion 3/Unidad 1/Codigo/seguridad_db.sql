/*
SQLyog Community- MySQL GUI v8.21 
MySQL - 5.0.45-community-nt : Database - seguridad
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`seguridad` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `seguridad`;

/*Table structure for table `domicilio` */

DROP TABLE IF EXISTS `domicilio`;

CREATE TABLE `domicilio` (
  `id` bigint(20) NOT NULL auto_increment,
  `nombrecalle` varchar(255) default NULL,
  `numero` int(11) default NULL,
  `piso` varchar(255) default NULL,
  `departamento` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `domicilio` */

insert  into `domicilio`(`id`,`nombrecalle`,`numero`,`piso`,`departamento`) values (1,'123',123,'132','123'),(2,'456',456,'456','456'),(3,'456',456,'465','654'),(4,'777',777,'777','777');

/*Table structure for table `perfil` */

DROP TABLE IF EXISTS `perfil`;

CREATE TABLE `perfil` (
  `id` bigint(20) NOT NULL auto_increment,
  `denominacion` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `perfil` */

insert  into `perfil`(`id`,`denominacion`) values (2,'Administrador'),(3,'Solo Lectura'),(4,'Escritura');

/*Table structure for table `persona` */

DROP TABLE IF EXISTS `persona`;

CREATE TABLE `persona` (
  `id` bigint(20) NOT NULL auto_increment,
  `nombre` varchar(50) default NULL,
  `apellido` varchar(50) default NULL,
  `dni` bigint(20) default NULL,
  `iddomicilio` bigint(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `persona` */

insert  into `persona`(`id`,`nombre`,`apellido`,`dni`,`iddomicilio`) values (1,'123','132',132,1),(2,'456','456',456,2),(3,'456','465',456,3),(4,'777','777',777,4);

/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `id` bigint(20) NOT NULL auto_increment,
  `nombreusuario` varchar(100) default NULL,
  `clave` varchar(100) default NULL,
  `idpersona` bigint(20) default NULL,
  `idperfil` bigint(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `usuario` */

insert  into `usuario`(`id`,`nombreusuario`,`clave`,`idpersona`,`idperfil`) values (1,'gmagni','40bd001563085fc35165329ea1ff5c5ecbdbbeef',1,1),(2,'444','9a3e61b6bcc8abec08f195526c3132d5a4a98cc0',4,2),(3,'666','43814346e21444aaf4f70841bf7ed5ae93f55a9d',4,2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
