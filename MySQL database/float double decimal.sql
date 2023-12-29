# 演示decimal类型 float double 使用

#创建表
create table t06 (
		num1 float,
		 num2 double,
		 num3 decimal(30,20));
		 
#添加数据
insert into t06 values(88.12345678912345, 88.12345678912345, 88.12345678912345);

select * from t06;

create table t07 (
	    num decimal(65));
insert into t07 values(899777772727272772727748848574784387347834784387843784);
select * from t07;

create table t08 (
	    num bigint unsigned);
insert into t08 values(899777772727272772727748848574784387347834784387843784); #Out of range value for column 'num' 
select * from t08;