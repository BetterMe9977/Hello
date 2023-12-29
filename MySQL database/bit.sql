# 演示bit类型使用

# 1. bit(m) m在1-64 
# 2. 添加数据范围 按照给的位数来确定，比如 m = 8 表示一个字节 0～255
# 3. 显示按照bit
# 4. 查询时，仍然可以按照数来查询
create table t05 (num bit(8));
insert into t05 values (255);
select * from t05;
select * from t05 where num = 1;