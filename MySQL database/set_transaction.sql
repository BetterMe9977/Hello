# 演示mysql的控制台

-- 查看当前mysql的隔离级别
select @@tx_isolation;

-- 把其中一个控制台的隔离级别设置read uncommitted

set session transaction isolation level read uncommitted

-- 创建表
create table `account` (
		id int,
			`name` varchar(32),
			money int);
			
## 查看当前会话隔离级别
select @@tx_isolation

## 查看系统当前隔离级别
select @@global.tx_isolation

## 设置当前会话隔离级别
set session transaction isolation level read uncommitted

## 设置系统当前隔离级别
set global transaction isolation level [ ? ]

