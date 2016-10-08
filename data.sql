/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.5.32 : Database - hibernate4
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hibernate4` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hibernate4`;

/*Table structure for table `acct` */

DROP TABLE IF EXISTS `acct`;

CREATE TABLE `acct` (
  `acc_id` varchar(32) NOT NULL,
  `pay_name` varchar(255) DEFAULT NULL,
  `bank_no` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`acc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `acct` */

insert  into `acct`(`acc_id`,`pay_name`,`bank_no`) values ('97ca288ef273454fa83441b3be079991','ylsn','ccba');

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
  `sid` bigint(20) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `address` */

insert  into `address`(`sid`,`name`) values (301,'上海市浦东新区张江高科');

/*Table structure for table `c3p0` */

DROP TABLE IF EXISTS `c3p0`;

CREATE TABLE `c3p0` (
  `a` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `c3p0` */

/*Table structure for table `grade` */

DROP TABLE IF EXISTS `grade`;

CREATE TABLE `grade` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `tchId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `grade` */

insert  into `grade`(`id`,`name`,`tchId`) values (1,'一年级',1),(2,'二年级',2),(3,'三年级',1);

/*Table structure for table `school` */

DROP TABLE IF EXISTS `school`;

CREATE TABLE `school` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `school` */

insert  into `school`(`id`,`name`) values (2,'蔷薇小学'),(3,'eb3d8b17c9444ca79c6b2873d0ee56b0'),(4,'3f72acd586084bc98de1616725a2b3a8'),(5,'eb2904973d1e40f1bbc75368e8b56dc2');

/*Table structure for table `sys_sequence` */

DROP TABLE IF EXISTS `sys_sequence`;

CREATE TABLE `sys_sequence` (
  `SEQUENCE_NAME` varchar(80) NOT NULL DEFAULT '',
  `NEXT_VAL` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`SEQUENCE_NAME`),
  KEY `SYS_SEQUENCE_IDX1` (`SEQUENCE_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_sequence` */

insert  into `sys_sequence`(`SEQUENCE_NAME`,`NEXT_VAL`) values ('seq_address',301),('SEQ_USER',205);

/*Table structure for table `t_stock` */

DROP TABLE IF EXISTS `t_stock`;

CREATE TABLE `t_stock` (
  `stockId` int(11) NOT NULL AUTO_INCREMENT,
  `stockCode` varchar(255) DEFAULT NULL,
  `stockName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`stockId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `t_stock` */

insert  into `t_stock`(`stockId`,`stockCode`,`stockName`) values (1,'4715','GEMN'),(3,'8888','Bezen');

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `sid` bigint(20) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `t_user` */

insert  into `t_user`(`sid`,`age`,`name`) values (4,11,'sky'),(5,11,'blue'),(6,23,'jack'),(7,12,'green');

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `createDate` date DEFAULT NULL,
  `schId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `teacher` */

insert  into `teacher`(`id`,`name`,`createDate`,`schId`) values (1,'203ff5cf0eac4fd29019b828aed132b6','2016-09-22',2);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `created` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `summary` varchar(255) DEFAULT NULL,
  `add_sid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`created`,`name`,`summary`,`add_sid`) values (1,'2016-01-01 00:00:00','sky','Today I will learn Spring Boot',NULL),(2,'2016-01-02 00:00:00','blue','Read more about Spring Boot',NULL),(3,'2016-01-04 00:00:00','scott','Spring Boot using Cloud ',NULL),(4,'2016-01-01 00:00:00','sky','Today I will learn Spring Boot',NULL),(5,'2016-01-02 00:00:00','blue','Read more about Spring Boot',NULL),(6,'2016-01-04 00:00:00','scott','Spring Boot using Cloud ',NULL),(7,'2016-01-01 00:00:00','sky','Today I will learn Spring Boot',NULL),(8,'2016-01-02 00:00:00','blue','Read more about Spring Boot',NULL),(9,'2016-01-04 00:00:00','scott','Spring Boot using Cloud ',NULL),(10,'2016-01-01 00:00:00','sky','Today I will learn Spring Boot',NULL),(11,'2016-01-02 00:00:00','blue','Read more about Spring Boot',NULL),(12,'2016-01-04 00:00:00','scott','Spring Boot using Cloud ',NULL),(13,'2016-01-01 00:00:00','sky','Today I will learn Spring Boot',NULL),(14,'2016-01-02 00:00:00','blue','Read more about Spring Boot',NULL),(15,'2016-01-04 00:00:00','scott','Spring Boot using Cloud ',NULL),(16,'2016-01-01 00:00:00','sky','Today I will learn Spring Boot',NULL),(17,'2016-01-02 00:00:00','blue','Read more about Spring Boot',NULL),(18,'2016-01-04 00:00:00','scott','Spring Boot using Cloud ',NULL),(19,'2016-01-01 00:00:00','sky','Today I will learn Spring Boot',NULL),(20,'2016-01-02 00:00:00','blue','Read more about Spring Boot',NULL),(21,'2016-01-04 00:00:00','scott','Spring Boot using Cloud ',NULL),(22,'2016-01-01 00:00:00','sky','Today I will learn Spring Boot',NULL),(23,'2016-01-02 00:00:00','blue','Read more about Spring Boot',NULL),(24,'2016-01-04 00:00:00','scott','Spring Boot using Cloud ',NULL),(25,'2016-01-01 00:00:00','sky','Today I will learn Spring Boot',NULL),(26,'2016-01-02 00:00:00','blue','Read more about Spring Boot',NULL),(27,'2016-01-04 00:00:00','scott','Spring Boot using Cloud ',NULL),(28,'2016-01-01 00:00:00','sky','Today I will learn Spring Boot',NULL),(29,'2016-01-02 00:00:00','blue','Read more about Spring Boot',NULL),(30,'2016-01-04 00:00:00','scott','Spring Boot using Cloud ',NULL),(31,'2016-01-01 00:00:00','sky','Today I will learn Spring Boot',NULL),(32,'2016-01-02 00:00:00','blue','Read more about Spring Boot',NULL),(33,'2016-01-04 00:00:00','scott','Spring Boot using Cloud ',NULL),(34,'2016-01-01 00:00:00','sky','Today I will learn Spring Boot',NULL),(35,'2016-01-02 00:00:00','blue','Read more about Spring Boot',NULL),(36,'2016-01-04 00:00:00','scott','Spring Boot using Cloud ',NULL),(37,'2016-01-01 00:00:00','sky','Today I will learn Spring Boot',NULL),(38,'2016-01-02 00:00:00','blue','Read more about Spring Boot',NULL),(39,'2016-01-04 00:00:00','scott','Spring Boot using Cloud ',NULL),(40,'2016-01-01 00:00:00','sky','Today I will learn Spring Boot',NULL),(41,'2016-01-02 00:00:00','blue','Read more about Spring Boot',NULL),(42,'2016-01-04 00:00:00','scott','Spring Boot using Cloud ',NULL),(43,'2016-01-01 00:00:00','sky','Today I will learn Spring Boot',NULL),(44,'2016-01-02 00:00:00','blue','Read more about Spring Boot',NULL),(45,'2016-01-04 00:00:00','scott','Spring Boot using Cloud ',NULL),(48,'2016-09-30 14:35:44','haha','hao hao gan',NULL),(205,'2016-09-30 15:58:22','mayun','alibaba',301);

/* Function  structure for function  `nextval` */

/*!50003 DROP FUNCTION IF EXISTS `nextval` */;
DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` FUNCTION `nextval`(seq_name VARCHAR(50)) RETURNS bigint(20)
BEGIN         
         RETURN nextvals(seq_name,1);  
END */$$
DELIMITER ;

/* Function  structure for function  `nextvals` */

/*!50003 DROP FUNCTION IF EXISTS `nextvals` */;
DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` FUNCTION `nextvals`(seq_name VARCHAR(50),seq_num bigint(10)) RETURNS bigint(20)
BEGIN  
         DECLARE value BIGINT;
         UPDATE SYS_SEQUENCE  
         SET NEXT_VAL = NEXT_VAL + seq_num  
         WHERE upper(SEQUENCE_NAME) = upper(seq_name);
         
         SELECT NEXT_VAL INTO value
         FROM SYS_SEQUENCE
         WHERE upper(SEQUENCE_NAME) = upper(seq_name); 
         RETURN value;		 
END */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
