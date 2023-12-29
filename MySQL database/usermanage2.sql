## Mysql用户管理

-- 做项目开发时，可以根据不同的开发人员，赋给他相应的Mysql操作权限
-- 所以，Mysql数据库管理人员（root），根据需要创建不同的用户，赋给相应的权限，供人员使用

-- 1. 创建新的用户
-- 解读：1）'hsp_edu'@'localhost' 表示用户的完整信息，'hsp_edu' 是用户名，'localhost' 是登录的IP
--    2）'123456' 是密码，但是注意：存放到 mysql.user 表时，是password（'123456'）加密后的密码			
create user 'hsp_edu'@'localhost' identified by '123456'

select `host`, `user`, authentication_string
		from mysql.user
		
-- 2. 删除用户
drop user 'hsp_edu'@'localhost'

# 普通用户
-- 修改自己密码
set password = password('abcdef')

-- 修改其他人密码，需要权限
set password for 'root'@'localhost' = password('abcdef')

# root用户修改 'hsp_edu'@'localhost' 密码，可以成功
set password for 'hsp_edu'@'localhost' = password('abcdef')

