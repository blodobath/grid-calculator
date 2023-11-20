import java.util.Locale;
import java.util.Scanner;

public class grid_calculator {

public static void main(String[] args) {

            //网格化计算

    Scanner scan = new Scanner(System.in);

    scan.useLocale(Locale.SIMPLIFIED_CHINESE);

    System.out.println("What's the max tier of voltage you've reached in GregTech? (LV,MV,HV,EV,IV,LuV,ZPM,UV)");

        String greg1 = scan.nextLine();

        int a = 0;

        if (greg1.equals("LV"))
            a = 1;
        if (greg1.equals("MV"))
            a = 2;
        if (greg1.equals("HV"))
            a = 3;
        if (greg1.equals("EV"))
            a = 4;
        if (greg1.equals("IV"))
            a = 5;
        if (greg1.equals("LuV"))
            a = 6;
        if (greg1.equals("ZPM"))
            a = 7;
        if (greg1.equals("UV"))
            a = 8;


    System.out.println("How many hours of GregTech have you played in total?");

    int greg2 = scan.nextInt();

    double b = ((double)greg2/50);


    System.out.println("Do you know about GTCHINA? (Yes/No)");

        scan.nextLine();

        String greg3 = scan.nextLine();

        int c = 1;

        if (greg3.equals("Yes"))
        c = 5;
        if (greg3.equals("No"))
        c = -3;




    System.out.print("Your Gregification level is " + (( a * b ) + c ));





    }

}
