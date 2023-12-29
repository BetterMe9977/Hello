# 合并查询

select ename, sal, job 
		from emp 
			where sal > 2500
			
select ename, sal, job 
		from emp 
		where job = 'manager'

-- union all 就是将两个查询结果合并，不会去重
select ename, sal, job 
		from emp 
			where sal > 2500
union all
select ename, sal, job 
		from emp 
		where job = 'manager'

-- union 就是将两个查询结果合并，会去重
select ename, sal, job 
		from emp 
			where sal > 2500
union 
select ename, sal, job 
		from emp 
		where job = 'manager'
		