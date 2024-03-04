use inventory_management;

--string function
select CONCAT(ename,' ',designation) as name_post from employees;
select LOWER(warehouse_name)warehouse_name,LOWER(current_location)current_location,(select ename from employees where eid=manager_id)manager from warehouses
select lower(CONCAT(product_name,' ' ,catagory,' ',' ',description_text)) from products;

--math functins
select ROUND(total_amount,1) from order_table;
select abs(-salary) from employees;
select prize,SIGN(prize)'sign'  from products;

--Date fuction
select order_status,DATEDIFF(DAY,order_datetime,GETDATE()) from order_table;
select product_name,month(add_datetime) from products;
select product_name,FORMAT(add_datetime,'MM/dd/yyyy') from products;

--advance fuctions
select warehouse_name,(capacity-LAG(capacity) over(order by warehouse_name)) as cn from warehouses;
select isNull(capacity-LAG(capacity) over(order by warehouse_name),capacity) 'hasprew' from warehouses; 


use library_management;
--1.TABLE-auther

--string function
SELECT CONCAT(author_name,nationality) from Author_Table
SELECT LEFT(biography,5) from Author_Table;
select	REPLACE(author_name,' ','_') from Author_Table

--date function
SELECT DATEDIFF(YEAR,birthday,GETDATE()) from Author_Table
selECT MONTH(birthday) FROM Author_Table;
selECT year(birthday) FROM Author_Table;

--date

SELECT DATEDIFF(MONTH,loan_date,return_date)month_diff from Loans;
SELECT MONTH(loan_date)'month' from Loans;
SELECT year(return_date)'year' from Loans;


use social_media;
--1.TABLE-USERS

--string function

SELECT CONCAT(userName, ' ', email_id) AS user_contact_info FROM Users;
SELECT LEFT(userName, 5) AS LeftPartUserName FROM Users;
SELECT LEN(password) AS password_length FROM Users;

--numeric function

SELECT COUNT(*)
 FROM Users;
SELECT AVG(LEN(userName)) AS avg_username_length FROM Users;
SELECT MAX(user_id) FROM Users;


--advanced function
SELECT user_id, ISNULL(email_id, 'No Email') AS Email FROM Users;
SELECT user_id, password, ISNUMERIC(password) AS IsPasswordNumeric FROM Users;


--2.TABLE-POSTS

--string function
SELECT SUBSTRING(content, 1, 10) FROM Posts;
SELECT REPLACE(content, 'oldWord', 'newWord') FROM Posts;
SELECT LEN(content) FROM Posts;

--numeric function
SELECT COUNT(*)
 FROM Posts;
SELECT MAX(LEN(content)) FROM Posts;

--date function
SELECT post_id, created_at, DATEADD(day, 10, created_at) AS DatePlus10Days FROM Posts;
SELECT YEAR(created_at) FROM Posts;

--advanced function
SELECT post_id, created_at, RANK() OVER (ORDER BY created_at DESC) AS recent_rank FROM Posts;
SELECT user_id, COUNT(*)
 AS total_posts FROM Posts GROUP BY user_id;
SELECT user_id, MIN(created_at) AS first_post_date FROM Posts GROUP BY user_id;

