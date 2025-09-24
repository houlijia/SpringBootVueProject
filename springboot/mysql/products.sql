CREATE TABLE IF NOT EXISTS products(
   id INT PRIMARY KEY AUTO_INCREMENT,
   name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    height INT NOT NULL,
    weight INT NOT NULL
)ENGINE=InnoDB DEFAULT;

-- ----------------------------
-- Records of products
-- ----------------------------
BEGIN;
INSERT INTO `products` (`name`, `age`, `height`, `weight`) VALUES ('侯1', 101, 201, 301);
INSERT INTO `products` (`name`, `age`, `height`, `weight`) VALUES ('侯2', 102, 202, 302);
INSERT INTO `products` (`name`, `age`, `height`, `weight`) VALUES ('侯3', 103, 203, 303);
COMMIT;
