
CREATE DATABASE /*!32312 IF NOT EXISTS*/`retail_store` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `retail_store`;

/*Table structure for table `discounts` */

DROP TABLE IF EXISTS `discounts`;

CREATE TABLE `discounts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `discount_type` varchar(45) NOT NULL,
  `discount_percentage` int(11) NOT NULL,
  `is_active` tinyint(4) NOT NULL,
  `created_on` datetime NOT NULL,
  `updated_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `discounts` */

insert  into `discounts`(`id`,`discount_type`,`discount_percentage`,`is_active`,`created_on`,`updated_on`) values (1,'EMPLOYEE',30,1,'2020-04-15 19:27:07',NULL),(2,'AFFILIATE',10,1,'2020-04-15 19:27:10',NULL),(3,'OLD_CUSTOMER',5,1,'2020-04-15 19:27:12',NULL),(4,'EVERY_100',5,1,'2020-04-15 19:27:13',NULL);

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_type_id` int(11) NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `price` decimal(3,2) NOT NULL,
  `is_active` tinyint(4) NOT NULL,
  `created_on` datetime NOT NULL,
  `updated_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_product_type_id_idx` (`product_type_id`),
  CONSTRAINT `fk_product_type_id` FOREIGN KEY (`product_type_id`) REFERENCES `product_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

/*Data for the table `product` */

insert  into `product`(`id`,`product_type_id`,`product_name`,`price`,`is_active`,`created_on`,`updated_on`) values (4,1,'Red Chilli','1.00',1,'2020-04-15 16:01:05',NULL),(5,1,'Salt','1.00',1,'2020-04-15 16:01:36',NULL),(6,1,'Pulses','9.99',1,'2020-04-15 16:02:00',NULL),(7,2,'Bed Sheet','9.99',1,'2020-04-15 16:02:19',NULL),(8,2,'Curtains','9.99',1,'2020-04-15 16:02:56',NULL),(9,2,'Carpet','9.99',1,'2020-04-15 16:03:16',NULL),(10,3,'Sofa Cover','9.99',1,'2020-04-15 16:09:59',NULL);

/*Table structure for table `product_type` */

DROP TABLE IF EXISTS `product_type`;

CREATE TABLE `product_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_type` varchar(45) NOT NULL,
  `is_active` varchar(45) NOT NULL,
  `created_on` datetime NOT NULL,
  `updated_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `product_type` */

insert  into `product_type`(`id`,`product_type`,`is_active`,`created_on`,`updated_on`) values (1,'Grocery','1','2020-04-15 12:06:47',NULL),(2,'Bedding','1','2020-06-01 12:07:08',NULL),(3,'Living Room','1','2020-04-15 12:07:27',NULL);

/*Table structure for table `shopping_cart` */

DROP TABLE IF EXISTS `shopping_cart`;

CREATE TABLE `shopping_cart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `quantity` varchar(45) NOT NULL,
  `created_on` datetime NOT NULL,
  `updated_on` datetime DEFAULT NULL,
  `is_active` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_product_id_idx` (`product_id`),
  KEY `fk_user_id_idx` (`user_id`),
  CONSTRAINT `fk_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`),
  CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=latin1;

/*Data for the table `shopping_cart` */

insert  into `shopping_cart`(`id`,`product_id`,`user_id`,`quantity`,`created_on`,`updated_on`,`is_active`) values (4,4,1,'10','2020-04-15 16:12:21',NULL,1),(5,5,1,'1','2020-04-15 16:15:49',NULL,1),(6,6,1,'1','2020-04-15 16:16:14',NULL,1),(7,7,1,'1','2020-04-15 16:17:08',NULL,1),(8,8,1,'1','2020-04-15 16:17:22',NULL,1),(9,9,1,'1','2020-04-15 16:17:31',NULL,1),(10,10,1,'1','2020-04-15 16:17:41',NULL,1),(11,4,2,'10','2020-04-15 16:12:21',NULL,1),(12,5,2,'1','2020-04-15 16:15:49',NULL,1),(13,6,2,'1','2020-04-15 16:16:14',NULL,1),(14,7,2,'1','2020-04-15 16:17:08',NULL,1),(15,8,2,'1','2020-04-15 16:17:22',NULL,1),(16,9,2,'1','2020-04-15 16:17:31',NULL,1),(17,10,2,'1','2020-04-15 16:17:41',NULL,1),(18,4,3,'10','2020-04-15 16:12:21',NULL,1),(19,5,3,'1','2020-04-15 16:15:49',NULL,1),(20,6,3,'1','2020-04-15 16:16:14',NULL,1),(21,7,3,'1','2020-04-15 16:17:08',NULL,1),(22,8,3,'1','2020-04-15 16:17:22',NULL,1),(23,9,3,'1','2020-04-15 16:17:31',NULL,1),(24,10,3,'1','2020-04-15 16:17:41',NULL,1),(25,4,4,'10','2020-04-15 16:12:21',NULL,1),(26,5,4,'1','2020-04-15 16:15:49',NULL,1),(27,6,4,'1','2020-04-15 16:16:14',NULL,1),(28,7,4,'1','2020-04-15 16:17:08',NULL,1),(29,8,4,'1','2020-04-15 16:17:22',NULL,1),(30,9,4,'1','2020-04-15 16:17:31',NULL,1),(31,10,4,'1','2020-04-15 16:17:41',NULL,1);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `user_type_id` int(11) NOT NULL,
  `is_active` varchar(45) NOT NULL,
  `created_on` datetime NOT NULL,
  `updated_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_user_type_idx` (`user_type_id`),
  CONSTRAINT `fk_user_type` FOREIGN KEY (`user_type_id`) REFERENCES `user_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`id`,`user_name`,`user_type_id`,`is_active`,`created_on`,`updated_on`) values (1,'Jacob',1,'1','2020-04-15 16:11:23',NULL),(2,'Ali',2,'1','2020-04-15 16:11:37',NULL),(3,'Fanny',3,'1','2020-04-15 16:11:56',NULL),(4,'Anum',2,'3','2017-07-15 16:21:07',NULL);

/*Table structure for table `user_type` */

DROP TABLE IF EXISTS `user_type`;

CREATE TABLE `user_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_type` varchar(45) NOT NULL,
  `is_active` tinyint(4) NOT NULL,
  `created_on` datetime NOT NULL,
  `updated_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `user_type` */

insert  into `user_type`(`id`,`user_type`,`is_active`,`created_on`,`updated_on`) values (1,'EMPLOYEE',1,'2020-04-15 19:54:30',NULL),(2,'CUSTOMER',1,'2020-04-15 19:54:34',NULL),(3,'AFFILIATE',1,'2020-04-15 19:54:39',NULL);


