# all 和 any 的使用

-- 显示工资比部门30的所有员工的工资高的员工的姓名 工资 和部门号

select ename, sal, deptno
		from emp
			where sal > all (
		  select sal
		  			from emp
		  			where deptno = 30
		  )
-- 第二种方法			
select ename, sal, deptno
		from emp
			where sal > (
		  select max(sal)
		  			from emp
		  			where deptno = 30
		  )

# 显示工资比部门30的其中一个员工的工资高的员工姓名，工资，和部门号
select ename, sal, deptno
		from emp
			where sal > any (
			select sal 
					from emp
					where deptno = 30
			)
-- 第二种方法
select ename, sal, deptno
		from emp
			where sal > (
			select min(sal) 
					from emp
					where deptno = 30
			)







