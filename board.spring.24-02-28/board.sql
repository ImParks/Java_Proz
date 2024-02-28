use board;
SELECT * FROM post;
drop table post;


insert into post (title,content) values ("abc","내용1");

insert into post (title,content,userNumber) values ("abc","내용1",2);

select * from board where title like '%%%%';

create table post(
postNumber int primary key auto_increment,
title char(50) not null,
content char(150),
hit int not null default 0,
userNumber int default 1,
dateTime datetime not null default now(),
postModifyTime datetime not null default now(),
upDateTime datetime not null default now() on update now()
);

UPDATE post SET hit = 0;
select * from post;
SELECT COUNT(*) from post;

create table user(
userNumber int primary key auto_increment,
userID char(30) not null,
userPW char(30) not null,
userName char(30) not null,
userTag int not null,
dateTime datetime not null default now(),
upDateTime datetime not null default now() on update now()
);
select * from user;
insert into user (userName,userTag) value ("파크",1);
		SELECT
		post.postNumber,post.title,post.hit,post.userNumber,user.userName,user.userTag,post.dateTime,post.postModifyTime
		FROM post JOIN user ON post.userNumber = user.userNumber limit	0,5;
drop table user;
SELECT * FROM post CROSS JOIN user;

UPDATE post SET title = "안녕", content = "내용" WHERE postNumber = 1;
SELECT post.postNumber,post.title,post.content,post.hit,post.userNumber,user.userName,user.userTag,post.dateTime,post.upDateTime
FROM post JOIN user ON post.userNumber = user.userNumber;