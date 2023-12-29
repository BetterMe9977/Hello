# delete 语句 

# 删除表中 名称为‘老妖怪’ 的记录
delete from employee
		where user_name = '老妖怪'

insert into employee
		values(200, '老妖怪', '1990-11-11', '2000-11-11 10:10:10', '捶背的', 5000, '给大王捶背', 'test.png')

# 删除表中所有记录，一定小心
delete from employee;

# delete 语句不能删除某一列的值，（可以使用 update 设置为null 或者 ’‘）
update employee 
		set job = ''
		 where user_name = '老妖怪';

select * from employee;

# 使用delete语句仅删除记录，不删除表本身。如果要删除表，使用drop table语句
drop table employee;

