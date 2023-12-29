# 外键演示

-- 创建主表 my_class
create table my_class(
		id int primary key,  -- 班级编号
			name varchar(32) not null default '');
			
-- 创建从表 my_stu
create table my_stu (
		id int primary key,  -- 学生编号
			name varchar(32) not null default '',
			class_id int,  -- 学生所在班级编号
			-- 指定外键关系
			foreign key(class_id) references my_class(id))

-- 测试数据
insert into my_class
		values(100, 'java'), (200, 'web');
insert into my_class
		values(300, 'php');


select * from my_class;

insert into my_stu
		values(1, 'tom', 100) 
insert into my_stu
		values(2, 'jack', 200)
insert into my_stu
		values(3, 'hsp', 300) 
insert into my_stu
		values(4, 'mary', 400)   -- 失败，因为400 班级不存在
		
insert into my_stu
		values(5, 'mary', null)   -- 可以，因为外键 允许为null

select * from my_class	
	
select * from my_stu;		

-- 一旦建立主外键的关系，数据不能随意删除了
-- Cannot delete or update a parent row: a foreign key constraint fails 
delete from my_class
		where id = 100;
