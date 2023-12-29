#演示整型 使用tinyint 来演示范围 有符号：-128～127，无符号：0～255 

#说明： 表的字符集character set，校验规则collate，存储引擎engin，使用默认
#如果没有指定 unsigned，则TINYINT就是有符号


create table t3 (
		id tinyint);

create table t4 (
		id tinyint unsigned);

insert into t3 values(-128); #添加语句

insert into t4 values(255);

select * from t3

select * from t4