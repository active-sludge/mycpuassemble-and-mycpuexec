package com.activesludge.model;

import com.activesludge.controller.BinInterpreter;

public class Opcode {

    public static void load(String addressingMode, String operand){
        Registers.setA(operand);
    }

    public static void store(String addressingMode, String operand){

        if (AddressingMode.isRegisterData(addressingMode)){
            switch (operand) {
                case "0000000000000001":
                    Registers.setA(Registers.getA());
                    break;
                case "0000000000000010":
                    Registers.setB(Registers.getA());
                    break;
                case "0000000000000011":
                    Registers.setC(Registers.getA());
                    break;
                case "0000000000000100":
                    Registers.setD(Registers.getA());
                    break;
                case "0000000000000101":
                    Registers.setE(Registers.getA());
                    break;
            }
        }
    }

    public static void add(String addressingMode, String operand){
        int intRegA = Integer.parseInt(Registers.getA());
        int intOperand = Integer.parseInt(operand);
        int resultA = intRegA + intOperand;

        Registers.setA(Integer.toString(resultA));
    }

    public static void sub(String addressingMode, String operand){
        int intRegA = Integer.parseInt(Registers.getA());
        int intOperand = Integer.parseInt(operand);
        int resultA = intRegA - intOperand;

        Registers.setA(Integer.toString(resultA));
    }

    public static void inc(String addressingMode, String operand){

        int intOperand = Integer.parseInt(operand);
        int result = intOperand + 1;

        Registers.setA(Integer.toString(result));

    }

    public static void dec(String addressingMode, String operand){

    }

    public static void mul(String addressingMode, String operand){

    }

    public static void div(String addressingMode, String operand){

    }

    public static void xor(String addressingMode, String operand){

    }

    public static void and(String addressingMode, String operand){

    }

    public static void or(String addressingMode, String operand){

    }

    public static void not(String addressingMode, String operand){

    }

    public static void shl(String addressingMode, String operand){

    }

    public static void shr(String addressingMode, String operand){

    }

    public static void nop(String addressingMode, String operand){

    }

    public static void push(String addressingMode, String operand){

    }

    public static void pop(String addressingMode, String operand){

    }

    public static void cmp(String addressingMode, String operand){

    }


    public static void jmp(String addressingMode, String operand){

    }


    public static void jz(String addressingMode, String operand){

    }


    public static void jnz(String addressingMode, String operand){

    }


    public static void jc(String addressingMode, String operand){

    }

    public static void jnc(String addressingMode, String operand){

    }

    public static void ja(String addressingMode, String operand){

    }

    public static void jae(String addressingMode, String operand){

    }

    public static void jb(String addressingMode, String operand){

    }

    public static void jbe(String addressingMode, String operand){

    }

    public static void read(String addressingMode, String operand){

    }

    public static void print(String addressingMode, String operand){

    }
}
