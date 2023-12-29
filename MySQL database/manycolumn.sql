#  多列子查询

# 查询与 allen 的部门和岗位完全相同的所有雇员（不含smith本人）
-- （字段1，字段2……）= （select 字段1，字段2 from……）

-- 分析： 1. 得到smith的部门和岗位

select deptno, job
		from emp
			where ename = 'allen'

-- 分析： 2. 把上面的查询当作子查询来使用，并且使用多列子查询的语法进行匹配
select * 
		from emp
			where (deptno, job) = (
			select deptno, job 
					from emp 
					where ename = 'allen'
			) and ename != 'allen'


# 查询 和宋江数学，英语，语文 成绩完全相同的学生
select * 
		from student
			where(math, english, chinese) = (
					select math, english, chinese
							from student 
							where name = '宋江'
			)
select * from student;
 







