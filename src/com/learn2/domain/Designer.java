package com.learn2.domain;

import com.learn2.service.Status;

public class Designer extends Programmer {
    double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, double bonus) {
        super(id, name, age, salary);
        this.bonus = bonus;
    }

    public Designer(int id, String name, int age, double salary, int memberID, Status status, Equipment equipment, double bonus) {
        super(id, name, age, salary, memberID, status, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
