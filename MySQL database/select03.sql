# select 语句

# 查询姓名为赵云的学生成绩
select * from student 
		where `name` = '赵云'

# 查询英语成绩大于90分的同学

select * from student 
		where english > 90

# 查询总分大于200分的所有同学
select * from student
		where (chinese + english + math) > 200
		
# 查询math大于60并且（and）id 大于4 的学生成绩
select * from student 
		where math > 60 and id > 4
		
# 查询英语成绩大于语文成绩的同学
select * from student 
		where english > chinese

# 查询总分大于200分 并且 数学成绩小于语文成绩 的姓赵的学生
# 赵% 表示：名字以赵开头
select * from student 
		where (chinese + english + math) > 200 and 
			math < chinese and `name` like '赵%'
			
# 查询英语分数在80-90之间的同学
select * from student
		where english >= 80 and english <= 90

select * from student 
		where math between 80 and 90;   # between ... and ... 是闭区间

# 查询数学分数为89， 90， 91的同学
select * from student 
		where math = 89 or math = 90 or math = 91

select * from student 
		where math in (89, 90, 91);

# 查询所有姓韩的学生成绩
select * from student 
		where `name` like '韩%'

# 查询数学分数大于80，语文成绩大于80的同学
select * from student 
		where math > 80 and chinese > 80


