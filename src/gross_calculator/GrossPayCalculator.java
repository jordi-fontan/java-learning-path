package gross_calculator;

import java.util.Scanner;
import static java.lang.System.out;
public class GrossPayCalculator {
    public static void main(String... args)
    {
        var number=0;
        String season,adjective;
        Scanner sc=new Scanner(System.in);
        // ask for an adjective
        out.println("Enter an adjective");
        adjective=sc.next();

        // ask for an adjective
        out.println("Enter a season");
        season=sc.next();

        // ask for a number of cups
        out.println("Enter a number of cups");
        number=sc.nextInt();

        // Build the final text and Print the  result
        StringBuilder sb=new StringBuilder();
        sb.append("On a ");
        sb.append(adjective);
        sb.append(" ");
        sb.append(season);
        sb.append(" I drink a minimum of ");
        sb.append(number);
        sb.append(" cups of coffee");
        out.println(sb.toString());


    }

}
