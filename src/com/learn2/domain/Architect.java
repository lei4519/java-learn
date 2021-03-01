package com.learn2.domain;

import com.learn2.service.Status;

public class Architect extends Designer {
    double stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, double bonus, double stock) {
        super(id, name, age, salary, bonus);
        this.stock = stock;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }
}
