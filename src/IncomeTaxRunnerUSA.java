import java.util.Scanner;

public class IncomeTaxRunnerUSA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your income: ");
        double income = input.nextDouble();

        int status;
        System.out.print("Are you married? (Y\\N): ");
        String relation = input.next();
        if(relation.equals("Y")){
            status = Constants.MARRIED;
        }
        else {
            status = Constants.SINGLE;
        }
        IncomeTaxCalculationUSA user1 = new IncomeTaxCalculationUSA(income,status);
        System.out.println("Tax: " + user1.getTax());
    }
}
