package org.example;

public abstract class WR implements IUmrechnen{

    protected WR next;

    public void setNext(WR next) {
        this.next = next;
    }

    public abstract double umrechnen(String variante, double betrag);

}
