CREATE TABLE `adimin` (
  `admin-id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `group` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`admin-id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 PACK_KEYS=0;
