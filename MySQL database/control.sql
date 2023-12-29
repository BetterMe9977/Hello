# 演示流程控制语句

# IF(expr1, expr2, expr3) 如果expr1为true，则返回 expr2 否则返回expr3
select IF(TRUE, '北京', '上海') from DUAL;

# IFNULL(expr1, expr2) 如果expr1不为null，则返回expr1，否则返回expr2
select IFNULL(NULL,'韩顺平教育') from DUAL;
select IFNULL('jack','韩顺平教育') from DUAL;

# SELECT CASE WHEN expr1 THEN expr2 WHEN expr3 THEN expr4 ELSE expr5 END [类似多重分支]
-- 如果expr1 为TRUE，则返回expr2，如果expr3 位TRUE 则返回expr4，否则返回expr5

select case
		when true then 'jack'
			when false then 'tom'
			else 'mary' end

-- 1. 查询 emp表 ， 如果 comm是null，则显示0.0
-- 判断是否为null 要使用 is null，判断不为空 使用 is not
select ename, IF(comm is NULL, 0.0, comm)
		from emp;
select ename, IFNULL(comm, 0.0)
		from emp;

-- 2. 如果emp表的job是clerk则显示职员，如果是manager则显示经理
--   如果是 salesman 则显示 销售人员，其他则正常显示

select ename, (select case
				when job = 'clerk' then '职员'
						when job = 'manager' then '经理'
						when job = 'salesman' then '销售人员'
						else job end) as 'job', job
			from emp;




