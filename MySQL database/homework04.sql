## homework04

-- emp员工表 dept部门表
-- 1） 列出至少有一个员工的所有部门
-- 先查各个部门有多少人， 使用having子句过滤

select count(*) as c, deptno
		from emp
			group by deptno 
			having c > 1
			
-- 2） 列出薪金比 “smith" 多的所有员工
-- 先查smith薪金，作为子查询
select * 
		from emp
			where sal > (
					select sal
							from emp
							where ename = 'smith')

-- 3） 列出受雇日期晚于其直接上级的所有员工
-- 把emp表当作两张表 worker 和 leader
-- 条件 worker.hiredate > leader.hiredate
--     worker.mgr = leader.empno
select worker.ename as '员工名', worker.hiredate as '员工入职时间', 
		leader.ename as '上级名', leader.hiredate as '上级入职时间'
		from emp worker, emp leader
			where worker.hiredate > leader.hiredate
			and worker.mgr = leader.empno
			
-- 4） 列出部门名称和这些部门的员工信息，同时列出那些没有员工的部门
-- 这里需要显示所有部门，因此考虑使用外连接（左外连接）
select dname, emp.*
		from dept LEFT JOIN emp 
			ON dept.deptno = emp.deptno 
			

-- 5） 列出所有”clerk“（办事员)的姓名及其部门名称
select ename, dname, job
		from emp, dept
			where job = 'clerk' and emp.deptno = dept.deptno

-- 6） 列出最低薪金大于1500的各种工作
-- 查各个部门最低工资

select min(sal) as min_sal, job
		from emp
		group by job
			having min_sal > 1500
			
-- 7） 列出部门”sales“（销售部) 工作的员工的姓名
select ename, dname
		from emp, dept
			where emp.deptno = dept.deptno and dname = 'sales'  

-- 8） 列出薪金高于公司平均薪金的所有员工
select ename, sal
		from emp
			where sal > (
					select avg(sal) 
					from emp
			)
-- 9) 列出与‘SCOTT'从事相同工作的所有员工
select * 
		from emp
			where job = (
					select job
							from emp
							where ename = 'scott'
			)

-- 10）列出薪金高于在部门30工作的所有员工的薪金的员工姓名和薪金
-- 先查询30部门最高工资
select ename, sal
		from emp
			where sal > (
					select max(sal)
							from emp
							where deptno = 30
			)
			
-- 11）列出在每个部门工作的员工数量，平均工资和平均服务期限
select count(*) as '部门员工数量', avg(sal) as '平均工资', 
		FORMAT(AVG(DATEDIFF(NOW(), hiredate)/365), 2) as '平均服务期限（年)'
		from emp
		group by deptno	
				
DESC emp
DESC dept

-- 12）列出所有员工的姓名，部门名称和工资
select ename, dname, sal
		from emp, dept
			where emp.deptno = dept.deptno


-- 13）列出所有部门的详细信息和部门人数
-- 先得到各个部门人数，把它当作临时表，和dept表联合查询
select dept.*, tmp.c as '部门人数'
		from dept, (
					select count(*) as c, deptno
							from emp
							group by deptno
			) tmp
			where dept.deptno = tmp.deptno


-- 14）列出各种工作的最低工资
select min(sal), job
		from emp
			group by job

-- 15）列出manager的最低薪金
select min(sal), job
		from emp
			where job = 'manager'

-- 16）列出所有员工的年工资，按年薪从低到高排序
select ename, (sal+ IFNULL(comm,0)) * 12 as sal_year
		from emp
			order by sal_year 
		
