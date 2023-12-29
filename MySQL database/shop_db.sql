# 使用约束的练习

create database shop_db;

-- 有个商店的数据库shop_db,记录客户及其购物情况，由下面三个表组成

-- 商品goods（商品编号goods_id，商品名goods_name，单价unitprice，商品类别category,供应商 provider);
-- 客户customer（客户号customer_id,姓名name，住址address，电邮email，性别sex，身份证card_id)
-- 购买purchase（购买订单号order_id, 客户号customer_id,商品号goods_id,购买数量 nums);
-- 1. 建表，在定义中要求声明【进行合理设计】
--  1）每个表的主外键
--  2）客户的姓名不能为空
--  3）电邮不能重复
--  4）客户的性别【男】【女】check 枚举
--  5）单价unitprice 在1.0 - 9999.99 之间 check

-- 创建商品goods
-- 商品编号goods_id，商品名goods_name，单价unitprice，商品类别category,供应商 provider);
create table goods (
		goods_id int primary key,
			goods_name varchar(64) not null default '',
			unitprice decimal(10,2) not null default 0
					check(unitprice >= 1.0 and unitprice <= 9999.99),
			category int not null default 0,
			provider varchar(64) not null default '');
			
select * from goods;			

-- 客户customer
-- （客户号customer_id,姓名name，住址address，电邮email，性别sex，身份证card_id)
create table customer (
		customer_id char(8) primary key,
			name varchar(64) not null default '',
			address varchar(64) not null default '',
			email varchar(64) unique not null ,
			sex enum('男', '女'),
			card_id char(18));

select * from customer;

-- 购买purchase
-- （购买订单号order_id, 客户号customer_id,商品号goods_id,购买数量 nums);

create table purchase (
		order_id int unsigned primary key,
			customer_id char(8) not null default '',
			goods_id int not null default 0,
			nums int not null default 0,
			foreign key (customer_id) references customer(customer_id),
			foreign key (goods_id) references goods(goods_id));

select * from purchase;

DESC goods;
DESC customer;
DESC purchase;