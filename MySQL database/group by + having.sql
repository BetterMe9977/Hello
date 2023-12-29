# 演示group by + having 
create table dept (  /*  部门表  */
		deptno MEDIUMINT UNSIGNED NOT NULL DEFAULT 0,
		   dname VARCHAR(20) NOT NULL DEFAULT "",
		   loc VARCHAR(13) NOT NULL DEFAULT ""
);
insert into dept values(10, 'accounting', 'NEW YORK'), (20, 'research', 'DALLAS'), 
		(30, 'sales', 'CHICAGO'), (40, 'operation', 'BOSTON');

select * from dept;  

# 员工表
create table emp(
		empno mediumint unsigned not null default 0, /*编号*/
			ename varchar(20) not null default "", /*名字*/
			job varchar(9) not null default "", /*工作*/
			mgr mediumint unsigned, /*上级编号*/
			hiredate date not null, /*入职时间*/
			sal decimal(7,2), /*薪水*/
			comm decimal(7,2), /*红利 奖金*/
			deptno mediumint unsigned not null default 0 /*部门编号*/
);

insert into emp values(7369, 'smith', 'clerk', 7902, '1990-12-17', 800.00, null, 20),
			(7499, 'allen', 'salesman', 7698, '1991-2-20', 1600.00, 300.00, 30),
			(7521, 'ward', 'salesman', 7698, '1991-2-22', 1250.00, 500.00, 30),
			(7566, 'jones', 'manager', 7839, '1991-4-2', 2975.00, null, 20),
			(7654, 'martin', 'salesman', 7698, '1991-9-28', 1250.00, 1400.00, 30),
			(7698, 'blake', 'manager', 7839, '1991-5-1', 2850.00, null, 30),
			(7782, 'clerk', 'manager', 7839, '1991-6-9', 2450.00, null, 10),
			(7788, 'scott', 'analyst', 7566, '1997-4-19', 3000.00, null, 20),
			(7839, 'king', 'president', NULL, '1991-11-17', 5000.00, null, 10),
			(7844, 'turner', 'salesman', 7698, '1991-9-8', 1500.00, null, 30),
			(7900, 'james', 'clerk', 7698, '1991-12-3', 950.00, null, 30),
			(7902, 'ford', 'analyst', 7566, '1991-12-3', 3000.00, null, 20),
			(7934, 'miller', 'clerk', 7782, '1991-1-23', 1300.00, null, 10);
select * from emp;
select count(*) from emp;

# 工资级别表
create table salgrade(
		grade mediumint unsigned not null default 0, /*工资级别*/
			losal decimal(17,2) not null, /*该级别的最低工资*/
			hisal decimal(17,2) not null /*该级别的最高工资*/
);

select * from salgrade;

insert into salgrade values(1, 700, 1200);
insert into salgrade values(2, 1201, 1400);
insert into salgrade values(3, 1401, 2000);
insert into salgrade values(4, 2001, 3000);
insert into salgrade values(5, 3001, 9999);

# group by 用于对查询的结果分组统计
# having 子句用于限制分组显示结果
#如何显示每个部门的平均工资和最高工资

select avg(sal), max(sal), deptno 
		from emp group by deptno;
		
# 显示每个部门的每种岗位的平均工资和最低工资
# 1. 显示每个部门的平均工资和最低工资
select avg(sal), min(sal), deptno 
		from emp group by deptno;
# 2. 每个部门的每种岗位的平均工资和最低工资
select avg(sal), min(sal), deptno, job 
		from emp group by deptno, job;


# 显示平均工资低于2000的部门号和它的平均工资 //别名
# 写sql语句，化繁为简，各个击破
# 1. 显示各个部门的平均工资和部门号
# 2. 在1的基础上，进行过滤，保留avg（sal）< 2000
# 3. 使用别名进行过滤
select avg(sal), deptno
		from emp group by deptno
					having avg(sal) < 2000;
# 使用别名
select avg(sal) as avg_sal, deptno
		from emp group by deptno
					having avg_sal < 2000;

