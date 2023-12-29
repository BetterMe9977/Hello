# 练习 insert 语句

create table goods (
		id int,
		  goods_name varchar(10),
		  price double);
# 添加数据
insert into goods (id, goods_name, price)
		values(10, '华为手机', 2000);

desc goods

insert into goods (id, goods_name, price)
		values(20,'iphone', 3000 )

select * from goods;