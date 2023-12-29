# 演示时间相关类型
# 创建一张表 date， datetime，timestamp
create table t14 (
		birthday date,
		 job_time datetime,
		 login_time timestamp not null default current_timestamp on update CURRENT_TIMESTAMP);
		 # 登录时间，如果希望login_time列自动更新，需要配置
		 
select * from t14;

insert into t14(birthday, job_time) 
		values('2023-12-12', '2022-12-12 12:12:12');
		
# 如果更新了 t14表的某条记录，login_time列会自动的以当前时间进行更新