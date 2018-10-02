package lab7;

public class studentApp {
    public static void main(String[] args) {
      //create object
      student std = new student( "kasinee",
              "40",
              "boontawekasinee@gmail.com",
              "0913108923",
              21);

      System.out.println(std.toString());

      std.setName("kasinee boontawe");
      System.out.println(std.toString());





    }//main
}//class
