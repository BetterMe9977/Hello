# 查询加强
-- 使用where子句
-- 如何查找1992.1.1后入职的员工
-- 在mysql中，日期类型可以直接比较，需要注意格式
select * from emp
		where hiredate > '1992-01-01'
		
-- 如何使用like操作符（模糊）
--  %： 表示0到多个任意字符， _: 表示单个任意字符
--  ？如何显示首字符为s的员工姓名和工资
select ename, sal from emp
		where ename like 's%'

-- 如何显示第三个字符为大写o的所有员工的姓名和工资
select ename, sal from emp 
		where ename like '__o%'

# 如何显示没有上级的雇员的情况
select * from emp
		where mgr is null;

# 查询表结构
DESC emp;

# 使用order by 子句
-- 如果按照工资的从低到高的顺序【升序】，显示雇员的信息
select * from emp
		order by sal
# 按照部门号升序而员工的工资降序排列，显示雇员的信息
select * from emp 
		order by deptno ASC, sal DESC;





