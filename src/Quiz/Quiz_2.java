package Quiz;

import java.util.Scanner;

public class Quiz_2 {
    public static void main(String[] args) {

        int Select;
        double Price=0,total=0 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("###### Please select Room type ######");

        System.out.print( "Type 1 10%");
        System.out.println("เลือกการเสียภาษีตามการแยกประเภทสินค้า ?");
        System.out.println("Type 1.10 %");
        System.out.println("Type 2.15 %");
        System.out.println("Type 3.17 %");
        System.out.println("Type 4.20 %");

        System.out.print("Select: ");
        Select = sc.nextInt();
        System.out.print("price: ");
        Price =sc.nextInt();


        switch (Select){
            case 1: total = Price + (Price * 0.1);break;
            case 2: total = Price + (Price * 0.15);break;
            case 3: total = Price + (Price * 0.17);break;
            case 4: total = Price + (Price * 0.20);break;
            default: System.out.print("Please select product type (1-4)");
        }
        System.out.println("Total Price"+total);














    }//main
}//class
