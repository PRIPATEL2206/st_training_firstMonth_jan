-- assingment 3

-- 8)create 2 view for each database 

--1)
use inventory_management;
select * from employees
create view emp_view as select eid,ename,Contactno,join_date from employees where salary>50000;
select * from emp_view;

create view manager_view as select ename,Contactno,(select warehouse_name from warehouses where eid=manager_id)as warehouse_name from employees
select * from manager_view;

--2)
use library_management;
create view auther_view as select * ,(select COUNT(1) from Book_Table where author_id=Author_Table.author_id  )num_of_books  from Author_Table
select * from auther_view

create view genre_view as select name,(select COUNT(1) from Book_Table where genre_id=Genre_Table.genre_id)no_of_books  from Genre_Table
select * from genre_view;

--3)
use social_media;
create view user_post as select username,email_id,(select count(1) from Posts where user_id=Users.user_id)no_post from Users;
select * from user_post

create view post_view as select content,(select username from Users where user_id=Posts.user_id)username,(select count(1) from Comments where post_id=Posts.post_id)no_coments from Posts
select * from post_view;


-- 9)create 2 scalar-valued functions

-- 1)
use inventory_management;
create function dbo.getInHandSalary
(
@salary FLOAT
)
RETURNS FLOAT
AS
BEGIN
	RETURN @salary - 30;
END;

select ename,dbo.getInHandSalary(salary)inhandsalary from employees

create function dbo.getDiscountAmount(
@prize float
)
returns float
as
begin
	return @prize-@prize/10;
end;
select product_name,dbo.getDiscountAmount(prize)prize from products;


--2)
use	library_management;
create function dbo.getAge(
@dob DATETIME
)
returns INT
as
begin
return DATEDIFF(YEAR,@dob,GETDATE())
end;

select author_name,dbo.getAge(birthday) from Author_Table;

create function dbo.cusConct(
@str1 NVARCHAR(50),
@str2 NVARCHAR(50)
)
Returns NVARCHAR(100)
as
begin
return CONCAT(@str1,' ',@str2)
end;

DROP FUNCTION IF EXISTS dbo.cusConct;

select dbo.cusConct(name,description) from Genre_Table

--3)
use social_media;

create function dbo.cusDateDiff
(
@date1 DateTime,
@date2 DATETIME
)
returns INT
as
begin
return DATEDIFF(DAY,@date1,@date2)
end;

select dbo.cusDateDiff((select created_at from Posts where post_id=Likes.post_id),liked_at)t,(select content from Posts where post_id=Likes.post_id)content from Likes;

create function dbo.getFirstname
(
@name NVARCHAR(50)
)
returns NVARCHAR(1)
as
begin
return LEFT(@name,1)
end;

select dbo.getfirstname(username),email_id from Users



--10)create 5 store procedures

-- 1)
use inventory_management;

--add
CREATE PROCEDURE addEmployee
(
@ename VARCHAR(50),
@contect VARCHAR(50),
@desig varchar(100),
@salary int
)
as
begin
insert into employees (ename,Contactno,designation,salary,join_date)
values (@ename,@contect,@desig,@salary,GETDATE())
end;

exec addEmployee 'kartic','123-456-789-0','programer','50000';

--read
CREATE PROCEDURE readAllEmployee
as
begin
select * from employees;
end;

exec readAllEmployee;


--update 
CREATE PROCEDURE UpdateEmployeeInfo
    @eid INT,
    @Contactno VARCHAR(50),
    @designation VARCHAR(100),
    @salary INT,
    @join_date DATE
AS
BEGIN
    UPDATE employees
    SET 
        Contactno = @Contactno,
        designation = @designation,
        salary = @salary,
        join_date = @join_date
    WHERE
        eid = @eid;
END;
exec UpdateEmployeeInfo 2,'222-444-666-5555','manager',65000,'2022-01-15';

--delete
CREATE PROCEDURE DeleteEmployee
    @eid INT
AS
BEGIN
    DELETE FROM employees
    WHERE
        eid = @eid;
END;

exec DeleteEmployee 2 ;

--increment salary
CREATE PROCEDURE IncrementSalary
as 
begin
 update employees
 SET salary=salary+salary/20
end;

exec IncrementSalary



-- 2)
use library_management;

--add
CREATE PROCEDURE AddMember
    @member_name VARCHAR(200),
    @ending_date DATETIME,
    @address VARCHAR(500),
    @phone_no VARCHAR(10)
AS
BEGIN
    INSERT INTO Members_Table (member_name, Join_Date, ending_date, address, phone_no)
    VALUES (@member_name, GETDATE(), @ending_date, @address, @phone_no);
END;
exec AddMember 'kartic','3-3-2024','address ','123-456-789-0';

--read
CREATE PROCEDURE GetMemberInfo
    @member_id INT
AS
BEGIN
    SELECT * FROM Members_Table WHERE member_id = @member_id;
END;
exec GetMemberInfo 1;


