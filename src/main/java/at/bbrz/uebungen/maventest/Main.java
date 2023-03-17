package at.bbrz.uebungen.maventest;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Hans", null);
        Customer c2 = new Customer(2, "Claudia", null);
        Customer c3 = new Customer(3, "Mitzi", null);
        Customer c4 = new Customer(4, "Sepp", null);
        Customer c5 = new Customer(5, "Hannah", null);
        Customer c6 = Customer.builder()
                .name("Hans")
                .build();

        List<Customer> guys = new ArrayList<>();
        guys.add(c1);
        guys.add(c4);

        List<Customer> girls = new ArrayList<>();
        girls.add(c2);
        girls.add(c3);
        girls.add(c5);

        List<Customer> theNewOnes = new ArrayList<>();
        theNewOnes.add(c6);

        Collection<Customer> all = CollectionUtils.union(guys, girls);

        for (Customer customer : all) {
            System.out.println(customer);
        }

        System.out.println();

        Collection<Customer> all2 = CollectionUtils.union(all, theNewOnes);

        for (Customer customer : all2) {
            System.out.println(customer);
        }

        System.out.println();
    }
}
