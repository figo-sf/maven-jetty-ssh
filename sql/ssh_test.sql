/*
Navicat MySQL Data Transfer

Source Server         : localmysql
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : ssh_test

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2017-06-26 18:06:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ssh_school
-- ----------------------------
DROP TABLE IF EXISTS `ssh_school`;
CREATE TABLE `ssh_school` (
 `school_id` int(11) DEFAULT NULL,
  `school_name` varchar(255) DEFAULT NULL,
  `school_id` (`school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ssh_school
-- ----------------------------
INSERT INTO `ssh_school` VALUES ('1', '北大');
INSERT INTO `ssh_school` VALUES ('2', '清华');

-- ----------------------------
-- Table structure for ssh_student
-- ----------------------------
DROP TABLE IF EXISTS `ssh_student`;
CREATE TABLE `ssh_student` (
 `student_id` int(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `birth` date DEFAULT NULL,
  `school_id` int(11) DEFAULT NULL,
  CONSTRAINT `school_id_fk` FOREIGN KEY (`school_id`) REFERENCES `ssh_school` (`school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ssh_student
-- ----------------------------
INSERT INTO `ssh_student` VALUES ('1', 'fir', '2017-06-05', '1');
INSERT INTO `ssh_student` VALUES ('2', 'figo', '2017-05-31', '2');
