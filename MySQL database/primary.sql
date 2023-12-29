## 主键的使用

-- id  name  email
create table t17 
		(id int primary key,  -- 表示id列是主键 not null
			`name` varchar(32),
			email varchar(32))
						
DESC t17;

select * from t17

-- 主键列的值是不可以重复
insert into t17
		values(1, 'jack', 'jack@sohu.com');
insert into t17
		values(2, 'tom', 'tom@sohu.com');
insert into t17
		values(1, 'hsp', 'hsp@sohu.com');
		
-- 主键使用的细节讨论
-- primary key 不能重复且不能为null
insert into t17
		values(null, 'hsp', 'hsp@sohu.com');
		
-- 一张表最多只能有一个主键，但可以是复合主键
create table t18 
		(id int primary key,  -- 表示id列是主键 not null
		`name` varchar(32) primary key, -- 错误 Multiple primary key defined

		email varchar(32))

-- 演示复合主键 （id 和 name 做成复合主键）
create table t18 
		(id int, 
		`name` varchar(32),  		
			email varchar(32),
			primary key (id, `name`) -- 这里是复合主键
			);

insert into t18
		values(1, 'tom', 'tom@sohu.com');
insert into t18
		values(1, 'jack', 'jack@sohu.com');
insert into t18
		values(1, 'tom', 'xx@sohu.com'); 
		-- 这里违反了复合主键 Duplicate entry '1-tom' for key 't18.PRIMARY'
select * from t18;


-- 主键的指定方式有两种

-- 1. 直接在字段名后指定： 字段名 primary key
create table t19 
		(id int, 
		`name` varchar(32) primary key,  		
		email varchar(32)
		);
DESC t19;
-- 2. 在表定义最后写 primary key （列名）
create table t20 
		(id int, 
		`name` varchar(32),  		
		email varchar(32),
		primary key (`name`) 
		);
DESC t20;

-- 使用desc 表名 ， 可以看到primary key 的情况

DESC t18; -- 复合主键

-- 在实际开发中 每个表都会设计一个主键
 