--update 
CREATE PROCEDURE UpdateMember
    @member_id INT,
    @member_name VARCHAR(200),
    @Join_Date DATETIME,
    @ending_date DATETIME,
    @address VARCHAR(500),
    @phone_no VARCHAR(10)
AS
BEGIN
    UPDATE Members_Table
    SET
        member_name = @member_name,
        Join_Date = @Join_Date,
        ending_date = @ending_date,
        address = @address,
        phone_no = @phone_no
    WHERE
        member_id = @member_id;
END;
exec UpdateMember 1,'kartic','2-2-2023','3-2-2024','adress2','123-456-789-0';

--delete
CREATE PROCEDURE DeleteMember
    @member_id INT
AS
BEGIN
    DELETE FROM Members_Table WHERE member_id = @member_id;
END;

exec DeleteEmployee 2 ;

--extend ebnding date
CREATE PROCEDURE extendEbndingDate
(
@member_id INT,
@days INT
)
as 
begin
 update Members_Table
 SET ending_date=DATEADD(DAY,@days,ending_date)
 where member_id=@member_id
end;

exec extendEbndingDate 1, 30;

--3)
use social_media;

-- add
CREATE PROCEDURE AddUser
    @username VARCHAR(50),
    @email_id VARCHAR(100),
    @password VARCHAR(255),
    @profile_picture VARBINARY(MAX),
    @is_active BIT
AS
BEGIN
    INSERT INTO Users (username, email_id, password, profile_picture, is_active)
    VALUES (@username, @email_id, @password, @profile_picture, @is_active);
END;

--get user
CREATE PROCEDURE GetUser
    @user_id INT
AS
BEGIN
    SELECT * FROM Users WHERE user_id = @user_id;
END;

--update user
CREATE PROCEDURE UpdateUser
    @user_id INT,
    @username VARCHAR(50),
    @email_id VARCHAR(100),
    @password VARCHAR(255),
    @profile_picture VARBINARY(MAX),
    @is_active BIT
AS
BEGIN
    UPDATE Users
    SET
        username = @username,
        email_id = @email_id,
        password = @password,
        profile_picture = @profile_picture,
        is_active = @is_active
    WHERE
        user_id = @user_id;
END;

--delete
CREATE PROCEDURE DeleteUser
    @user_id INT
AS
BEGIN
    DELETE FROM Users WHERE user_id = @user_id;
END;

--get latest posts
CREATE PROCEDURE GetLatestUserPosts
    @user_id INT,
    @num_posts INT
AS
BEGIN
    SELECT TOP(@num_posts) post_id, user_id, content, created_at, media_type, media_url
    FROM Posts
    WHERE user_id = @user_id
    ORDER BY created_at DESC;
END;



-- 11) create 2 non-clustered index

-- 1)
use inventory_management;
create nonclustered index in_employeeIndex
on employees(ename)

create nonclustered index in_productIndex
on products(product_name,prize)


--2)
use library_management;
create nonclustered index li_autherIndex
on Author_Table(author_name)

create nonclustered index li_bookIndex
on Book_Table(title,author_id)

--3)
use social_media;
create nonclustered index so_userIndex
on Users(username,email_id)

create nonclustered index so_postIndex
on Posts(user_id,content)


--12)  Create Before and After triggers for insert, update and delete operations.

-- 1)
use inventory_management

-- BEFORE INSERT trigger
CREATE TRIGGER before_insert_user
ON employees
for INSERT
AS
BEGIN
	PRINT 'BEFORE INSERT EMPLOYEE Trigger executed';

END;
drop trigger before_insert_user

-- Create an AFTER INSERT trigger
CREATE TRIGGER after_insert_user
ON employees
AFTER INSERT
AS
BEGIN
    PRINT 'AFTER INSERT EMPLOYEE Trigger executed';
END;



-- Create a BEFORE UPDATE trigger
CREATE TRIGGER BeforeUpdateEmp
ON employees
FOR UPDATE
AS
BEGIN
  PRINT 'AFTER UPDATE EMPLOYEE Trigger executed';
END;


-- Create an AFTER UPDATE trigger
CREATE TRIGGER trgAfterUpdateEmp
ON employees
AFTER UPDATE
AS
BEGIN
    PRINT 'AFTER UPDATE EMPLOYEE Trigger executed';
END;

-- Create a BEFORE DELETE trigger
CREATE TRIGGER trgBeforeDeleteEmp
ON employees
FOR DELETE
AS
BEGIN
	PRINT 'AFTER DELETE EMPLOYEE Trigger executed';
END;


-- Create an AFTER DELETE trigger
CREATE TRIGGER trgAfterDeleteEmp
ON employees
AFTER DELETE
AS
BEGIN
    PRINT 'AFTER DELETE EMPLOYEE Trigger executed';
END;



-- 2)
use library_management;

-- BEFORE INSERT trigger
CREATE TRIGGER before_insert_auther
ON Author_Table
for INSERT
AS
BEGIN
    PRINT 'BEFORE INSERT Author Trigger executed';
END;


-- Create an AFTER INSERT trigger
CREATE TRIGGER after_insert_Author
ON Author_Table
AFTER INSERT
AS
BEGIN
    PRINT 'AFTER INSERT Author Trigger executed';
