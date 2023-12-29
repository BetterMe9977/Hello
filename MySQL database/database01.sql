#演示数据库的操作
#使用指令创建数据库
create database hsp_db01;
#删除数据库指令
drop database hsp_db01
#创建一个使用utf8字符集的hsp_db02数据库
create database hsp_db02 character set utf8
#创建一个使用utf8字符集,并带校对规则的hsp_db03数据库
create database hsp_db03 character set utf8 collate utf8_bin
#校对规则 utf8_bin 区分大小写，默认 utf8/general_ci 不区分大小写

#下面是一条查询的sql，select 查询，* 表示所有字段，from 表示从哪个表查询，where 从哪个字段查询，name = ‘tom’ 查询名字是tom
select * from t1 where name = 'tom'

