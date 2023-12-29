# 事务的细节

-- 1. 如果不开始事务， 默认情况下，dml操作是自动提交的，不能回滚
insert into t27 
		values(300, 'milan'); -- 自动提交 commit

select * from t27

-- 2. 如果开始一个事务，没有创建保存点，可以执行rollback
-- 默认退回到事务开始的状态
start transaction
insert into t27 values(400, 'king');
insert into t27 values(500, 'scott');
rollback  -- 表示直接回退到事务开始的状态
commit;

-- 3. 可以在事务没有提交前，创建多个保存点，比如savepoint 执行dml， savepoint bbb

-- 4. 可以在事务提交前，选择回退到哪个保存点

-- 5. Innodb 存储引擎支持事务 

-- 6. 开始一个事务 start transaction， set autocommit = off

