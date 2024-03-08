CREATE DATABASE chatGpt DEFAULT CHARACTER SET UTF8MB4;
use chatGpt;	
DROP DATABASE chatGpt;
drop table chatingLog;
CREATE TABLE `chatingLog`(
`number` int primary key auto_increment,
`index` int default 0,
`messageRole` char(200) not null default 'user', # 어떤사람이 보낸건지 기본은 시스템
`messageContent` text not null,
`finish_reason` char(200),
`time` datetime default now()
);
select * from chatingLog order by number DESC;
insert into chatingLog(`index`,`messageRole`,messageContent,finish_reason)values(1,'#ss','ss}','11')