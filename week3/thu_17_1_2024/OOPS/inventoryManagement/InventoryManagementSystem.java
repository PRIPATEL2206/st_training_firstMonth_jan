package inventoryManagement;


public class InventoryManagementSystem {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Category electronics = new Category("Electronics");
        warehouse.addCategory(electronics);

        Product laptop = new Product("L001", "Laptop", 999.99);
        warehouse.addProductToCategory("Electronics", laptop);

        warehouse.updateStock("L001", 10);

        warehouse.generateInventoryReport();
    }
}

