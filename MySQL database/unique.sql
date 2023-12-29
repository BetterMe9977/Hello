# unique 的使用

create table t21
		(id int unique,
			`name` varchar(32),
			email varchar(32)
			);

select * from t21;		
	
insert into t21
		values(1, 'jack', 'jack@souhu.com');
insert into t21
		values(1, 'tom', 'tom@souhu.com'); -- Duplicate entry '1' for key 't21.id'

-- unique 使用细节
-- 1. 如果没有指定 not null，则 unique 字段可以有多个null
-- 如果一个列（字段），是 unique not null 使用效果类似 primary key
insert into t21
		value(null, 'tom', 'tom@souhu.com');
select * from t21;

-- 2. 一张表可以有多个unique字段
create table t22
		(id int unique,   -- 表示 id 列是不可以重复的
			`name` varchar(32) unique,   -- -- 表示 name 列是不可以重复的
					email varchar(32)
			);
DESC t22