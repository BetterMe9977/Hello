# 演示mysql的索引使用

-- 创建索引
create table t25 (
		id int,
			name varchar(32));

-- 查询表是否有索引
show indexes from t25;

-- 添加索引
-- 添加唯一索引
create unique index id_index on t25(id);

-- 添加普通索引
create index id_ index on t25(id);
-- 1. 如果某列的值，是不会重复的，则优先考虑使用unique索引，否则使用普通索引

-- 添加普通索引方式2
alter table t25 add index id_index (id)

-- 添加主键索引
create table t26 (
		id int,
		name varchar(32));
alter table t26 add primary key (id)

show indexes from t26;


# 删除索引
drop index id_index on t25

# 删除逐渐索引
alter table t26 drop primary key

# 修改索引，先删除，再添加新的索引

-- 查询索引
-- 1. 方式
show index from t25

-- 2. 方式
show indexes from t25

-- 3. 方式
show keys from t25

-- 4. 方式
DESC t25

# 较频繁的作为查询条件字段应该创建索引
# 唯一性太差的字段不适合创建索引
# 更新非常频繁的字段不适合创建索引
# 不会出现在where子句中字段不创建索引


