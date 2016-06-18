CREATE DATABASE IF NOT EXISTS `bookish`;
USE `bookish`;

DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `author` varchar(255),
  `isbn` varchar(255),
  `asin` varchar(255),
  `published_at` DATE,
  PRIMARY KEY (`id`,`title`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;


CREATE USER 'bookish-admin'@'localhost' IDENTIFIED BY 'password';

GRANT ALL PRIVILEGES ON bookish . * TO 'bookish-admin'@'%' WITH GRANT OPTION;

