package Quiz;

import java.util.Scanner;

public class Quiz_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Select = 0, night = 0;
        double total;
        do {
            System.out.print("###### Please select Room type ######");
            System.out.println("1.Room Type 1: 600 THB");
            System.out.println("2.Room Type 2: 1200 THB");
            System.out.println("3.Room Type 3: 1800 THB");
            System.out.println("4.Room Type 4: 2100 THB");
            System.out.println("Select: ");
            Select = sc.nextInt();


        } while (Select < 0 || Select > 4);
        System.out.print("Night:");
        night = sc.nextInt();
        if (Select == 1)
            total = 600 * night;
        else if (Select ==2)
            total = 1200 * night;
        else if (Select == 3)
            total = 1800 * night;
        total = 2100 * night;
        System.out.println("Total price: " + total + " THB.");










    }//main
}//class
