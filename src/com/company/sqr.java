package com.company;

public class sqr {
    int field;
    int circuit;

    sqr(int a) {
        this.field = a;
        this.circuit = a;
    }
    void count_field() {
        System.out.println("Pole to: " + this.field * this.field);
    }
    void count_circuit() {
        System.out.println("Obwód to: " + this.circuit * 4);
    }
}
