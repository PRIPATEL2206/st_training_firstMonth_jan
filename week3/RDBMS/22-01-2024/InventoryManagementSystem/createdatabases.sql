CREATE TABLE products(
	product_id INT PRIMARY KEY IDENTITY(1,1),
	product_name VARCHAR(100)  NOT NULL,
	catagory VARCHAR(100),
	description_text VARCHAR(150),
	quantity_in_stock INT,
	reorder_level INT,
	prize INT,
	add_datetime DATETIME
);

CREATE TABLE suppliers(
	supplier_id INT PRIMARY KEY IDENTITY(1,1),
	supplier_name VARCHAR(100) NOT NULL,
	contact_person VARCHAR(100),
	phone_number varchar(50),
	email_id VARCHAR(100),
	add_datatime DATETIME,
);

CREATE TABLE order_table(
	order_id INT PRIMARY KEY IDENTITY(1,1),
	supplier_id INT NOT NULL FOREIGN KEY(supplier_id)REFERENCES suppliers(supplier_id),
	total_amount DECIMAL(10,2) ,
	order_status VARCHAR(100),
	order_datetime DATETIME
);

CREATE TABLE employees(
	eid INT PRIMARY KEY IDENTITY(1,1),
	ename  VARCHAR(100) NOT NULL,
	Contactno varchar(50),
	designation VARCHAR(100) ,
	salary INT, 
	join_date DATE
);


CREATE TABLE warehouses(
	wid INT PRIMARY KEY IDENTITY(1,1),
	warehouse_name  VARCHAR(100) NOT NULL,
	current_location VARCHAR(100) NOT NULL,
	capacity INT NOT NULL,
	manager_id INT 
); 