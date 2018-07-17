package lab3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        System.out.print("กรุณากรอกคะแนนของคุณ");
        score = scanner.nextInt();
        //test condition
        if (score<50)System.out.print("your grade is f");
        else if (score<55)System.out.print("your grade is d");
        else if (score<60)System.out.print("your grade is d+");
        else if (score<65)System.out.print("your grade is c.");
        else if (score<70)System.out.print("your grade is c+");
        else if (score<75)System.out.print("your grade is b");
        else if (score<79)System.out.print("your grade is b+");
        else if (score<=100)System.out.print("your grade is a");
        else System.out.print("กรุณากรอกคะแนนให้ถุกต้อง");










    }//main

}//class
