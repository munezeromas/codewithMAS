package org.example;

interface Rechargeable {
    void recharge();
}

abstract class Appliance {
    abstract void turnOn();
}

class Phone extends Appliance implements Rechargeable {
    public void recharge() {
        System.out.println("Phone is charging......");
    }

    public void turnOn() {
        System.out.println("Phone is now on!!!!!!");
    }
}

