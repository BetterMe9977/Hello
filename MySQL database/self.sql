# 多表查询的自连接

#  显示公司员工名字和他的上级的名字

-- 员工名字在emp ， 上级的名字 在emp
-- 员工和上级是通过 emp表的 mgr 列 关联
-- 自连接特点： 把一张表当作两张表使用
--			  需要给表取别名 表名 表别名
-- 			  列名不明确，可以指定列的别名，列名， as列的别名

select worker.ename as '职员名', boss.ename as '上级名'
		from emp worker, emp boss
			where worker.mgr = boss.empno;
			
select * from emp;









