#备份，要在终端执行mysqldump指令，在mysql安装目录/bin
#这个备份的文件就是对应的sql语句
mysqldump -u root -p -B hsp_db02 hsp_db03 > bak.sql

drop database hsp_db02;
drop database hsp_db03;

#恢复数据库（注意：进入mysql 命令行再执行)
source bak.sql

#备份库的表
# mysqldump -u 用户名 -p密码 数据库 表1 表2 表n > 文件名.sql
mysqldump -u root -p hsp_db02 t1 > bakt1.sql

