package com.company;

    import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner perm = new Scanner(System.in);

        System.out.println("Hello world!");
        System.out.println("This task done by...");
        System.out.println("Nick Savenko PZ-18-1/9");
        System.out.println("Tim Cixo PZ-18-1/9");

        System.out.println("Input count:");
        int count = perm.nextInt();

        for(int i = 1; i < count + 1; i++)
        {
            String temp = "";
            for(int j = 0; j < i; j++)
            {
                if(j > 25)
                {
                    j += 7;
                }
                System.out.print("");
            }
            System.out.println(".");
        }
    }
}