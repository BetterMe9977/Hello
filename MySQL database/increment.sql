# 演示自增长

-- 创建表
create table t24 (
		id int primary key auto_increment,
			email varchar(32) not null default '',
			name varchar(32) not null default ''
		);
		
DESC t24

-- 测试自增长的使用
-- 自增长默认从1开始
insert into t24
		values(null, 'jack@qq.com', 'jack');

insert into t24
		values(null, 'tom@qq.com', 'tom');

insert into t24
		(email, `name`) values ('hsp@souhu.com', 'hsp')

select * from t24


-- 修改默认的自增长开始值
alter table t25 auto_increment = 100
create table t25 (
		id int primary key auto_increment,
		email varchar(32) not null default '',
		name varchar(32) not null default ''
		);

insert into t25
		values(null, 'tom@qq.com', 'tom');

insert into t25
		values(666, 'hsp@qq.com', 'hsp');

insert into t25
		values(null, 'mary@qq.com', 'mary');
		
select * from t25

-- 如果指定了自增长，一般就按照自增长的规则来添加数据