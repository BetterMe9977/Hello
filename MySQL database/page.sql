# 分页查询
# 按雇员的id号升序取出，每页显示3条记录，请分别显示第1页，第2页，第3页

-- 第1页
select * from emp
		order by empno
			limit 0,3
-- 第2页
select * from emp
		order by empno
			limit 3,3
-- 第3页
select * from emp
		order by empno
			limit 6,3
-- 第几页
select * from emp
		order by empno
			limit 每页显示记录数 * （第几页-1), 每页显示记录数








