CREATE DATABASE board DEFAULT CHARACTER SET UTF8MB4;
USE board;

CREATE TABLE board(
B_no INT PRIMARY KEY AUTO_INCREMENT,
B_title CHAR(30),
B_time time,
B_name char(30)  NOT NULL,
B_num INT,
B_hit INT DEFAULT 0,
B_text text
);
drop table board;
INSERT INTO board(B_title,B_time,B_name,B_num,B_text) VALUE ('제목',now(),'닉네임',1,'TEXT');
SELECT * FROM board;

CREATE TABLE login(
no int primary key auto_increment, # 유저 고유 넘버
id char(30) unique, # 유저 아이디
pw char(30), # 유저 비밀번호
name char(30) # 유저 닉네임
);
SELECT * FROM login;
drop table login;