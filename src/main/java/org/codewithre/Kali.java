package org.codewithre;

public class Kali extends Biner {
    public Kali(double op1, double op2) {
        super(op1, op2);
    }

    @Override
    public double hitung() {
        return getOp1() * getOp2();
    }

    @Override
    public String toString() {
        return getOp1() + " * " + getOp2();
    }
}