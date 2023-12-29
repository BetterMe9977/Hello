# 表的复制
-- 为了对某个sql语句进行效率测试，需要海量数据，可以使用此法为表创建海量数据

create table my_tab01
		(id int,
			`name` varchar(32),
			sal double,
			job varchar(32),
			deptno int
			);
DESC my_tab01;
select * from my_tab01;

# 演示如何自我复制
-- 1. 先把emp 表的记录复制到 my_tab01
insert into my_tab01
		(id, `name`, sal, job, deptno)
			select empno, ename, sal, job, deptno from emp;
			
-- 2. 自我复制
insert into my_tab01
		select * from my_tab01;
		
select count(*) from my_tab01;

# 如何删除一张表的重复记录
-- 1. 先创建一张表 my_table02
-- 2. 让 my_table02 有重复的记录

-- like emp 把表的结构（列） 复制到my_table02
create table my_table02 like emp;

DESC my_table02;

insert into my_table02
		select * from emp;
		
select * from my_table02;

-- 3. 考虑去重
-- 1）先创建一张临时表 my_tmp, 该表的结构和 my_table02 一样
-- 2）把my_tmp 的记录 通过 distinct 关键字 处理后，把记录复制到 my_tmp
-- 3) 清除掉my_table02 记录
-- 4）把my_tmp 表的记录复制到 my_table02
-- 5) drop 掉 临时表

-- 1）先创建一张临时表 my_tmp, 该表的结构和 my_table02 一样
create table my_tmp like my_table02
-- 2）把my_tmp 的记录 通过 distinct 关键字 处理后，把记录复制到 my_tmp
insert into my_tmp
		select distinct * from my_table02;
select * from my_tmp
-- 3) 清除掉my_table02 记录
delete from my_table02
-- 4）把my_tmp 表的记录复制到 my_table02
insert into my_table02
		select * from my_tmp
		
select * from my_table02;

-- 5) drop 掉 临时表
drop table my_tmp

		