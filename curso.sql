# Host: 192.168.0.253  (Version 8.0.28)
# Date: 2022-10-27 16:15:43
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "aula"
#

CREATE TABLE `aula` (
  `id_aula` int NOT NULL AUTO_INCREMENT,
  `id_aluno_fk` int DEFAULT NULL,
  `data_aula` date DEFAULT NULL,
  `hora_chegada` time DEFAULT NULL,
  `hora_saida` time DEFAULT NULL,
  `hora_de_aula` time DEFAULT NULL,
  PRIMARY KEY (`id_aula`),
  KEY `id_aluno_aula` (`id_aluno_fk`),
  CONSTRAINT `id_aluno_aula` FOREIGN KEY (`id_aluno_fk`) REFERENCES `aluno` (`id_aluno`)
) ENGINE=InnoDB AUTO_INCREMENT=10041 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

#
# Data for table "aula"
#

INSERT INTO `aula` VALUES (10001,1001,'2022-10-18','15:00:00','17:00:00','02:00:00'),(10002,1001,'2022-10-19','15:16:03','19:43:23','04:27:20'),(10003,1002,'2022-10-19','17:55:09','20:21:29','02:26:20'),(10004,1000,'2022-10-25','17:53:09','20:11:29','02:18:20'),(10005,1000,'2022-10-25','17:53:09','20:11:29','02:18:20'),(10006,1001,'2022-10-22','12:25:00','18:00:00','05:35:00'),(10007,1000,'2022-10-25','17:53:09','20:11:29','02:18:20'),(10008,1002,'2022-10-22','11:35:00','12:00:00','00:25:00'),(10009,1002,'2022-10-22','08:40:00','12:00:00','03:20:00'),(10010,1000,'2022-10-25','17:10:09','20:21:29','03:11:20'),(10011,1000,'2022-10-25','17:10:09','20:21:29','03:11:20'),(10012,1002,'2022-10-25','16:18:00','17:00:00','00:42:00'),(10013,1002,'2022-10-25','06:00:00','22:00:00','16:00:00'),(10014,1002,'2022-10-25','15:02:00','16:02:00','01:00:00'),(10015,1005,'2022-10-25','09:36:00','12:00:00','02:24:00'),(10016,1004,'2022-10-25','15:20:00','18:20:00','03:00:00'),(10017,1005,'2022-10-21','15:02:00','18:02:00','03:00:00'),(10018,1005,'2022-10-25','11:32:00','12:00:00','00:28:00'),(10019,1005,'2022-10-25','08:52:00','12:00:00','03:08:00'),(10020,1005,'2022-10-25','18:25:00','19:00:00','00:35:00'),(10021,1005,'2022-10-25','10:52:00','12:00:00','01:08:00'),(10022,1005,'2022-10-25','15:20:00','16:20:00','01:00:00'),(10023,1005,'2022-10-25','15:25:00','16:25:00','01:00:00'),(10024,1005,'2022-10-25','12:52:00','13:08:00','00:16:00'),(10025,1005,'2022-10-25','12:53:00','18:53:00','06:00:00'),(10026,1005,'2022-10-25','18:00:00','21:00:00','03:00:00'),(10027,1002,'2022-10-25','12:58:00','13:58:00','01:00:00'),(10028,1002,'2022-10-25','12:58:00','13:58:00','01:00:00'),(10029,1002,'2022-10-25','12:58:00','13:58:00','01:00:00'),(10030,1008,'2022-10-25','18:00:00','18:25:00','00:25:00'),(10031,1005,'2022-10-25','15:08:00','16:08:00','01:00:00'),(10032,1002,'2022-10-25','15:02:00','16:00:00','00:58:00'),(10033,1005,'2022-10-25','12:58:00','13:58:00','01:00:00'),(10034,1005,'2022-10-26','11:00:00','12:00:00','01:00:00'),(10035,1002,'2022-10-26','12:58:00','13:58:00','01:00:00'),(10036,1002,'2022-10-26','15:08:00','16:22:00','01:14:00'),(10037,1002,'2022-10-26','18:58:00','19:56:00','00:58:00'),(10038,1002,'2022-10-26','18:58:00','19:58:00','01:00:00'),(10039,1002,'2022-10-26','18:58:00','20:00:00','01:02:00'),(10040,1004,'2022-10-26','18:08:00','20:58:00','02:50:00');

#
# Structure for table "curso"
#

CREATE TABLE `curso` (
  `id_curso` int NOT NULL AUTO_INCREMENT,
  `nome_curso` varchar(40) NOT NULL DEFAULT '',
  `carga_horaria` time DEFAULT NULL,
  `modulo_curso` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_curso`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

#
# Data for table "curso"
#

INSERT INTO `curso` VALUES (1,'Pacote Office','54:00:00','WINDOWS + WORD + EXCEL + POWERPOINT + INTERNET'),(2,'Excel Avançado','20:00:00','EXCEL AVANÇADO'),(3,'Autocad','20:00:00','2D'),(4,'Excel VBA','20:00:00','BÁSICO + INTERMEDIÁRIO'),(5,'Lógica de programação','20:00:00','BÁSICO + INTERMEDIÁRIO'),(6,'Manuntenção de micro','34:00:00','BÁSICO + INTERMEDIÁRIO'),(7,'Pacote Office Básico Intermediário','54:00:00','WINDOWS + WORD + EXCEL + POWERPOINT + INTERNET'),(8,'JAVA I','20:00:00','BÁSICO + INTERMEDIÁRIO');

#
# Structure for table "aluno"
#

CREATE TABLE `aluno` (
  `id_aluno` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `id_curso_fk` int DEFAULT NULL,
  PRIMARY KEY (`id_aluno`),
  KEY `aluno_curso_fk` (`id_curso_fk`),
  CONSTRAINT `aluno_curso_fk` FOREIGN KEY (`id_curso_fk`) REFERENCES `curso` (`id_curso`)
) ENGINE=InnoDB AUTO_INCREMENT=1020 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

#
# Data for table "aluno"
#

INSERT INTO `aluno` VALUES (1000,'Túlio Eduardo',1),(1001,'José Luiz',2),(1002,'José Eduardo',3),(1003,'Nayde Machado',4),(1004,'Jucilene Angelo',1),(1005,'Caio Felipe',5),(1006,'Kim Eduardo',5),(1007,'Renata Santos',2),(1008,'Amanda Xavier',2),(1009,'André Lima',1),(1010,'Wladimir Martins',1),(1011,'Fernando Neto',5),(1012,'Gabriel Lisboa',6),(1013,'Rudimar Santos',2),(1014,'Gil Martins',1),(1015,'Seleny Borges',3),(1016,'Suelen Beatriz',1),(1017,'Sâmia Paulino',1),(1018,'Hugo Magalhães',3),(1019,'João Lucas',1);

#
# Structure for table "usuario"
#

CREATE TABLE `usuario` (
  `pk_id_usuario` int NOT NULL AUTO_INCREMENT,
  `usu_nome` varchar(50) DEFAULT NULL,
  `usu_login` varchar(50) DEFAULT NULL,
  `usu_senha` varchar(50) DEFAULT NULL,
  `usu_tipo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pk_id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

#
# Data for table "usuario"
#

INSERT INTO `usuario` VALUES (1,'José Luiz','luiz','1994','INSTRUTOR'),(2,'Convidado','cci','cci','RECEPÇÃO');

#consultas
