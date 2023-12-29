## 创建测试表 
-- 演员表

create table actor ( -- 演员表
		id int primary key auto_increment,
			name varchar(32) not null default '',
			sex char(1) not null default '女',
			borndate datetime,
			phone varchar(12));
			
select * from actor

-- 增加2条记录，用于测试ResultSet
insert into actor
		values(null, 'jack', '男', '1990-11-11', '112');
insert into actor
		values(null, '刘德华', '男', '1970-12-12', '110');