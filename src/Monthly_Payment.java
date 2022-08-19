import java.util.Scanner;
    public class Monthly_Payment {
        public static void main(String arg[]) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Principal Amount : ");
            double principal = scan.nextDouble();
            System.out.print("Enter Rate of Interest : ");
            double rate = scan.nextDouble();
            rate = (rate / 100) / 12;
            System.out.print("Enter Time period in years : ");
            int time = scan.nextInt();
            time = time * 12;
            double p = (principal * rate) / (1 - Math.pow(1 + rate, -time));
            //
            System.out.println("Payment: " + p);
        }
    }
