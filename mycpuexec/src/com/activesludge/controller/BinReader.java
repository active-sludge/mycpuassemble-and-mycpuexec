package com.activesludge.controller;

import com.activesludge.model.AddressingMode;
import com.activesludge.model.Opcode;
import com.activesludge.model.Registers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinReader {

    public void read(String filename){
//        Read file
        try {
            File progBIN = new File(filename);
            Scanner commands = new Scanner(progBIN);

//            Read line
            while (commands.hasNextLine()) {
                Scanner line = new Scanner(commands.nextLine());

                while (line.hasNext()) {
                    String word = line.next();

                    String opcode = word.substring(0, 6);

                    if (opcode.equals("000001")){
                        System.out.println("HALT");
                        break;
                    }

                    String addressingMode = word.substring(6, 8);
                    String operand = word.substring(8, 24);

                    if (opcode.equals("000010")){

                    }

                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
