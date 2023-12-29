# 字符串类型使用细节
# char(49) 和 varchar(4) 这个4表示的是字符，而不是字节，不区分字符是汉字还是字母

create table t11 (
		name char(4));
insert into t11 values ('abcd');
insert into t11 values ('北京你好');

select * from t11;


create table t12 (
		name varchar(4));
insert into t12 values('abcd');
insert into t12 values('ab北京');
select * from t12;

# 如果varchar不够用，可以考虑使用 mediumtext 或者 longtext
# 如果简单点，可以直接使用text
create table t13(content text, content2 mediumtext, content3 longtext);
insert into t13 values('韩顺平教育', '韩顺平教育100','韩顺平教育1000~~');
select * from t13;