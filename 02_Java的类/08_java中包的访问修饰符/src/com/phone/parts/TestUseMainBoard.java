package com.phone.parts;

import com.sun.tools.javac.Main;

public class TestUseMainBoard {
    public static void main(String[] args) {
        MainBoard mainBoard =new MainBoard();
        mainBoard.cpu=new CPU();
        mainBoard.cpu.producer="aaa";
    }
}
