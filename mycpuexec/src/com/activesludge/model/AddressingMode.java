package com.activesludge.model;

public class AddressingMode {

    public static boolean isImmediateData(String addressingMode){
        return addressingMode.equals("00");
    }

    public static boolean isRegisterData(String addressingMode) {
        return addressingMode.equals("01");
    }

    public static boolean isRegisterInMemoryData(String addressingMode) {
        return addressingMode.equals("10");
    }

    public static boolean isMemoryData(String addressingMode) {
        return addressingMode.equals("11");
    }
}
