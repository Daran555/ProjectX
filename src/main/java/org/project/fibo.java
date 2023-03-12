package org.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibo
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               int n1=0,n2=1,n3,n;
        System.out.println("Enter the value for fibo");
        n=Integer.parseInt(br.readLine());
        System.out.println(n1 + "\n "+ n2);
        for(int i=2;i<n;i++)
        {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
