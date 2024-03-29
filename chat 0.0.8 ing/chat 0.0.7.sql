
CREATE DATABASE chat DEFAULT CHARACTER SET UTF8MB4;
use chat;	
DROP DATABASE chat;
CREATE TABLE login(
`userNo` int PRIMARY KEY AUTO_INCREMENT, # 유저 고유 넘버
`id` char(30) UNIQUE NOT NULL, # 유저 아이디
`pw` char(30) NOT NULL, # 유저 비밀번호
`userName` char(30) NOT NULL, # 유저 닉네임
`userTag` int NOT NULL DEFAULT 1, # 유저 태그번호(중복일떄 1씩 증가
`createdAt` timestamp DEFAULT current_timestamp,
`updatedAt` timestamp DEFAULT current_timestamp
);
select * from login;
CREATE TABLE `chatRoom`( 
`roomNo` int primary key auto_increment, # 채팅방 고유번호
`bossNo` int not null,
`roomName` char(50) not null, # 채팅방 이름
`roomStat` int default 0 not null, # 0일때 오픈방 1일때 닫힌방
`userMax` int default 10 not null, # 맴버 최대 인원수
`createdAt` timestamp default current_timestamp,
`updatedAt` timestamp default current_timestamp
);
select * from chatRoom;
drop table chatRoom;
delete from chatRoom where roomNo = 3;
CREATE TABLE `chatJoin`( # 아이디 랑 채팅방이랑 링크하는 테이블
`no` int primary key auto_increment,
`userNo` int NOT NULL, 
`roomNo` int NOT NULL,
`createdAt` datetime not null default now(),
`updatedAt` datetime not null default now() on update now()
);
select * from chatJoin;
delete from chatJoin where no = 5;
insert into chatJoin(userNo,roomNo) value (15,1);
insert into chatJoin(userNo,roomNo) value (13,1);
insert into chatJoin(userNo,roomNo) value (14,1);
insert into chatJoin(userNo,roomNo) value (1,1);

drop table chatJoin;

CREATE TABLE `chatData`(
`chatNo` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
`roomNo` int NOT NULL,
`userNo` int NOT NULL,
`chatContent` text NOT NULL,
`createdAt` timestamp default current_timestamp,
`updatedAt` timestamp default current_timestamp
);
in
select * from chatData;
drop table chatData;
CREATE TABLE `FriendsList`(
`myUserNo` int NOT NULL,
`freindUserNo` int NOT NULL,
`freind` int NOT NULL default 0

);
values
CREATE TABLE `Invite`(
`no` int PRIMARY key auto_increment,
`myUserNo` int not null,
`freindUserNo` int not null ,
`roomNo` int not null default 0,
`value` int not null default 0
);