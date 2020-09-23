/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.40 : Database - ry
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `y_accompany` */

DROP TABLE IF EXISTS `y_accompany`;

CREATE TABLE `y_accompany` (
  `aid` int(30) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `pid` int(30) DEFAULT NULL COMMENT '患者ID',
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(30) DEFAULT NULL COMMENT '性别',
  `age` int(30) DEFAULT NULL COMMENT '年龄',
  `idcard` varchar(100) DEFAULT NULL COMMENT '身份证号码',
  `census` varchar(100) DEFAULT NULL COMMENT '户籍所在省市区',
  `phone` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `identity` varchar(50) DEFAULT NULL COMMENT '身份',
  `healthCode` varchar(50) DEFAULT NULL COMMENT '健康码',
  `nat` varchar(50) DEFAULT NULL COMMENT '核酸检测',
  `status` varchar(50) DEFAULT NULL COMMENT '陪护状态',
  `operPerson` varchar(50) DEFAULT NULL COMMENT '操作人员',
  `operDate` datetime DEFAULT NULL COMMENT '操作时间',
  `remarks` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='陪护信息登记表';

/*Data for the table `y_accompany` */

insert  into `y_accompany`(`aid`,`pid`,`name`,`sex`,`age`,`idcard`,`census`,`phone`,`identity`,`healthCode`,`nat`,`status`,`operPerson`,`operDate`,`remarks`) values (12,19,'王五','0',19,'350522199104103865','福建省泉州市泉港区','13287494365','1','L','阴性','0','若兰','2020-06-28 12:05:09',NULL),(13,19,'赵六','1',22,'350521199904157649','福建省厦门市思明区','13356986436','1','H','阳性','2','若兰','2020-06-28 12:05:13',NULL),(14,19,'钱七','0',32,'350543188765487654','福建省福州市仓山区','15376487125','1','L','阴性','1','若兰','2020-06-23 15:27:40','补办'),(15,20,'孙八','1',27,'350521199904153649','福建省泉州市泉港区','13387695876','1','L','阴性','2','若兰','2020-06-23 15:32:37',NULL);

/*Table structure for table `y_accompany_modify` */

DROP TABLE IF EXISTS `y_accompany_modify`;

CREATE TABLE `y_accompany_modify` (
  `id` int(30) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `modifyID` int(30) DEFAULT NULL COMMENT '修改对象的ID',
  `field` varchar(50) DEFAULT NULL COMMENT '修改的字段',
  `before` varchar(50) DEFAULT NULL COMMENT '修改前',
  `after` varchar(50) DEFAULT NULL COMMENT '修改后',
  `operPerson` varchar(50) DEFAULT NULL COMMENT '操作人员',
  `operDate` datetime DEFAULT NULL COMMENT '操作时间',
  `remarks` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='陪护信息修改表';

/*Data for the table `y_accompany_modify` */

/*Table structure for table `y_account` */

DROP TABLE IF EXISTS `y_account`;

CREATE TABLE `y_account` (
  `id` int(30) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `username` varchar(50) DEFAULT NULL COMMENT '账号',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `staffID` int(30) DEFAULT NULL COMMENT '职工表的id',
  `operPerson` varchar(50) DEFAULT NULL COMMENT '操作人员',
  `operDate` varchar(50) DEFAULT NULL COMMENT '操作时间',
  `remarks` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `FK_y_account` (`staffID`),
  CONSTRAINT `FK_y_account` FOREIGN KEY (`staffID`) REFERENCES `y_staff` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户表';

/*Data for the table `y_account` */

/*Table structure for table `y_nucleate` */

DROP TABLE IF EXISTS `y_nucleate`;

CREATE TABLE `y_nucleate` (
  `nid` int(30) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `sampleNo` varchar(50) DEFAULT NULL COMMENT '样本编号',
  `source` varchar(50) DEFAULT NULL COMMENT '来源',
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(30) DEFAULT NULL COMMENT '性别',
  `age` int(30) DEFAULT NULL COMMENT '年龄',
  `idcard` varchar(100) DEFAULT NULL COMMENT '身份证号码',
  `census` varchar(100) DEFAULT NULL COMMENT '户籍所在省市区',
  `phone` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `identity` varchar(50) DEFAULT NULL COMMENT '身份',
  `sampleDate` datetime DEFAULT NULL COMMENT '采样日期',
  `checkInfo` varchar(50) DEFAULT NULL COMMENT '检查情况（血液，脆片）',
  `track` varchar(50) DEFAULT NULL COMMENT '活动轨迹',
  `attackDate` date DEFAULT NULL COMMENT '发病日期',
  `sampleType` varchar(50) DEFAULT NULL COMMENT '标本类型',
  `sampleScore` varchar(50) DEFAULT NULL COMMENT '标本份数',
  `screenResult` varchar(50) DEFAULT NULL COMMENT '筛检结果',
  `resultDate` datetime DEFAULT NULL COMMENT '结果日期',
  `cost` varchar(50) DEFAULT NULL COMMENT '检测费用',
  `operPerson` varchar(50) DEFAULT NULL COMMENT '操作人员',
  `operDate` datetime DEFAULT NULL COMMENT '操作时间',
  `remarks` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='核酸检测登记表';

/*Data for the table `y_nucleate` */

insert  into `y_nucleate`(`nid`,`sampleNo`,`source`,`name`,`sex`,`age`,`idcard`,`census`,`phone`,`identity`,`sampleDate`,`checkInfo`,`track`,`attackDate`,`sampleType`,`sampleScore`,`screenResult`,`resultDate`,`cost`,`operPerson`,`operDate`,`remarks`) values (3,'QYY20200610001','外二住院','刘水清','0',60,'350521195910157093','福建省泉州市泉港区','15060840216','0','2020-06-09 09:43:31','无','泉港',NULL,'鼻咽拭子','1份',NULL,NULL,'0元','若依','2020-06-28 11:37:54',NULL),(5,'H306115','复工','陈龙辉','0',58,'350521196311047030','福建省泉州市泉港区','15880796758','2','2020-06-07 11:34:51','无','泉港','2020-06-03','鼻咽拭子','1份',NULL,'2020-06-13 11:34:51','0元','若依','2020-06-28 11:37:44',NULL);

/*Table structure for table `y_nucleate_modify` */

DROP TABLE IF EXISTS `y_nucleate_modify`;

CREATE TABLE `y_nucleate_modify` (
  `id` int(30) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `modifyID` int(30) DEFAULT NULL COMMENT '修改对象的ID',
  `field` varchar(50) DEFAULT NULL COMMENT '修改的字段',
  `before` varchar(50) DEFAULT NULL COMMENT '修改前',
  `after` varchar(50) DEFAULT NULL COMMENT '修改后',
  `operPerson` varchar(50) DEFAULT NULL COMMENT '操作人员',
  `operDate` varchar(50) DEFAULT NULL COMMENT '操作时间',
  `remarks` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='修改表';

/*Data for the table `y_nucleate_modify` */

/*Table structure for table `y_office` */

DROP TABLE IF EXISTS `y_office`;

CREATE TABLE `y_office` (
  `id` int(30) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `designation` varchar(50) DEFAULT NULL COMMENT '科室名称',
  `category` varchar(50) DEFAULT NULL COMMENT '科室类别',
  `operPerson` varchar(50) DEFAULT NULL COMMENT '操作人员',
  `operDate` varchar(50) DEFAULT NULL COMMENT '操作时间',
  `remarks` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='科室表';

/*Data for the table `y_office` */

/*Table structure for table `y_patieninfo_modify` */

DROP TABLE IF EXISTS `y_patieninfo_modify`;

CREATE TABLE `y_patieninfo_modify` (
  `id` int(30) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `modifyID` int(30) DEFAULT NULL COMMENT '修改对象的ID',
  `field` varchar(50) DEFAULT NULL COMMENT '修改的字段',
  `before` varchar(50) DEFAULT NULL COMMENT '修改前',
  `after` varchar(50) DEFAULT NULL COMMENT '修改后',
  `operPerson` varchar(50) DEFAULT NULL COMMENT '操作人员',
  `operDate` datetime DEFAULT NULL COMMENT '操作时间',
  `remarks` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='患者信息修改表';

/*Data for the table `y_patieninfo_modify` */

/*Table structure for table `y_patient` */

DROP TABLE IF EXISTS `y_patient`;

CREATE TABLE `y_patient` (
  `id` int(30) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `pid` int(30) DEFAULT NULL COMMENT '患者ID',
  `aid` int(30) DEFAULT NULL COMMENT '陪护人ID',
  `nid` int(30) DEFAULT NULL COMMENT '核酸检测ID',
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(30) DEFAULT NULL COMMENT '性别',
  `age` int(30) DEFAULT NULL COMMENT '年龄',
  `idcard` varchar(100) DEFAULT NULL COMMENT '身份证号码',
  `census` varchar(100) DEFAULT NULL COMMENT '户籍所在省市区',
  `phone` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `identity` varchar(50) DEFAULT NULL COMMENT '身份',
  `operPerson` varchar(50) DEFAULT NULL COMMENT '操作人员',
  `operDate` datetime DEFAULT NULL COMMENT '操作时间',
  `remarks` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='病人信息表';

/*Data for the table `y_patient` */

insert  into `y_patient`(`id`,`pid`,`aid`,`nid`,`name`,`sex`,`age`,`idcard`,`census`,`phone`,`identity`,`operPerson`,`operDate`,`remarks`) values (7,19,NULL,NULL,'张三','0',32,'350521199904157649','福建省泉州市泉港区','13028754376','0','若依','2020-07-06 15:11:51',NULL),(8,20,NULL,NULL,'李四','1',26,'350543188765487654','福建省泉州市丰泽区','18975473698','0','若依','2020-06-23 15:28:14','健康出院'),(9,NULL,12,NULL,'王五','0',19,'350522199104103865','福建省泉州市泉港区','13287494365','1','若兰','2020-06-28 12:05:09',NULL),(10,NULL,13,NULL,'赵六','1',22,'350521199904157649','福建省厦门市思明区','13356986436','1','若兰','2020-06-28 12:05:13',NULL),(11,NULL,14,NULL,'钱七','0',32,'350543188765487654','福建省福州市仓山区','15376487125','1','若兰','2020-06-23 15:27:40','补办'),(12,NULL,15,NULL,'孙八','1',27,'350521199904153649','福建省泉州市泉港区','13387695876','1','若兰','2020-06-23 15:32:37',NULL),(13,NULL,NULL,3,'刘水清','0',60,'350521195910157093','福建省泉州市泉港区','15060840216','0','若依','2020-06-28 11:37:54',''),(14,NULL,NULL,5,'陈龙辉','0',58,'350521196311047030','福建省泉州市泉港区','15880796758','2','若依','2020-06-28 11:37:44',NULL);

/*Table structure for table `y_patientinfo` */

DROP TABLE IF EXISTS `y_patientinfo`;

CREATE TABLE `y_patientinfo` (
  `pid` int(30) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `ward` varchar(50) DEFAULT NULL COMMENT '病区',
  `bed` varchar(50) DEFAULT NULL COMMENT '床号',
  `number` varchar(50) DEFAULT NULL COMMENT '编号',
  `admission` varchar(50) DEFAULT NULL COMMENT '住院号',
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(30) DEFAULT NULL COMMENT '性别',
  `age` int(30) DEFAULT NULL COMMENT '年龄',
  `idcard` varchar(100) DEFAULT NULL COMMENT '身份证号码',
  `census` varchar(100) DEFAULT NULL COMMENT '户籍所在省市区',
  `phone` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `identity` varchar(50) DEFAULT NULL COMMENT '身份',
  `rDate` datetime DEFAULT NULL COMMENT '入院日期',
  `status` varchar(50) DEFAULT NULL COMMENT '状态',
  `cDate` datetime DEFAULT NULL COMMENT '出院日期',
  `operPerson` varchar(50) DEFAULT NULL COMMENT '操作人员',
  `operDate` datetime DEFAULT NULL COMMENT '操作时间',
  `remarks` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COMMENT='患者信息登记表';

/*Data for the table `y_patientinfo` */

insert  into `y_patientinfo`(`pid`,`ward`,`bed`,`number`,`admission`,`name`,`sex`,`age`,`idcard`,`census`,`phone`,`identity`,`rDate`,`status`,`cDate`,`operPerson`,`operDate`,`remarks`) values (19,'0','22','02','642794','张三','0',32,'350521199904157649','福建省泉州市泉港区','13028754376','0','2020-06-16 15:10:54','0',NULL,'若依','2020-07-06 15:11:51',NULL),(20,'3','13','04','642973','李四','1',26,'350543188765487654','福建省泉州市丰泽区','18975473698','0','2020-06-20 10:13:32','1','2020-06-22 03:13:32','若依','2020-06-23 15:28:14','健康出院');

/*Table structure for table `y_staff` */

DROP TABLE IF EXISTS `y_staff`;

CREATE TABLE `y_staff` (
  `id` int(30) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(30) DEFAULT NULL COMMENT '性别',
  `age` int(30) DEFAULT NULL COMMENT '年龄',
  `phone` varchar(50) DEFAULT NULL COMMENT '电话号码',
  `officeID` int(30) DEFAULT NULL COMMENT '科室表的id',
  `duty` varchar(50) DEFAULT NULL COMMENT '职务',
  `post` varchar(50) DEFAULT NULL COMMENT '职称',
  `operPerson` varchar(50) DEFAULT NULL COMMENT '操作人员',
  `operDate` varchar(50) DEFAULT NULL COMMENT '操作时间',
  `remarks` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `FK_y_staff` (`officeID`),
  CONSTRAINT `FK_y_staff` FOREIGN KEY (`officeID`) REFERENCES `y_office` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='职工表';

/*Data for the table `y_staff` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
