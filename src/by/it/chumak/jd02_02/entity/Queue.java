package by.it.chumak.jd02_02.entity;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue {

    public final Object queueMonitor = new Object();
    private final Deque<Customer> customerDeque = new ArrayDeque<>();

    public void add(Customer customer){
        synchronized (queueMonitor);
        customerDeque.addLast(customer);
    }

    public Customer extract(Customer customer){
        synchronized (queueMonitor);
        customerDeque.pollFirst();
    }
}