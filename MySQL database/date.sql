# 日期相关函数

# current_date() 当前日期
select current_date() from DUAL;

# CURRENT_TIME() 当前时间
SELECT CURRENT_TIME() FROM DUAL;

# CURRENT_TIMESTAMP() 当前时间戳
SELECT CURRENT_TIMESTAMP() FROM DUAL;


# 创建测试表 信息表
create table mes(
		id int,
			content varchar(30),
			send_time datetime);
			
# 添加一条记录
insert into mes 
		values(1, '北京新闻', current_timestamp());
insert into mes
		values(2, '上海新闻', now());
insert into mes
		values(3, '广州新闻', now());
		
select * from mes;
select now() from DUAL;

# 显示所有新闻信息，发布日期只显示日期，不显示时间
select id, content, date(send_time)
		from mes;
		
# 请查询在10分钟内发布的新闻
select * 
		from mes
			where DATE_ADD(send_time, interval 10 minute) >= now();
# 请查询在10分钟内发布的新闻
select * 
		from mes
			where DATE_SUB(now(), interval 10 minute) <= send_time ;

# 请在mysql的sql语句中求出 2011-11-11 和 1990-1-1 相差多少天
select DATEDIFF('2011-11-11', '1990-01-01') / 365 from DUAL;

# 请用mysql的sql语句中求出你活了多少天
select DATEDIFF(now(), '1990-01-01') from DUAL;

# 如果你能活80岁，求出你还能活多少天
# 先求出80岁是什么日子
# '1986-11-11' 可以是date / datetime / timestamp
# interval 80 year： year 可以是年月日，时分秒
select datediff(date_add('1986-11-11', interval 80 year), now())
		from Dual;
		
select timediff('10:11:11', '06:10:10') from DUAL;

# YEAR | MONTH | DATE (datetime)
select YEAR(NOW()) from DUAL;
select MONTH(NOW()) from DUAL;
select DAY(NOW()) from DUAL;
select YEAR('1986-11-11') from DUAL;

# unix_timestamp() : 返回的是1970-1-1 到现在的秒数
select UNIX_TIMESTAMP() from DUAL;

# FROM_UNIXTIME() : 可以把一个 unix_timestamp 秒数【时间戳】，转成指定格式的日期
# %Y-%m-%d 格式是规定好的，表示年月日
# 意义：在开发中，可以存放一个整数，然后表示时间，通过FROM_UNICXTIME转换
select FROM_UNIXTIME(1618483484, '%Y-%m-%d') from DUAL;
select FROM_UNIXTIME(1618483100, '%Y-%m-%d %H:%i:%s') from DUAL;


