package com.company.rustam;

//import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.Test;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        getPerson("Rustam");
        makeSomeCalc();
    }


    public static void getPerson(String name) {
        System.out.println("Hello >> " + name);
    }

    public static int makeSomeCalc() {
        int x = 4;
        int y = 3;

        return x + y;
    }

}