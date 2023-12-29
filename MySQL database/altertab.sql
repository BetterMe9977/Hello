# altertab
# 修改表的操作

alter table emp 
		add image varchar(32) not null default '' 
		 after resume
		 
desc emp # 显示表结构，可以查看表的所有列

# 修改job列，使其长度为60
alter table emp
		modify job varchar(60) not null default ''
		
# 删除sex列
alter table emp
		drop sex

# 表名改为 employee
rename table emp to employee

# 修改表的字符集为utf8
alter table employee character set utf8

# 列名name修改为user_name
alter table employee
		change name user_name varchar(64) not null default ''
desc employee
