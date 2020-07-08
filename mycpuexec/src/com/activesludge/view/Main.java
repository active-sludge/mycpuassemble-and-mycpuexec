package com.activesludge.view;

import com.activesludge.controller.BinReader;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BinReader binReader = new BinReader();

        if (0 < args.length) {
            String filename = args[0];
            binReader.read(filename);
        }
    }
}