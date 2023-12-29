# 子查询的演示

-- 如何显示于smith同一部门的所有员工
-- 1. 先查询到 smith 的部门号
-- 2. 把上面的select 语句当作一个字查询来使用

select deptno
		from emp 
		   where ename = 'smith'

select * 
		from emp 
			where deptno = (
						select deptno
				from emp 
		   		where ename = 'smith'
		   )

# 查询和部门10 的工作相同的雇员的名字，岗位，工资，部门号，
# 但是不含10号部门自己的雇员
-- 1. 查询到10号部门有哪些工作
-- 2. 把上面的查询结果当作子查询使用

select distinct job
		from emp
			where deptno = 10;
			
select ename, job, sal, deptno
		from emp
			where job in (
					select distinct job
			 from emp
			 where deptno = 10
			) and deptno != 10  	-- 不等于 <>








