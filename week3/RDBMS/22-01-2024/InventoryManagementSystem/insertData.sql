INSERT INTO products(product_name,catagory,description_text,quantity_in_stock,reorder_level,prize,add_datetime)
VALUES 
	('TV','Electronics','LCD TV',200,5,50000,GETDATE()),
	('shirt','Clothing','formal shirt',1000,10,500,GETDATE()),
	('alt','Home Goods','tata salt',2000,100,50,GETDATE()),
	('washing machine','Electronics','Washing machine',200,5,20000,GETDATE()),
	('rich dad poor dad','Books','intrsting book to read',200,5,1000,GETDATE());

INSERT INTO suppliers(supplier_name,contact_person,phone_number,email_id,add_datatime)
VALUES 
	('gada electronics','jathalal','111-111-111','jathlala@no1.com',GETDATE()),
	('ramesh Cloth','rameshhai','222-222-222','ramesh@gmail.com',GETDATE()),
	('tata goods','ratan tata','777-777-777','tatagood@gmail.com',GETDATE()),
	('amazon','bill gates','333-333-333','amazon@gmail.com',GETDATE());

INSERT INTO order_table (supplier_id, total_amount, order_status, order_datetime)
VALUES
    (1, 150.00, 'Processing', '2022-01-15T10:30:00'),
    (1, 200.50, 'Shipped', '2022-02-20T15:45:00'),
    (1, 75.25, 'Delivered', '2022-03-10T08:15:00'),
    (1, 300.75, 'Processing', '2022-04-05T12:00:00'),
    (1, 180.00, 'Shipped', '2022-05-18T14:20:00');

INSERT INTO employees (ename, Contactno, designation, salary, join_date)
VALUES
    ('John Doe', '123-456-7890', 'Manager', 60000, '2022-01-15'),
    ('Jane Smith', '987-654-3210', 'Developer', 50000, '2022-02-20'),
    ('Alice Johnson', '555-123-4567', 'Analyst', 45000, '2022-03-10'),
    ('Bob Williams', '111-222-3333', 'Designer', 55000, '2022-04-05'),
    ('Eva Brown', '999-888-7777', 'Tester', 48000, '2022-05-18');


INSERT INTO warehouses (warehouse_name, current_location, capacity, manager_id)
VALUES
    ('Warehouse A', 'Location A', 10000, 1),
    ('Warehouse B', 'Location B', 15000, 2),
    ('Warehouse C', 'Location C', 12000, 3);
