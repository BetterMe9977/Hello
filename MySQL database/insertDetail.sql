# 说明 insert 语句的细节

# 1. 插入的数据应与字段的数据类型相同，如 把‘abc’ 添加到int类型会出错

insert into goods (id, goods_name, price)
		values(40, 'vovo手机', 3000); 
select * from goods;

# 2. 数据的长度应该在列的规定范围内，例如：不能将一个长度为80的字符串加入到长度为40的列中
# Data too long for column 'goods_name' 
insert into goods (id, goods_name, price)
		values(40, "vovovovovoovovovovovovovovovoovovovov", 3000);
		
# 3. 在values中列出的数据位置必须与被加入的列的排列位置相对应
insert into goods(id, goods_name, price)
		values('vovo', 40,2000);
		
# 4. 字符和日期型数据应包含在单引号中
insert into goods(id, goods_name, price)
		values(40, vovo, 3000);

# 5. 列可以插入空值【前提是该字段允许为空】，insert into table value(null)
insert into goods (id, goods_name, price)
		values(40, 'vovo手机', NULL);
select * from goods;
 
# 6. insert into tab_name (列名) values(), (), () 形式添加多条记录
insert into goods (id, goods_name, price)
		values(50, '三星手机', 2300), (60, '海尔手机', 1800);

# 7. 如果是给表中的所有字段添加数据，可以不写前面的字段名称
#  Column count doesn't match value count 
insert into `goods` 
		values(70, 'IBM手机', 5000)

# 8. 默认值的使用，当不给某个字段值时，如果有默认值就会添加，否则报错
#	如果某个列 没有指not null ， 那么添加数据时，没有给定值，则会默认给null
#	如果希望指定某个列的默认值，可以在创建表时指定
insert into `goods` (id, goods_name)
		values(80, '小米手机')
select * from goods;

CREATE TABLE `goods2` (
  `id` int ,
  `goods_name` varchar(10) ,
  `price` double not null DEFAULT 100
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

insert into `goods2` (id, goods_name)
		values(80, '小米手机')
select * from goods2;
