--Inline Query
USE inventory_management
select * from employees where eid IN(select manager_id from warehouses where warehouse_name='Warehouse A');
select * from suppliers where supplier_id in (select supplier_id from order_table where total_amount > 160);
select * from suppliers where supplier_id in (select supplier_id from order_table where order_status = 'Processing');

--Sub Query
select *,(select supplier_name from suppliers where supplier_id =order_table.supplier_id ) suplier from order_table where total_amount>160;
select *,(select ename from employees where eid=manager_id)ManagerName from warehouses;
select *,(select supplier_name from suppliers where supplier_id = order_table.supplier_id)AS Supplier_Name from order_table;