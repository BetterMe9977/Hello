## 测试

create table account(
		id int primary key auto_increment,
			name varchar(32) not null default '',
			balance double not null default 0)
			character set utf8;

insert into account values(null, '马云', 3000);
insert into account values(null, '马化腾', 10000);

select * from account 

## 创建测试表
create table admin2(
		id int primary key auto_increment,
		username varchar(32) not null,
		password varchar(32) not NULL);
		
select count(*) from admin2
select * from admin2

drop table admin2
 
