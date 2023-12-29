# 外连接

# 列出部门名称和这些部门的员工名称和工作，同时要求显示出 那些没有员工的部门
-- 使用 多表查询的sql
select dname, job
		from emp, dept
			where emp.deptno = dept.deptno
		order by dname
		
-- 创建 stu
create table stu (
		id int,
			`name` varchar(32) 
			);
insert into stu 
		values(1,'jack'),(2,'tom'),(3,'kity'),(4,'nono');
select * from stu;

-- 创建 exam
create table exam(
		id int,
			grade int
			);
insert into exam values(1,56), (2,76), (11,8);
select * from exam;			

-- 使用左连接
-- （显示所有人的成绩，如果没有成绩，也要显示该人的姓名和id号，成绩显示为空

select `name`, stu.id, grade
		from stu, exam
			where stu.id = exam.id;

-- 改成左外连接
select `name`, stu.id, grade
		from stu left join exam
		on stu.id = exam.id;

-- 使用右外连接（显示所有成绩，如果没有名字匹配，显示空）
-- 即： 右边的表（exam） 和 左表没有匹配的记录，也会把右表的记录显示出来

select `name`, stu.id, grade
		from stu right join exam
			on stu.id = exam.id		


# 列出部门名称和这些部门的员工名称和工作，同时要求显示出 那些没有员工的部门

-- 使用左外连接
select dname, ename, job
		from dept left join emp 
		on emp.deptno = dept.deptno
		order by dname

-- 使用右外连接
select dname, ename, job
		from emp right join dept 
		on emp.deptno = dept.deptno
		order by dname

-- 总结： 在实际的开发中，大多使用下面方式：
select dname, job
		from emp, dept
		where emp.deptno = dept.deptno
		order by dname
		
