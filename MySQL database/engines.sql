# 表类型和存储引擎

-- 查看所有的存储引擎
show engines

# -- innodb 存储引擎
-- 1. 支持事务   2. 支持外键  3. 支持行级锁

# -- myisam 存储引擎
create table t28 (
		id int,
			`name` varchar(32))engine myisam

-- 1.添加速度快  2. 支持外键和事务  3. 支持表级锁

start transaction;
savepoint t1;
insert into t28 values(1, 'jack');
select * from t28;
rollback to t1

# -- memory 存储引擎
-- 1. 数据存贮在内存中 [关闭了mysql服务，数据丢失，但是表的结构还在]
-- 2. 执行速递很快（没有io读写） 3. 默认支持索引（hash表）

create table t29 (
		id int,
			`name` varchar(32)) engine memory

DESC t29; 

insert into t29
		values(1, 'tom'), (2, 'jack'), (3, 'hsp')

select * from t29


-- 指令修改存储引擎
alter table `t29` engine = innodb
 