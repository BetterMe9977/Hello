# 增强 group by 的使用

-- 1. 显示每种岗位的雇员数，平均工资
select count(*), avg(sal), job
		from emp
			group by job;

-- 2. 显示雇员总数，以及获得补助的雇员数
-- 获得补助的雇员数 就是comm 列 为非null，就是count（列），如果该列的值为null，是不会统计
select count(*), count(comm)
		from emp
-- 统计没有获得补助的雇员数
select count(*), count(IF(comm is null, 1, null))
		from emp

select count(*), count(*) - count(comm)
		from emp


-- 3. 显示管理者的总人数
select count(distinct mgr)
		from emp

-- 4. 显示雇员工资的最大差额
-- max(sal) - min(sal)
select max(sal) - min(sal)
		from emp;

select * from emp


# 统计各个部门的大于1000的平均工资avg，按照平均工资从高到低排序，order by ， 
-- 取出前两行记录 limit

select deptno, avg(sal) as avg_sal
		from emp 
		group by deptno
			having avg_sal > 1000
		   order by avg_sal DESC
		   limit 0,2








