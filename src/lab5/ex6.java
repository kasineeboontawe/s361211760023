package lab5;

import java.util.StringTokenizer;

public class ex6 {
    public static void main(String[] args) {

        StringBuffer mystr = new StringBuffer("Hello");
        System.out.println(mystr);
        System.out.println(mystr.reverse());

        mystr.append(" MIT211");
        System.out.println(mystr);
        mystr.insert(0, "RUTS");
        System.out.println(mystr);

        //StringBuilder
        StringBuilder mystr2= new StringBuilder("Hello");
        System.out.println(mystr2);
        mystr2.reverse();
        System.out.println(mystr2);

        //StringTokenizer
        StringTokenizer mystr3 = new StringTokenizer("Hello, my name is nan");
        int cout = mystr3.countTokens();
        System.out.println(cout);


    }//main
}//class
