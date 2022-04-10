
use mycompany ;

-- update statement
update employee 
set salary =60000
where id= 1003;

select * from employee;


update employee 
set salary = salary + 2000
where department = 'IT';

select * from employee;


-- delete statement
delete from employee
where id=1014;

select * from employee;


-- alter table statement
-- add
-- modify
-- drop
-- change
-- rename 

desc employee;


-- alter table with add 
alter table employee
add vaccination varchar(3);

desc employee;


select * from employee;

update employee
set vaccination= 'Yes' where id in(1003,1007,1012);

 
alter table employee
add grade varchar(1);


-- alter table with drop 
alter table employee
drop column	grade;

desc employee;


-- alter table with modify 
alter table employee
modify name varchar(60) ;

-- alter table with change 
alter table employee
change Department dept varchar(70);
desc employee;


-- alter table with rename : rename table  
alter table employee 
rename emp;

alter table emp
rename employee ;
desc emp;



-- Aggregate Functions
select sum(salary) from employee;
select avg(salary) from employee;
select min(salary) from employee;
select max(salary) from employee;


-- Aggregate count with null 
select count(*) from employee;

-- Aggregate count without null 
select count(vaccination) from employee;

 
 
 -- Aggregate sum with where  
select sum(salary) from  employee where dept = 'IT';



-- order by 
select * from employee order by age;
select * from employee order by dept asc;
select * from employee order by name;

-- order by with desc
select * from employee order by age desc;

-- order by with condition
select * from employee  
where city='London' 
order by Name  ;


-- order by with multiple order 
select id, dept, name, salary, city ,age, gender
from employee
order by dept, city desc;


-- group by 

select dept, count(*) 
from employee
group by dept;


select dept, sum(salary) 
from employee
group by dept;


-- group by with having 
select dept, sum(salary) 
from employee
group by dept
having sum(Salary) > 200000;


-- types of constraint
-- not null 
-- unique constraint
-- default constraint
-- check constraint


-- not null constraint
create table tcr_student
(rollno int  not null,
name varchar(50),
branch varchar(30),
mobile varchar(10));

show tables;
desc tcr_student ;

insert into tcr_student(branch, mobile) values ('CS', '4334');

select * from tcr_student;


-- unique constraint
create table tcr_employee
(empid int unique, name varchar(20));

insert into tcr_employee values(1, 'aaa');
insert into tcr_employee values(1, 'bbbb');			-- error

drop table  tcr_employee;

-- default constraint
create table tcr_employee (
empid int not null,
name varchar(50) not null,
age int,
country varchar(30) default 'India',
doj timestamp default current_timestamp ) ;

insert into tcr_employee (empid, name, age) values(1,'Raj',30);
select * from tcr_employee;
drop table  tcr_employee;


-- check constraint
create table tcr_employee (
empid int not null check (empid between 1 and 1000),
name varchar(50) not null,
age int not null check (age >=18));

insert into tcr_employee values(1,'Raj', 20);
select * from tcr_employee;

insert into tcr_employee values(-1,'Raj', 20);			-- error
insert into tcr_employee values(2,'Simran', 10);		-- error

