/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.Scanner;

public class Solution02 {
    /*
    Create a program
    Scanner 'input' = new scanner for input string
    print 'What is the input string? '
    String 'str' = scan in input string using 'input' scanner
    int 'ch' = 0 to count num characters
    for(iterate through string to count characters, get length of string)
        'ch'++ for every character
    print 'str' has 'ch' characters. '
    */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String str = input.next();
        int ch = 0;
        for(int i = 0; i < str.length(); i++){
            ch++;
        }
        System.out.printf("%s has %d characters. ", str, ch);
    }
}
