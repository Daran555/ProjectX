package org.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class digit {
    public static void main (String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d;
        System.out.println("Enter a digits");
        d = Integer.parseInt(br.readLine());
        System.out.println("Enter a digit to count no of apperance");
        int a = Integer.parseInt(br.readLine());
        int l =0;
        int counter=0;
        while(d!=0)
        {
            int digit = d % 10;
            if(digit == a)
            {
                counter++;
            }
            d=d/10;
            l++;
        }
        System.out.println(l);
        System.out.println(counter);

    }
}
