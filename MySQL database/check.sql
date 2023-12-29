# 演示 check 的使用

-- 测试
create table t23 (
		id int primary key,
			name varchar(32),
			sex varchar(6) check (sex in('man', 'women')),
			sal double check (sal > 1000 and sal < 2000)
			);
			
-- 添加数据
insert into t23
		values(1, 'jack', 'mid', 1);  -- Check constraint 't23_chk_1' is violated.
select * from t23