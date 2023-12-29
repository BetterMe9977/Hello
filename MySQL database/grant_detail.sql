## 用户管理细节

-- 在创建用户的时候，如果不指定host，则为% ， %表示所有IP都有权限连接
-- create user xxx

create user jack

select `host`, `user`, from mysql.user

-- 也可以这样指定
-- create user 'xxx'@'192.168.1.%' 表示xxx用户在192.168.1.* 的ip可以登录mysql

create user 'smith'@'192.168.1.%'

-- 在删除用户的时候，如果 host 不是 % ， 需要明确指定 ‘用户’@‘host值’
drop user jack  -- 默认就是 drop user 'jack'@'%'

drop user 'smith'@'192.168.1.%'


