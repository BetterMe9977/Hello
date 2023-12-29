## homework05

-- 创建表 系表 department (系号 departmentid 系名 deptname
create table department (
		departmentid varchar(32) primary key,
			deptname varchar(32) unique not null);
			
-- 创建班级表 class (班号 classid 专业名subject 系名 deptname 入学年份enrolltime 人数num）
create table class (
		classid int primary key,
			subject varchar(32) not null default '',
			deptname varchar(32), -- 外键字段，在表定义后指定
			enrolltime int not null default 2000,
			num int not null default 0,
			foreign key (deptname) references department(deptname)
			);
-- 学生表 student（学号 studentid 姓名name 年龄age 班号 classid
create table hsp_student(
		studentid int primary key,
			`name` varchar(32) not null default '',
			age int not null default 0,
			classid int,  -- 外键
			foreign key (classid) references class(classid));
			
-- 添加测试数据

insert into department values('001', '数学');
insert into department values('002', '计算机');
insert into department values('003', '化学');
insert into department values('004', '中文');
insert into department values('005', '经济');

insert into class values('101', '软件', '计算机', 1995, 20);
insert into class values('102', '微电子', '计算机', 1996, 30);
insert into class values('111', '无机化学', '化学', 1995, 29);
insert into class values('112', '高分子化学', '化学', 1996, 25);
insert into class values('121', '统计数学', '数学', 1995, 20);
insert into class values('131', '现代语言', '中文', 1996, 20);
insert into class values('141', '国际贸易', '经济', 1997, 30);
insert into class values('142', '国际金融', '经济', 1996, 14);

		
insert into hsp_student values(8101, '张三', 18, 101);
insert into hsp_student values(8102, '钱四', 16, 121);
insert into hsp_student values(8103, '王玲', 17, 131);
insert into hsp_student values(8105, '李飞', 19, 102);
insert into hsp_student values(8109, '赵四', 18, 141);
insert into hsp_student values(8110, '李可', 20, 142);
insert into hsp_student values(8201, '张飞', 18, 111);
insert into hsp_student values(8302, '周瑜', 16, 112);
insert into hsp_student values(8203, '王亮', 17, 111);
insert into hsp_student values(8305, '董庆', 19, 102);
insert into hsp_student values(8409, '赵龙', 18, 101);

select * from department 
select * from class
select * from hsp_student

-- 1) 找出所有姓李的学生
select *
		from hsp_student
			where `name` like '李%' 
			
-- 2） 列出所有开设超过1个专业的系的名字
select count(*) as c, deptname
		from class
			group by deptname 
			having c > 1

-- 3） 列出人数大于等于30的系的编号和名字
-- 先查出各个系有多少人

select sum(num) as nums, deptname 	
		from class
			group by deptname	
		having nums >= 30

-- 将上面的查询结果看作一个临时表 和 department 表联合查询
select tmp.*, departmentid 
		from department, (
							select sum(num) as nums, deptname 									from class
						group by deptname	
						having nums >= 30
			) tmp
			where department.deptname = tmp.deptname;
			
-- 4) 学校又新增加了一个物理系，编号为006
-- 添加一条数据
insert into department values('006', '物理系')

-- 5） 学生张三退学，请更新相关的表
-- 张三从学生表删除，需要使用事务控制
-- 开启事务
start transaction 
-- 张三所在的班级的人数-1
update class set num = num - 1
		where classid = (
						select classid 
								from hsp_student
								where name = '张三'
						)
delete 
		from hsp_student
			where name = '张三';

-- 提交事务
commit;
			
select * from hsp_student
select * from class

