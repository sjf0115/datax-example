-- 数据库 test1
CREATE TABLE `tb_user` (
  `id` bigint NOT NULL COMMENT '主键ID',
  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `age` int DEFAULT NULL COMMENT '年龄',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`)
);

INSERT INTO tb_user VALUES (1, 'Jone', 18, 'jone@163.com');
INSERT INTO tb_user VALUES (2, 'Jack', 20, 'jack@163.com');
INSERT INTO tb_user VALUES (3, 'Tom', 28, 'tom@163.com');
INSERT INTO tb_user VALUES (4, 'Sandy', 21, 'sandy@163.com');
INSERT INTO tb_user VALUES (5, 'Billie', 24, 'billie@163.com');


--------------------------------------------------
-- 数据库 test2
drop table `tb_user`;
CREATE TABLE `tb_user` (
  `id` bigint NOT NULL COMMENT '主键ID',
  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `age` int DEFAULT NULL COMMENT '年龄',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱'
);