# 演示字符串 相关函数的使用，使用emp表来演示
# charset（str) 返回字串字符集
select charset(ename) from emp;

# concat (string2 [,...]) 连接字串，将多个列拼接成一列
select CONCAT(ename, '工作是', job) from emp;

# instr（string，substring) 返回substring 在 string 中出现的位置，没有返回0
# dual 是亚元表，系统表，可以作为测试表使用
select instr('hanshunping', 'ping') from dual;

# Ucase（string2) 转换成大写
select ucase(ename) from emp;

# Lcase（string2) 转换成小写
select lcase(ename) from emp;

# LEFT（string2，length) 从string2中的左边起取length个字符
select left(ename, 2) from emp;

# right（string2，length) 从string2中的右边起取length个字符
select right(ename, 2) from emp;

# length（string)  string长度【按照字节】
select length(ename) from emp;

# replace（str，search_str, replace_str) 在str中用replace_str 替换 search_str
# 如果是manager 就替换成经理
select ename, replace(job, 'manager', '经理') from emp;

# STRCMP（string1，string2) 逐字符比较两个字符串大小
select strcmp('hsp', 'jsp') from dual;

# substring(str, position [, length])
# 从str的positon开始，【从1开始计算】，取出length个字符
# 从ename列的第一个位置开始取出2个字符
select substring(ename, 1, 2) from emp;

# LTRIM（string2) RTRIM（string2) trim  去除前端空格或后端空格
select LTRIM('  韩顺平教育') from dual;
select RTRIM('韩顺平教育   ') from dual;
select TRIM('  韩顺平教育   ') from dual;

# 以首字母大写的方式显示所有员工emp表的姓名
# 方法1
# 先取出ename的第一个字符，转成大写的
# 再把它和后面的字符串进行拼接输出即可
select concat(ucase(substring(ename, 1, 1 )), substring(ename, 2)) as new_name
		from emp;	
# 方法2		
select concat(ucase(left(ename, 1)), substring(ename, 2)) as new_name
		from emp;

