## 视图的使用

-- 创建一个视图 emp_view01 只能查询emp表的（empno ename job 和 deptno）信息

-- 创建视图
create view emp_view01
		as
			select empno, ename, job, deptno from emp; 
			
-- 查看视图
DESC emp_view01

select * from emp_view01;
select empno, job from emp_view01;

-- 查看创建视图的指令
show create view emp_view01;

-- 删除视图
drop view emp_view01;


## 视图的细节

-- 1. 创建视图后，对应视图只有一个视图结构文件（形式：视图名.frm)
-- 2. 视图的数据比爱花会影响到基表，基表的数据变化也会影响到视图【insert update delete】

-- 修改视图 会影响到基表

update emp_view01
		set job = 'manager'
			where empno = 7369
			
select * from emp;

select * from emp_view01;

-- 修改基本表，会影响到视图

update emp
		set job = 'salesman'
			where empno = 7369
			
select * from emp;

select * from emp_view01;


## 3. 视图中可以再使用视图

DESC emp_view01

create view emp_view02
		as
			select empno, ename from emp_view01

DESC emp_view02

select * from emp_view02;
