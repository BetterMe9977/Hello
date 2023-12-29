## homework03

-- 1. 选择部门30中的所有员工
select * 
		from emp
			where deptno = 30
			
-- 2. 列出所有办事员（clerk）的姓名，编号和部门编号
select ename, empno, deptno, job
		from emp
			where job = 'clerk'

-- 3. 找出佣金高于薪金的员工
select * 
		from emp
			where IFNULL(comm,0) > sal 

-- 4. 找出佣金高于薪金60%的员工
select * 
		from emp
			where IFNULL(comm,0) > sal * 0.6

-- 5. 找出部门10中所有经理（manager）和部门20中所有办事员（clerk）的详细资料
select * 
		from emp
			where (job = 'manager' and deptno = 10)
			or (job = 'clerk' and deptno = 20)

-- 6. 找出部门10中所有经理（manager），部门20中所有办事员（clerk），还有既不是经理又不是办事员但其薪金大于或者等于2000的所有员工的详细资料
select * 
		from emp
		where (job = 'manager' and deptno = 10) 
			or (job = 'clerk' and deptno = 20) 
			or (job != 'manager' and job != 'clerk' and sal >= 2000 )

-- 7. 找出收取佣金的员工的不同工作岗位
select distinct job 
		from emp
			where comm is not null

-- 8. 找出不收取佣金或者收取的佣金低于100的员工
select *
		from emp
		where comm is null or IFNULL(comm, 0) < 100

-- 9. 找出各月倒数第三天受雇的所有员工
-- LAST_DAY(日期) ： 可以返回该日期所在月份的最后一天
-- LAST_DAY(日期) - 2  ：返回该日期所在月份的倒数第三天
select *
		from emp
			where LAST_DAY(hiredate) - 2 = hiredate

-- 10. 找出早于12年前受雇的员工(即：入职时间超过12年）
select * 
		from emp
			where DATE_ADD(hiredate, INTERVAL 12 YEAR) < NOW()


-- 11. 以首字母小写的方式显示所有员工的姓名
select CONCAT(UCASE(SUBSTRING(ename, 1, 1)), SUBSTRING(ename,2))
		from emp

-- 12. 显示正好为5个字符的员工的姓名
select * 
		from emp
			where length(ename) = 5

-- 13. 显示不带有“R”的员工的姓名
select ename
		from emp
			where ename not like '%R%'

-- 14. 显示所有员工姓名的前三个字符
select LEFT(ename,3)
		from emp

-- 15. 显示所有员工的姓名，用a替换所有'A')
select REPLACE(ename, 'A', 'a')
		from emp

-- 16. 显示满10年工作年限的员工姓名和受雇日期
select ename, hiredate
		from emp
			where DATE_ADD(hiredate, interval 10 year) <= now()

-- 17. 显示员工的详细资料，按姓名排序
select * 
		from emp
			order by ename

-- 18. 显示员工的姓名 和 受雇日期，根据工作年限，将最老的员工排在最前面
select ename, hiredate
		from emp
			order by hiredate

-- 19. 显示所有员工的姓名，工作和薪金，按工作降序排序，若工作相同则按薪金排序
select ename, job, sal
		from emp
			order by job DESC, sal

-- 20. 显示所有员工的姓名 加入公司的年份和月份，按受雇日期所在月排序，
--     若月份相同则将最早年份的员工排在最前面
select ename, CONCAT(YEAR(hiredate), '-', MONTH(hiredate))
		from emp
			order by MONTH(hiredate), YEAR(hiredate)

-- 21. 显示在一个月为30天的情况所有员工的日薪金，忽略余数 【FLOOR()向下取整，ROUND()四舍五入】
select ename, FLOOR(sal / 30), sal / 30
		from emp

-- 22. 找出在（任何年份的）2月受聘的所有员工
select * 
		from emp
			where MONTH(hiredate) = 2
			
-- 23. 对于每个员工，显示其加入公司的天数
select ename, DATEDIFF(NOW(), hiredate)
		from emp

-- 24. 显示姓名字段的任何位置包含A的所有员工的姓名
select * 
		from emp
			where ename like'%A$'

-- 25. 以年月日的方式显示所有员工的服务年限
--  先求出工作了多少天
select ename, FLOOR(DATEDIFF(NOW(), hiredate) / 365) as '工作年',
		FLOOR((DATEDIFF(NOW(), hiredate) % 365) / 31) as '工作月',
			DATEDIFF(NOW(), hiredate) % 31 as '工作天'
			from emp
