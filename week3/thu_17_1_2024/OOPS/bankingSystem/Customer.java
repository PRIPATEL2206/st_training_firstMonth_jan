package bankingSystem;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private static int nextCustomerId = 1;

    private int id;
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.id = nextCustomerId++;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
