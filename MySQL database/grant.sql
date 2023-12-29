## 演示用户权限的管理

-- 创建用户
create user 'shunping'@'localhost' identified by '123'
-- 在默认情况下，'shunping'@'localhost' 用户只能看到一个默认的系统数据库


-- 使用root用户创建testdb， 表news
create database testdb
create table news (
		id int,
			content varchar(32));
-- 添加一条测试数据
insert into news values(100, '北京新闻');
select * from news;

-- 给'shunping'@'localhost' 分配查看news 表 和添加news的权限
grant select, insert
		on testdb.news
			to 'shunping'@'localhost'
			
-- 可以增加 update 权限
grant update
		on testdb.news
			to 'shunping'@'localhost'

-- 修改'shunping'@'localhost' 的密码为abc
set password for 'shunping'@'localhost' = password('abc');


#-- 回收 'shunping'@'localhost' 用户在 testdb.news 表的所有权限
revoke select, update, insert on testdb.news from 'shunping'@'localhost'
-- 或者⬇️
revoke all on testdb.news from 'shunping'@'localhost'

#-- 删除'shunping'@'localhost'
drop user 'shunping'@'localhost'
