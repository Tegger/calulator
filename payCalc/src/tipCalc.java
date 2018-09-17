import java.util.Scanner;
import java.util.ArrayList;
import java.security.*;
import java.text.NumberFormat;



public class tipCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double userInput = 1;
        double total = 0;

        while (userInput != 0) {
            System.out.println("Please enter the amount paid: ");
            System.out.println("(Enter '0' when your total is completely entered)");
            userInput = scanner.nextDouble();
            total += userInput;
        }
        double taxes = total * .025 ;
        double withTaxes = total + taxes;
        double tip = total * .175;


        System.out.println("Your total comes out to $" + Format(withTaxes) + ".");
        System.out.println("Your tax comes out to $" + Format(taxes) + ".");
        System.out.println("We recommend a 17.5% tip of: " + Format(tip));
    }

    public static String Format(double value){
        String result = "";

        NumberFormat nf = NumberFormat.getNumberInstance() ; //we get the instance of the number
        nf.setGroupingUsed(false) ; // don't group by threes
        nf.setMaximumFractionDigits(2) ; //we set the max number of decimal digits.
        nf.setMinimumFractionDigits(2) ; //we set the min number of decimal digits.
        result = nf.format(value); //rounded operation

        return result;
    }

}

