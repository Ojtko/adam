package com.company;

public class Compare<T> {
    public void compareValues(int a, int b) {
        if(a>b){
            System.out.println("Wartosc " + a + "jest wieksza niz " + b);
        }
        if(a<b){
            System.out.println("Wartosc " + b + "jest wieksza niz " + a);
        }
        if(a==b){
            System.out.println("Wartosc " + a + "jest rowna " + b);
        }
    }
    public void compareValues(double a, double b) {
        if(a>b){
            System.out.println("Wartosc " + a + "jest wieksza niz " + b);
        }
        if(a<b){
            System.out.println("Wartosc " + b + "jest wieksza niz " + a);
        }
        if(a==b){
            System.out.println("Wartosc " + a + "jest rowna " + b);
        }
    }

}
