/*
 Navicat Premium Dump SQL

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 90400 (9.4.0)
 Source Host           : localhost:3306
 Source Schema         : mydatabase

 Target Server Type    : MySQL
 Target Server Version : 90400 (9.4.0)
 File Encoding         : 65001

 Date: 24/09/2025 20:54:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for students
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `gender` enum('男','女') DEFAULT '男',
  `birthdate` date DEFAULT NULL,
  `enroll_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `class_id` int NOT NULL,
  `score` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `students_chk_1` CHECK ((`score` between 0 and 100))
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of students
-- ----------------------------
BEGIN;
INSERT INTO `students` (`id`, `name`, `gender`, `birthdate`, `enroll_time`, `class_id`, `score`) VALUES (1, '张三', '男', '2005-03-12', '2025-08-31 13:57:16', 1, 88.50);
INSERT INTO `students` (`id`, `name`, `gender`, `birthdate`, `enroll_time`, `class_id`, `score`) VALUES (2, '李四', '女', '2004-11-05', '2025-08-31 13:57:16', 1, 92.00);
INSERT INTO `students` (`id`, `name`, `gender`, `birthdate`, `enroll_time`, `class_id`, `score`) VALUES (3, '王五', '男', '2005-07-19', '2025-08-31 13:57:16', 2, 76.50);
INSERT INTO `students` (`id`, `name`, `gender`, `birthdate`, `enroll_time`, `class_id`, `score`) VALUES (4, '赵六', '女', '2003-09-23', '2025-08-31 13:57:16', 2, 95.50);
INSERT INTO `students` (`id`, `name`, `gender`, `birthdate`, `enroll_time`, `class_id`, `score`) VALUES (5, '钱七', '男', '2006-01-30', '2025-08-31 13:57:16', 3, 81.00);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
