package sdf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TaskMain {

    public static void main(String[] args) {

        List<Car> garage = new LinkedList<Car>();
        Set<String> addressbook = new HashSet<>();
        Map<String, Integer> debts = new HashMap<>();


        //add cars to garage
        garage.add(new Car());
        garage.add(new Porsche());

        System.out.println(garage);
        

        //add names to my addressbook
        addressbook.add("fred");
        addressbook.add("barney");
        addressbook.add("wilma");
        addressbook.add("elma");

        System.out.println(addressbook);

        //add debtors
        debts.put("fred", 10);
        debts.put("barney", 10);
        debts.put("fred", 100);

        System.out.println(debts);
    }
    
}