END;

-- Create a BEFORE UPDATE trigger
CREATE TRIGGER BeforeUpdateAuthor
ON Author_Table
FOR UPDATE
AS
BEGIN
  PRINT 'AFTER UPDATE Author Trigger executed';
END;

-- Create an AFTER UPDATE trigger
CREATE TRIGGER trgAfterUpdateAuthor
ON Author_Table
AFTER UPDATE
AS
BEGIN
    PRINT 'AFTER UPDATE Author Trigger executed';
END;

-- Create a BEFORE DELETE trigger
CREATE TRIGGER trgBeforeDeleteAuthor
ON Author_Table
for DELETE
AS
BEGIN
	PRINT 'AFTER DELETE Author Trigger executed';
END;


-- Create an AFTER DELETE trigger
CREATE TRIGGER trgAfterDeleteAuthor
ON Author_Table
AFTER DELETE
AS
BEGIN
    PRINT 'AFTER DELETE Author Trigger executed';
END;


-- 3)
use social_media;

-- BEFORE INSERT trigger
CREATE TRIGGER before_insert_users
ON Users
instead of INSERT
AS
BEGIN
    PRINT 'BEFORE INSERT users Trigger executed';
END;

-- Create an AFTER INSERT trigger
CREATE TRIGGER after_insert_users
ON Users
AFTER INSERT
AS
BEGIN
    PRINT 'AFTER INSERT users Trigger executed';
END;

-- Create a BEFORE UPDATE trigger
CREATE TRIGGER BeforeUpdateusers
ON Users
FOR UPDATE
AS
BEGIN
  PRINT 'AFTER UPDATE users Trigger executed';
END;


-- Create an AFTER UPDATE trigger
CREATE TRIGGER trgAfterUpdateusers
ON Users
AFTER UPDATE
AS
BEGIN
    PRINT 'AFTER UPDATE users Trigger executed';
END;


-- Create a BEFORE DELETE trigger
CREATE TRIGGER trgBeforeDeleteusers
ON Users
for DELETE
AS
BEGIN
	PRINT 'AFTER DELETE users Trigger executed';
END;

drop trigger trgBeforeDeleteusers;
-- Create an AFTER DELETE trigger
CREATE TRIGGER trgAfterDeleteusers
ON Users
AFTER DELETE
AS
BEGIN
    PRINT 'AFTER DELETE users Trigger executed';
END;



-- 13) Write SQL queries for Union and Union All.

--1)
use inventory_management;

select * from employees where eid in (select manager_id from warehouses)
union
select * from employees 

select * from employees where eid in (select manager_id from warehouses)
union all
select * from employees

-- 2)
use library_management;
select * from Book_Table where Book_id in (select book_id from Loans)
union
select * from Book_Table 

select * from Book_Table where Book_id in (select book_id from Loans)
union all
select * from Book_Table 

-- 3)
use social_media;
select * from Users where user_id in (select user_id  from Posts)
union
select * from Users 
select * from Users where user_id in (select user_id  from Posts)
union all
select * from Users 


-- 14) Create Data Dictionary.

use inventory_management
Select Table_name,column_name,ORDINAL_POSITION,is_nullable,data_type,CHARACTER_MAXIMUM_LENGTH,CHARACTER_OCTET_LENGTH From INFORMATION_SCHEMA.COLUMNS 

use library_management
Select Table_name,column_name,ORDINAL_POSITION,is_nullable,data_type,CHARACTER_MAXIMUM_LENGTH,CHARACTER_OCTET_LENGTH From INFORMATION_SCHEMA.COLUMNS 

use social_media
Select Table_name,column_name,ORDINAL_POSITION,is_nullable,data_type,CHARACTER_MAXIMUM_LENGTH,CHARACTER_OCTET_LENGTH From INFORMATION_SCHEMA.COLUMNS 


-- 18) defrent typrs of joins

-- 1)
use	inventory_management;
select * from employees
Inner Join warehouses
on warehouses.manager_id=employees.eid

select * from employees
left Join warehouses
on warehouses.manager_id=employees.eid

select * from employees
right Join warehouses
on warehouses.manager_id=employees.eid

select * from employees
full Join warehouses
on warehouses.manager_id=employees.eid

-- 2)
use	library_management;
select * from Author_Table
Inner Join Book_Table
on Author_Table.author_id=Book_Table.author_id

select * from Author_Table
left Join Book_Table
on Author_Table.author_id=Book_Table.author_id

select * from Author_Table
right Join Book_Table
on Author_Table.author_id=Book_Table.author_id


select * from Author_Table
full Join Book_Table
on Author_Table.author_id=Book_Table.author_id


-- 3)
use	social_media;
select * from Users
Inner Join Posts
on Users.user_id=Posts.post_id

select * from Users
Right Join Posts
on Users.user_id=Posts.post_id

select * from Users
left Join Posts
on Users.user_id=Posts.post_id

select * from Users
full Join Posts
on Users.user_id=Posts.post_id

