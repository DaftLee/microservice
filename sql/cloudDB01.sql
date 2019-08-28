drop database if EXISTS cloudDB01;
create database cloudDB01;
USE cloudDB01;
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `deptno` bigint(16) NOT NULL AUTO_INCREMENT,
  `dname` varchar(55),
  `db_source` varchar(255),
  PRIMARY KEY (`deptno`)
) ENGINE = InnoDB CHARACTER SET = utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept`(dname,db_source) VALUES ('开发部', DATABASE());
INSERT INTO `dept`(dname,db_source) VALUES ('人事部', DATABASE());
INSERT INTO `dept`(dname,db_source) VALUES ('财务部', DATABASE());
INSERT INTO `dept`(dname,db_source) VALUES ('市场部', DATABASE());
INSERT INTO `dept`(dname,db_source) VALUES ('运维部', DATABASE());