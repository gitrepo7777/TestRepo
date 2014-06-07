package com.vani;

public class AnnDemo {
    public static void main(String[] args) throws Exception {
        AnnParser parser = new AnnParser();
        parser.parse(AnnClass.class);
    }
}