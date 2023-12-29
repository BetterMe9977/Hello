## 2. 查看dept表和emp表的结构
DESC dept;
DESC emp;

## 3. -- 显示所有部门的名称
select dname
		from dept

select * from dept


	-- 显示所有雇员名及其全年收入。13月（工资+补助），并指定列别名“年收入”
select ename, (sal+ IFNULL(comm, 0))*13  as '年收入'
		from emp
		
select * from emp

## 4. 显示查询数据

-- 1） 显示工资超过2850的雇员姓名和工资
select ename, sal
		from emp
			where sal > 2850

-- 2） 显示工资不在1500到2850之间所有雇员名及工资
select ename, sal
		from emp
		where sal < 1500 or sal > 2850

select ename, sal
		from emp
		where not (sal >= 1500 and sal <= 2850)

-- 3） 显示编号为7566的雇员姓名及所在部门编号
select ename, empno
		from emp
		where empno = 7566


-- 4） 显示部门10和30中工资超过1500的雇员名及工资
select ename, sal
		from emp
		where (deptno = 10 or deptno = 30) and sal > 1500

-- 5） 显示无管理者的雇员及岗位
select ename, job
		from emp
			where mgr is null;

## 5. 排序数据
-- 1） 显示在1991年2月1日到1991年5月1日之间雇佣的雇员名，岗位及雇佣日期，并以雇佣日期进行排序【默认】
-- 思路： 先查询到对应结果， 再考虑排序
select ename, job, hiredate
		from emp
			where hiredate >= '1991-02-01' and hiredate <= '1991-05-01'
			order by hiredate

-- 2） 显示获得补助的所有雇员名，工资及补助，并以工资降序排序
select ename, sal, comm
		from emp
			where comm is not null
			order by sal DESC


