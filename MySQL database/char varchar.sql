# 演示字符串类型使用char varchar
# char（size)
# 固定长度字符串 最大255字符 
# varchar（size)  0～65535字节
# 可变长度字符串 最大65532字节 【utf8编码最大21844字符 预留1-3个字节用于记录大小】
# 如果表的编码是 utf8 varchar（size) size = （65535-3) / 3 = 21844
# 如果表的编码是 utf8 varchar（size) size = （65535-3) / 2 = 32766


create table t09 (
		name char(255));
		
create table t10 (
		name varchar(21844));
		
create table t11 (
		name varchar(32766)) charset gbk;
		
drop table t11;