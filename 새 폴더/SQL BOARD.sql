CREATE DATABASE board DEFAULT CHARACTER SET UTF8MB4;
USE board;

drop database board;
CREATE TABLE board(
B_no INT PRIMARY KEY AUTO_INCREMENT, # 메인 글 넘버
B_title char(30), # 글 제목
B_time time, # 글쓴시간
B_id char(15), # 글쓴이
B_hit INT, # 조회수 
B_text text # 글내용
);

CREATE TABLE Login(
L_no INT PRIMARY KEY AUTO_INCREMENT, # 메인 글 넘버
L_ID char(30) , # 글 제목
L_PW Char(30) # 글쓴시간
);

drop table login;
drop table board;

SELECT * FROM Login; # 전체보기
SELECT * FROM board; # 전체보기
SELECT * FROM board ORDER BY B_NO DESC LIMIT 5,5; # 몇개를 스킵해서 몇개를 보여줄지 정하는함수
SELECT * FROM board LIMIT 5 ; # 5개 만 보여주는거

select * FROM board where B_NO;
INSERT INTO board(B_title,B_time, B_hit, B_id, B_text) VALUE ('제목',now(),0,'이름','내용'); # 원본 글
INSERT INTO login(L_ID,L_PW) VALUE ('1','1'); # 원본 글
update board set b_title = 1 ,B_hit = 2 ,b_text = 3;
update board set b_title = 'p.title' , B_hit = 4 , b_text = 'p.content'  WHERE B_no = 4;
DELETE FROM board WHERE B_NO = 3;	
SELECT B_no FROM board WHERE 2;