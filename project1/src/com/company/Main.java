package com.company;

public class Main {

    public static void main(String[] args) {
        LiczbaHolder lh1 = new LiczbaHolder(2);
        LiczbaHolder lh2 = new LiczbaHolder(30);
        System.out.println(lh1.getA());
        lh1.setA(10);
        System.out.println(lh1.getA());
        /////////////////////////
        GenericHolder gh1 = new GenericHolder(123);
        System.out.println(gh1.getA());
        gh1.setA(222);
        System.out.println(gh1.getA());
        ///////////////////////
        ObjectHolder oh1 = new ObjectHolder(123);
        System.out.println(oh1.getA());
        oh1.setA(222);
        System.out.println(oh1.getA());
    }
}
