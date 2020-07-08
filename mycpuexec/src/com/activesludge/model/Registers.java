package com.activesludge.model;

import java.util.HashMap;

public class Registers {
    
    //    PC: Program counter
    public static int PC;
    //    A: Accumulator
    public static String A;
    //    B,C,D,E: General purpose registers
    public static String B;
    public static String C;
    public static String D;
    public static String E;
    //    S: Stack pointer
    public static int S;

    public static int getPC() {
        return PC;
    }

    public static void setPC(int PC) {
        Registers.PC = PC;
    }

    public static String getA() {
        return A;
    }

    public static void setA(String a) {
        A = a;
    }

    public static String getB() {
        return B;
    }

    public static void setB(String b) {
        B = b;
    }

    public static String getC() {
        return C;
    }

    public static void setC(String c) {
        C = c;
    }

    public static String getD() {
        return D;
    }

    public static void setD(String d) {
        D = d;
    }

    public static String getE() {
        return E;
    }

    public static void setE(String e) {
        E = e;
    }

    public static int getS() {
        return S;
    }

    public static void setS(int s) {
        S = s;
    }
}

