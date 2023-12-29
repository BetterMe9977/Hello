# select 语句

# 统计每个学生的总分
select `name`, (chinese + english + math) 
		from student;

# 在所有学生总分加10分的情况
select `name`, (chinese + english + math + 10) 
		from student;

#使用别名表示学生总分
select `name` as '名字', (chinese + english + math + 10) as total_score 
		from student;
