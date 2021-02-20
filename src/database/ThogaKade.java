package database;

import model.Customer;

import java.util.ArrayList;

public class ThogaKade {
    public static ArrayList<Customer> customerTable= new ArrayList();

    static {
      customerTable.add(new Customer("C-001","Nimal","Colombo",25000));
      customerTable.add(new Customer("C-002","Bandara","Panadura",45000));
      customerTable.add(new Customer("C-003","Wasantha","Kalutara",78500));
      customerTable.add(new Customer("C-004","Kalpa","Galle",24500));
      customerTable.add(new Customer("C-005","Samantha","Matara",16500));
    }
}
