## 视图的练习

-- 针对 emp，dept 和 salgrade 表，创建一个视图 emp_view03
-- 可以显示雇员编号，雇员名，雇员部门名称和薪水级别

-- 使用三表联合查询，得到结果
-- 把得到的结果，构建成视图

create view emp_view03
		as
		select empno, ename, dname, grade
		from emp, dept, salgrade
			where emp.deptno = dept.deptno and
			(sal between losal and hisal)

DESC emp_view03

select * from emp_view03;

