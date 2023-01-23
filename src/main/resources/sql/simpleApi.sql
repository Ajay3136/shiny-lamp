--
-- Current Database: `test_db`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `test_db`;

USE `seniorcaredev`;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `login` varchar(50) DEFAULT NULL,
  `password_hash` varchar(60) NOT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `email` varchar(191) DEFAULT NULL,
  `activated` varchar(1) NOT NULL DEFAULT '0',
  `created_date` timestamp NULL DEFAULT NULL,
  `last_modified_by` varchar(50) DEFAULT NULL,
  `last_modified_date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ux_user_email` (`email`),
  UNIQUE KEY `ux_user_login` (`login`)
) ENGINE=InnoDB AUTO_INCREMENT=5;