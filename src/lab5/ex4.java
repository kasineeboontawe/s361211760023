package lab5;

import java.util.ArrayList;

public class ex4 {
    public static void main(String[] args) {

        ArrayList myList = new ArrayList();
        myList.add("nan");//0
        myList.add("may");//1
        myList.add("jan");//2
        myList.add("ben");//3
        myList.add("bin");//4
        System.out.println(myList);

        myList.add(4,"ju");
        System.out.println(myList);
        myList.remove( "jan");
        System.out.println(myList);
        System.out.println(myList.indexOf("bows"));
    }
}//class
