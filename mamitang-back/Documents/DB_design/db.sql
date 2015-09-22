//用户表
CREATE TABLE `mamitang`.`tb_user` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `username` INT NOT NULL COMMENT '用户名，必须为手机号',
  `password` VARCHAR(32) NULL COMMENT '',
  `special_dish` VARCHAR(32) NULL COMMENT '拿手菜',
  `belong_province` INT NULL COMMENT '所属身份',
  `belong_city` INT NULL COMMENT '所属城市',
  `belong_area` INT NULL COMMENT '所属区域',
  `nickname` VARCHAR(32) NULL COMMENT '昵称',
  `headimg` VARCHAR(255) NULL COMMENT '头像地址',
  `isactive` TINYINT(2) NULL COMMENT '是否激活',
  `createtime` DATETIME NULL COMMENT '注册时间',
  `apply_status` INT NULL COMMENT '申请状态',
  PRIMARY KEY (`id`)  COMMENT '',
  INDEX `name_index` (`username` ASC)  COMMENT '');