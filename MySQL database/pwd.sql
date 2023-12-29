# 演示加密函数和系统函数

# user() 查询用户
# 可以查看登录到mysql的有哪些用户，以及登录的ip
select user() from DUAL;

# database() 查询当前使用数据库的名称
select database() from DUAL;

# MD5(str) 为字符串算出一个 MD5 32的字符串，常用（用户密码）加密
# root 密码是 hsp -> 加密md5 -> 在数据库中存放的是加密后的密码
select MD5('hsp') from DUAl;
select LENGTH(MD5('hsp')) from DUAl;

# 演示用户表，存放密码时，是md5
create table hsp_user
		(id int, name varchar(32) not null default '', 
			pwd char(32) not null default '')
insert into hsp_user
		values(100, '韩顺平', MD5('hsp'));
select * from hsp_user;
select * from hsp_user   -- sql注入问题 
		where `name` = '韩顺平' and pwd = MD5('hsp');


# PASSWORD(str)  --加密函数，MySQL 数据库的用户密码就是 PASSWORD 加密函数
select PASSWORD('hsp') from DUAL;

# select * from mysql.user 从原文密码str计算并返回密码字符串
select * from mysql.user
