/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;

/**
 *
 * @author kunal
 */
public class ListImplementations {

    public static void main(String[] args) {

        System.out.println("****ArrayList****");
        try {
            ArrayList<String> fruits = new ArrayList<String>();
            ArrayList<String> allSeasonFruits = new ArrayList<String>();
            allSeasonFruits.add("Banana");
            allSeasonFruits.add("Apple");
            fruits.add("Apple");
            fruits.add("Orange");
            fruits.add("Pineapple");
            fruits.add("Dragon fruit");
            fruits.remove("Apple");
            System.out.println("Removed apple and added new item at position 2");
            fruits.add(2, "New Item");
            System.out.println("added collection");
            fruits.addAll(allSeasonFruits);
            System.out.println(fruits);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("");
        System.out.println("****LinkedList****");
        try {
            ArrayList<String> fruits = new ArrayList<String>();
            ArrayList<String> allSeasonFruits = new ArrayList<String>();
            allSeasonFruits.add("Banana");
            allSeasonFruits.add("Apple");
            fruits.add("Apple");
            fruits.add("Orange");
            fruits.add("Pineapple");
            fruits.add("Dragon fruit");
            fruits.remove("Apple");
            fruits.add(2, "New Item");
            fruits.addAll(allSeasonFruits);
            System.out.println(fruits);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("");
        System.out.println("****HashSet****");
        try {
            HashSet<String> vehicles = new HashSet<String>();
            vehicles.add("Thar");
            vehicles.add("Jeepsy");
            vehicles.add("Swift");
            vehicles.add("Amaze");
            vehicles.add("Ertiga");
            vehicles.add("Virtus");
            vehicles.add("Thar");
            vehicles.add("Amaze");
            vehicles.add(null);
            System.out.println(vehicles);
            Iterator<String> i = vehicles.iterator();
            while (i.hasNext()) {
                System.out.println(i.next());
            }
            if (vehicles.contains("Amaze")) {
                vehicles.remove("Amaze");
                System.out.println("Amaze is Removed");
                System.out.println(vehicles);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("");
        System.out.println("****TreeSet****");
        try {
            TreeSet<String> vehicles = new TreeSet<String>();
            vehicles.add("Thar");
            vehicles.add("Jeepsy");
            vehicles.add("Swift");
            vehicles.add("Amaze");
            vehicles.add("Ertiga");
            vehicles.add("Virtus");
            vehicles.add("Thar");
            vehicles.add("Amaze");
//            vehicles.add(null);3
            System.out.println(vehicles);
            Iterator<String> i = vehicles.iterator();
            while (i.hasNext()) {
                System.out.println(i.next());
            }
            if (vehicles.contains("Amaze")) {
                vehicles.remove("Amaze");
                System.out.println("Amaze is Removed");
                System.out.println(vehicles);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("");
        System.out.println("****Priority Queue****");
        try {
            PriorityQueue<String> queue = new PriorityQueue<String>();
            queue.add("Amit");
            queue.add("Vijay");
            queue.add("Karan");
            queue.add("Jai");
            queue.add("Rahul");
            System.out.println("head:" + queue.element());
            System.out.println("head:" + queue.peek());
            System.out.println("iterating the queue elements:");
            Iterator itr = queue.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
            queue.remove();
            queue.poll();
            System.out.println("after removing two elements:");
            Iterator<String> itr2 = queue.iterator();
            while (itr2.hasNext()) {
                System.out.println(itr2.next());
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("**** HashMap****");
        HashMap<Integer, String> map = new HashMap<Integer, String>();//Creating HashMap    
        map.put(1, "Mango");  //Put elements in Map  
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");
        System.out.println("element with key 3 is removed");
        System.out.println(map.values());
        map.remove(3);
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("");
        System.out.println("****Tree Map****");

        try {
            TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
            tmap.put(100, "Amit");
            tmap.put(102, "Ravi");
            tmap.put(101, "Vijay");
            tmap.put(103, "Rahul");
            System.out.println("Before invoking remove() method");
            for (Map.Entry m : map.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }
            map.remove(102);
            System.out.println("After invoking remove() method");
            for (Map.Entry m : map.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("");
        System.out.println("****Stream*****");

        List<Integer> numbers = new ArrayList();
        for (int i = 1; i <= 8; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        System.out.println("Elements in List of numbers : " + numbers.stream().count());
        List even = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(even);
        System.out.println("Square of elements of List");
        System.out.println(numbers.stream().map(x -> x * x).collect(Collectors.toList()));
        System.out.println("Maximum from List of numbers : " + numbers.stream().max(Integer::compare).get());
        System.out.println("Minimum from List of numbers : " + numbers.stream().min(Integer::compare).get());

    }
}
