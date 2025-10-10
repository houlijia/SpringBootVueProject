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

 Date: 24/09/2025 17:02:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `student_id` int DEFAULT NULL,
  `product` varchar(50) DEFAULT NULL,
  `amount` decimal(10,2) DEFAULT NULL,
  `order_date` date DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `student_id` (`student_id`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `students` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of orders
-- ----------------------------
BEGIN;
INSERT INTO `orders` (`order_id`, `student_id`, `product`, `amount`, `order_date`) VALUES (1, 1, '数学教材', 120.50, '2023-09-01');
INSERT INTO `orders` (`order_id`, `student_id`, `product`, `amount`, `order_date`) VALUES (2, 1, '文具套装', 45.80, '2023-10-15');
INSERT INTO `orders` (`order_id`, `student_id`, `product`, `amount`, `order_date`) VALUES (3, 2, '英语词典', 98.00, '2023-08-22');
INSERT INTO `orders` (`order_id`, `student_id`, `product`, `amount`, `order_date`) VALUES (4, 3, '实验器材', 220.00, '2023-11-03');
INSERT INTO `orders` (`order_id`, `student_id`, `product`, `amount`, `order_date`) VALUES (5, 4, '编程书籍', 78.40, '2023-10-28');
INSERT INTO `orders` (`order_id`, `student_id`, `product`, `amount`, `order_date`) VALUES (6, 5, '运动装备', 156.75, '2023-09-17');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
