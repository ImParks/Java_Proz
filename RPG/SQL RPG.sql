CREATE DATABASE Rpg DEFAULT CHARACTER SET UTF8MB4;
use Rpg;

drop database Rpg;

CREATE TABLE item(
I_no INT PRIMARY KEY AUTO_INCREMENT, # 아이템 넘버
I_name char(30), # 아이템 이름
I_value int,  #가격
I_sell int,  #판매가격
I_text text
);

CREATE TABLE bag(
B_no INT PRIMARY KEY AUTO_INCREMENT,
B_itemname char(30),
B_ea  int default 0
);

CREATE TABLE map(
M_no INT PRIMARY KEY AUTO_INCREMENT,
M_x  int not null,
M_y  int not null
);

CREATE TABLE Login(
L_no INT PRIMARY KEY AUTO_INCREMENT, # 메인 글 넘버
L_ID char(30) , # 아이디
L_PW Char(30) # 비밀번호
);
DROP TABLE Login;
SELECT L_ID FROM Login WHERE L_ID = '0';
SELECT * FROM Login WHERE L_ID = '1' and L_PW = '1';
INSERT INTO Login(L_ID,L_PW) VALUE ('1','1');
INSERT INTO Login(L_ID,L_PW) VALUE ('2','2');
SELECT * FROM Login;

CREATE TABLE Npc(
N_no INT PRIMARY KEY AUTO_INCREMENT, # 메인 글 넘버
N_number int default 0,
N_id char(30), # 캐릭터가 속한 아이디
N_name char(30), # 캐릭터 이름
N_Sex char(5), # 캐릭터 성별
N_job char(30) DEFAULT '초보자', # 직업
N_hp int, # 체력
N_MaxHp int, #최대체력
N_str int, # 힘능력치
N_dex int, # 덱스능력치
N_inte int,  # 인트 능력치
N_luk int, # 럭 능력치
N_MaxExp int default 100, # 멕스 경험치
N_exp int default 0, # 현제 경험치
N_gold int default 0, # 골드
N_level int default 1, #레벨 
N_x int default 0, # 캐릭터 X 좌표
N_y int default 0 # 캐릭터 Y 좌료
);

DROP TABLE Npc;
SELECT L_ID FROM Npc WHERE L_ID = '0';
SELECT * FROM Npc WHERE L_ID = '1' and L_PW = '1';
INSERT INTO Npc(N_id,N_name,N_Sex,N_job,N_hp,N_MaxHp,N_str,N_dex,N_inte,N_luk)	VALUE ('1','PARK',0,'전사',100,100,10,10,10,10);
INSERT INTO Npc(L_ID,L_PW) VALUE ('2','2');
SELECT * FROM Npc;
select * FROM NPC WHERE N_id = '1';
SELECT COUNT(*) FROM Npc WHERE N_id = '1';
SELECT N_no FROM Npc WHERE N_number = 2;
DELETE FROM Npc WHERE N_ID  = 1  AND N_number = 1;
SELECT* FROM Npc WHERE N_ID = '1' ORDER BY N_no LIMIT 1 OFFSET 0 ;
 
update board set b_title = 1 ,B_hit = 2 ,b_text = 3;

CREATE TABLE Village(
V_no INT PRIMARY KEY AUTO_INCREMENT, 
V_X INT NOT NULL,
V_Y INT NOT NULL,
V_name char(30)
);
SELECT * FROM VILLAGE;
INSERT INTO village(V_X,V_Y,V_name) VALUE (3,3,'초보자 마을');


CREATE TABLE Monster(
M_no INT PRIMARY KEY AUTO_INCREMENT, # 메인 글 넘버
M_name Char(30),
M_hp int,
M_maxHp int,
M_atk int,
M_gold int,
M_exp int
);
