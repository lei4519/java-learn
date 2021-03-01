package com.learn.server;

import com.learn.bean.Customer;

public class CustomerList {
    Customer[] list = new Customer[10];
    private int index = 0;

    public Customer[] getList() {
        return list;
    }

    public void editItem(int i, String name, char gender, int age) {
//        this.list[i]
    }

    public void pushItem(Customer customer) {
        this.list[index++] = customer;
    }

    public void deleteItem(int i) {
        this.list[i] = null;
    }

    public int getLength() {
        return this.list.length;
    }
}
