package com.company;

public class Main {

    public static void main(String[] args) {
	//
        char myChar = '\u1200'; // Should be only on character;
        char myChar1 = '\u1201';
        char myChar2 = '\u1202';
        char myChar3 = '\u1203';
        char myChar4 = '\u1204';
        char myChar5 = '\u1205';
        char myChar6= '\u1206';

        System.out.println("Amharic alphabet " + myChar + ' ' + myChar1 + ' '+ myChar2 + ' '+ myChar3+ ' ' + myChar4 + ' ' + myChar5 + ' '+ myChar6);
        boolean myBoolean = false;
        boolean isMale = true;
        boolean isFemale = false;
        char registerSymbol = '\u00AE';

        System.out.println(registerSymbol);

    }
}
