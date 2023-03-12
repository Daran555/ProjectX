package org.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;

public class alphabetcaseconvert
{
    public static void main (String args[]) throws IOException
    {
        /*Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        StringBuilder res = new StringBuilder("");

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i); //current character
            if(ch >='A' && ch <= 'Z')
            {
                res.append((char)(ch + 32));
            } else if(ch >='a' && ch<='z')
            {
                res.append((char)(ch - 32));
            } else
            {
                res.append(ch);
            }
        }

        String ans = res.toString();
        System.out.println("The string after toggling becomes: " + ans);
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter to String to convert");
        String c = br.readLine();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<c.length();i++)
        {
            char ch = c.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
            {
                res.append((char)(ch+32));
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                res.append((char)(ch-32));
            }
        }
        System.out.println("Alphabet case converted: "+res);
    }
}
