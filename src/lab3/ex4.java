package lab3;

import java.util.OptionalInt;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        int Select;
        System.out.print("เลือกรายวิชาที่คุณชองมากที่สุด ?");
        System.out.print("1.Accounting");
        System.out.print("2.Maketing");
        System.out.print("3.System Analysis");
        System.out.print("4.Computer Programming");

        Scanner input = new Scanner(System.in);

        System.out.print("เลือกหมายเลข (1-4): ");
        Select = input.nextInt();
        //switch-case
        switch (Select){
            case 1: System.out.println("คุณชอบ Accounting");break;
            case 2: System.out.println("คุณชอบ marketing");break;
            case 3: System.out.println("คุณชอบ System Analysis");break;
            case 4: System.out.println("คุณชอบ Computer Programming");break;
            default: System.out.println("กรุณาเลือกหมายเลข 1-4 เท่านั้น");

        }










    }//main

}//class
