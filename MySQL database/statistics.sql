# 演示mysql的统计函数的使用

# 统计一个班级学生总数
select count(*) from student;

# 统计数学成绩大于90的学生人数
select count(*) from student
		where math > 90;

# 统计总分大于250的人数
select count(*) from student
		where (chinese + english + math) > 250;

# count(*) 和 count(列) 的区别
# count(*) 返回满足条件的记录的行数
# count(列) 统计满足条件的某列有多少个，但是会排除 为null

create table t15 (
		`name` varchar(20));
insert into t15 values('tom');
insert into t15 values('jack');
insert into t15 values('mary');
insert into t15 values(null);

select * from t15;

select count(*) from t15;
select count(`name`) from t15;


# 演示sum函数的使用

# 统计一个班级数学总成绩
select sum(math) from student;

# 统计一个班级语文 英语 数学各科的总成绩
select sum(chinese), sum(english), sum(math) from student;

# 统计一个班级语文 英语 数学的成绩总和
select sum(chinese + english + math) from student;

# 统计一个班级语文成绩平均分
select sum(chinese) / count(*) from student;
# sum 对数值起作用，对多列求和，中间加，


# 演示 avg 的使用

# 求一个班级数学平均分
select avg(math) from student;

# 求一个班级总分平均分
select avg(chinese + english + math) from student;


# 演示max 和 min 的使用
# 求班级最高分和最低分（数值范围在统计中特别有用）
select max(chinese + english + math), min(chinese + english + math) 
		from student;
# 求出班级数学最高分和最低分
select max(math), min(math) from student;



