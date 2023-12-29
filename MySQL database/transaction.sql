# 事务的一个重要的概念和具体操作

-- 演示
-- 1. 创建一张测试表
create table t27
		(id int,
			name varchar(32)
		);
		
-- 2. 开始事物
start transaction

-- 3. 设置保存点
savepoint a
-- 执行 dml 操作
insert into t27 values(100, 'tom');

select * from t27;

savepoint b

-- 执行 dml 操作
insert into t27 values(200, 'jack');

-- 回退到 b
rollback to b

-- 回退到 a
rollback to a

-- 直接回退到事物开始的状态
rollback
commit
