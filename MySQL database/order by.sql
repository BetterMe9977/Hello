# order by 使用

# 对数学成绩排序后输出【升序】
select * from student
		order by math;

# 对总分按照从高到低的顺序输出【降序】
select `name`, (chinese + english + math) as total_score from student 
		order by total_score desc;

# 对姓韩的学生成绩排序输出【升序】
select `name`, (chinese + english + math) as total_score from student 
		where `name` like '韩%'
		order by total_score;