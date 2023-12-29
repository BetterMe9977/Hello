# 演示数学相关函数

# ABS（num)  绝对值
select ABS(-10) from DUAL;

# BIN(decimal_number) 十进制转二进制
select BIN(10) from DUAL;

# ceiling(number2) 向上取整，得到比 num2 大的最小整数
select ceiling(-1.1) from DUAL;

# conv(number2, from_base, to base) 进制转换
# 下面的含义是8 是十进制的8 转成2进制输出
select conv(8, 10, 2) from dual;
# 下面的含义是8 是十六进制的8 转成十进制输出
select conv(16, 16, 10) from dual;

# FLOOR(number2) 向下取整，得到比 number2 小的最大整数
select FLOOR(1.1) from DUAL;

# FORMAT(number, decimal_places) 保留小数位数
select FORMAT(78.125458, 2) from DUAL;

# HEX(DecimalNumber) 转十六进制
select HEX(20) from DUAL;

# LEAST(number, number2 [,...]) 求最小值
select LEAST(0, 1, -10, 4) from DUAL;

# MOD(numerator, denominator) 求余
select MOD(10, 3) from DUAL;

# RAND([seed]) RAND([seed]) 返回随机数，其范围为 0 <= v <=1.0
# 1. 如果使用 rand() 每次返回不同的随机数，在0<=V<=1.0
# 2. 如果使用 rand(seed) 返回的随机数，在0<=V<=1.0, 如果seed不变，该随机数也不变
select RAND() from DUAL;
