create database college;
create database company ;

show databases;

use college;
drop database company;


create table students ( rollno int,
firstname varchar(50),
lastname varchar(50),
dob date, 
fees decimal(10,2));

create table  department (
deptid int,
deptname varchar(20))


insert into students values(1, 'Raj', 'Varma','2002-08-4',25000);

select * from students ;
insert into students values(2, 'Simran', 'Sharma','2000-03-02',20000);
select * from students ;

show tables;

desc students;
describe students;

select * from students;


drop table department;

show tables;


desc students;


select rollno, firstname from students;

select rollno, firstname,dob from students;

select * from students 
where rollno =1;

select * from students 
where rollno =2;

select firstname ,rollno from students
where rollno >=2;

 
select firstname ,rollno from students
where rollno <> 5;


select * from students ;


select * from students where rollno=1 and firstname ='Simran';
select * from students where rollno=1 or firstname ='Simran';

select * from students where not firstname ='Simran';











Database : reliance
Table : Employee
insert two employee details

Create database reliance;
Use reliance;
Create table employees (emp_Id int , Fname varchar(20), Lname varchar(20),dob date);
Desc employees;
Insert into employees values(111,'Suraj','singh' ,'1973-09-10');
Select * from employees;




