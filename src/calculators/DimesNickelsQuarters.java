package calculators;

import java.util.Scanner;

import static java.lang.System.out;

public class DimesNickelsQuarters {

    public static void main(String... args)
    {
        int cents,nickels,dimes,quarters;

        Scanner sc=new Scanner(System.in);
        // ask for number of cents
        out.println("Enter cents");
        cents=sc.nextInt();

        // ask for number of nickels
        out.println("Enter nickels");
        nickels=sc.nextInt();

        // ask for number of dimes
        out.println("Enter dimes");
        dimes=sc.nextInt();

        // ask for number of quarters
        out.println("Enter quarters");
        quarters=sc.nextInt();

        // Calculate total
        int total= cents*1 + nickels*5 + dimes*10 + quarters*25;

        // Assign message
        var message="";
        if(total<100) message= " Your total is only " +total;
        else if(total>100) message= " Your total exceeded " +total;
        else message="Wooo hoooo!!!";

        out.println(message);

    }
}
