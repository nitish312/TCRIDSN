create table employee(
id int primary key,
name varchar(50),
email varchar(40),
department varchar(50)
);

insert into employee values(1,'sachin','sachin@gmail.com','Sales');
insert into employee values(1,'rajesh','rajesh@gmail.com','IT');
insert into employee values(null,'rajesh','rajesh@gmail.com','IT');

drop table employee;


create table department (
deptid int primary key,
deptname varchar(50),
location varchar(30)
);

insert into department values (10, 'IT', 'Hyderabad') ;
insert into department values (20, 'HR', 'Delhi') ;
insert into department values (30, 'Finance', 'Chennai') ;


create table employee (
id int primary key,
name varchar(50),
salary decimal(10,2),
departmentId int,
foreign key	(departmentId) references department(deptid)
);


insert into employee values(1,'Anurag', 25000,10);
insert into employee values(2,'Sachin', 32000,20);
																																																							
insert into employee values(8,'aaaa', 35000,30);

create table person (
id int not null auto_increment,
name varchar(50) not null,
primary key (id)
);

insert into person (name) values ('aaaa');

select * from person ;

insert into person (name) values ('fdfdfddf');
insert into person (name) values ('yyyyy');




--  like operator
use mycompany;
select * from employee;


-- _ single character
-- % any substring


select * from employee
where name like 'S%';

select * from employee
where name like 'P%';


select * from employee
where name like '%p%';

select * from employee
where name like '%S%';


select * from employee;
 


select * from employee
where name like 'M__________';

select * from employee
where name like '__________M';


-- dispaly all names in which  second last character is h
-- dispaly all names who are having 5 character in their name.


-- numeric functions
select round(4.2) ;
select round(4.2) as "round off value" ;

select pow(2,3) ;
select sqrt(4);
select round(sqrt(5));

select abs(5);
select abs(-5);

-- string functions
select id , upper(name) from employee;
select id , lower(name) from employee;
select name, length(name) from employee;
select id, concat(name, " is working in " ,dept) from employee;
select ltrim("          sql language") ;
select rtrim("sql language         ") ;
select trim("           fsfsf             ");
select left("sql lanaguage",3) ;
select left("sql lanaguage",9) ;
select substring("java with sql intenship",5) ;
select substring("java with sql intenship",6,7) ;
select substring("java with sql intenship",10,4) ;		-- sql


-- date functins
 use college;
 select * from students;
  
select day(dob), dob from students;
select month(dob), dob from students;
select year(dob), dob from students;
select * from students where year (dob) = 2002;
select * from students where month (dob) = 8;
select current_date() ;
select dob , year (current_date()) - year (dob) from students;
 
 
-- inner join
-- matching in both tabes


 SELECT * FROM abc_college.exam;
insert into exam values (102,2, '2021-06-20');

-- inner join
select * from students inner join exam
on students.rollno = exam.rollno;

-- left join
select s.rollno, s.name,e.examdate 
from students s left join exam e
on s.rollno = e.rollno;


-- right join : all data from right side table 
select s.rollno, s.name,e.examdate 
from students s right join exam e
on s.rollno = e.rollno;


-- cross join
select * from students cross join exam ;


 