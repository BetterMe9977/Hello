# 演示update语句
# 1. 没有带where条件，会修改所有记录
update employee set salary = 5000

# 2. 将姓名为小妖怪的员工薪水修改为 3000
update employee 
		set salary = 3000
		 where user_name = '小妖怪'

# 3. 将老妖怪的薪水在原有的基础上增加1000
insert into employee
		values(200, '老妖怪', '1990-11-11', '2000-11-11 10:10:10', '捶背的', 5000, '给大王捶背', 'test.png')
		
update employee
		set salary = salary + 1000
		 where user_name = '老妖怪'

# 可以修改多个列
update employee
		set salary = salary + 1000 , job = '出主意的'
		 where user_name = '老妖怪'
		
select * from employee;