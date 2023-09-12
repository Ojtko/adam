package com.company;

public class Main {

    public static void main(String[] args) {
        LiczbaHolder lh1 = new LiczbaHolder(2);
        LiczbaHolder lh2 = new LiczbaHolder(30);
        for(int i = 0; i<lh2.a; i++){
            lh1.a = lh1.a * lh1.a;
            System.out.println(lh1.a);
        }

    }
}
