# 子查询练习

# 思考：查找每个部门工资高于本部门平均工资的人的资料
-- 把一个子查询当作一个临时表使用

-- 1. 先得到每个部门的 部门号和对应的平均工资

select deptno, avg(sal) as avg_sal
		from emp 
			group by deptno

-- 2. 把上面的结果当作子查询，和 emp 进行多表查询
select ename, sal, temp.avg_sal, emp.deptno
		from emp, (
						select deptno, avg(sal) as avg_sal
				from emp 
				group by deptno
		) temp
			where emp.deptno = temp.deptno and emp.sal > temp.avg_sal

# 查找每个部门工资最高的人的详细资料

select ename, sal, temp.max_sal, temp.deptno
		from emp, (
					select deptno, max(sal) as max_sal
							from emp 
							group by deptno
			) temp 
			where emp.deptno = temp.deptno and emp.sal = temp.max_sal


select * from emp;

# 查询每个部门的信息（包括：部门名，编号，地址）和人员 数量，
-- 1. 部门名，编号，地址，来自dept表
-- 2. 各个部门的人员数量， 构建一个临时表
select count(*), deptno
		from emp
			group by deptno;
			
select dname, dept.deptno, loc, tmp.per_num as '人数'
		from dept, (
						select count(*) as per_num, deptno
				from emp
				group by deptno
			
				) tmp
				where tmp.deptno = dept.deptno

-- 另一种写法
-- 表.*  表示将该表中所有列都显示出来
-- 在多表查询中，当多个表的列不重复时，才可以直接写列名

select tmp.*, dname, loc
		from dept, (
					select count(*) as per_num, deptno 
					from emp
					group by deptno
			) tmp
			where tmp.deptno = dept.deptno
