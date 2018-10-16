package lab9;

import java.io.*;

public class Filedemo {
    public static void main(String[] args) {

        try {
            File myFile = new File("D:\\s361211760023\\src\\lab9\\mit.txt");//mit
            if (myFile.createNewFile())
            System.out.println("New File created.");
            else
            System.out.println("File already exited.");
        }catch (IOException ex) {
            ex.printStackTrace();
        }

        //write File
        //WriteMyFiel();
        readMyFiel();


        }//main

    private static void readMyFiel() {

        try {
            FileReader reader = new FileReader("D:\\s361211760023\\src\\lab9\\mit.txt");
            int i;
            while ((i = reader.read()) != -1){
                System.out.print((char) i);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }//readMyFiel

    private static void WriteMyFiel() {
        Writer w = null;
     try {
         w = new FileWriter("D:\\s361211760023\\src\\lab9\\mit.txt",true);
        String content = "\nMIT SAIYAI 2018\r";
        w.write(content);
        System.out.println("Done.");
    }catch (IOException ex) {
         ex.printStackTrace();
     }finally {
         try {
             w.close();
         }catch (IOException ex){
             ex.printStackTrace();
         }
     }



    }//writeMyFile
}//class
