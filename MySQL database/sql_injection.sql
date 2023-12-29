## 演示sql注入

-- 创建一张表
create table admin ( -- 管理员表
		name varchar(32) not null unique,
			pwd varchar(32) not null default '')
			character set utf8;
			
-- 添加数据
insert into admin values ('tom', '123');

-- 查找
select * 
		from admin
			where name = 'tom' and pwd = '123';
			
select * from admin;

-- SQL注入
-- 输入用户名 1' or
-- 输入密码 or '1'= '1
select * 
		from admin
		where name = '1' or' and pwd = 'or '1'= '1';