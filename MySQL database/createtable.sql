# 创建表的练习
# 字段  属性
# id   整型int,
# name 字符型varchar(32),
# sex  字符型char(1),
# birthday 日期型date,
# entry_date 日期型datetime,
# job  字符型varchar(32),
#salary 小数型double,
#resume 文本型text

create table emp (
		id int,
		 name varchar(32),
		 sex char(1),
		 birthday date,
		 entry_date datetime,
		 job varchar(32),
		 salary double,
		 resume text) charset utf8 collate utf8_bin engine innodb;

select * from emp;		  

# 添加一条
insert into emp
		values(100, '小妖怪', '男', '2000-11-11', '2010-11-10 11:11:11', '巡山的', 3000, '大王叫我来巡山');