# 多表查询
#  显示雇员名，雇员工资及所在部门的名字 【笛卡尔集】
-- 1. 雇员名，雇员工资来自emp表
-- 2. 部门的名字，来自dept表
-- 3. 需求对 emp 和 dept 查询， ename，sal， dname， deptno
-- 4. 当我们需要指定显示某个表的列时，需要表.列表

select ename, sal, dname, emp.deptno
		from emp, dept
			where emp.deptno = dept.deptno

select * from emp;
select * from dept;
select * from salgrade;

-- 多表查询的条件不能少于个数-1，否则会出现笛卡尔集

# 显示部门号为10 的部门名，员工名，和 工资
select ename, sal, dname, emp.deptno
		from emp, dept
			where emp.deptno = dept.deptno and emp.deptno = 10
			
# 显示各个员工的姓名， 工资， 及其工资的级别salgrade
-- 姓名，工资来自emp
-- 工资级别 salgrade
-- 写sql 先写一个简单，然后加过滤条件
select ename, sal, grade 		
		from emp,  salgrade
			where sal between losal and hisal;








