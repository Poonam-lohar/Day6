import java.util.Scanner;
public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Fahrenheit temperature");
        int fahrenheit = sc.nextInt();
        System.out.println("Enter celcius");
        int celcius = sc.nextInt();
        fahrenheit = (celcius * 9/5)  + 32;
        celcius = (fahrenheit-32)*5/9;
        System.out.println("celcius temp: "+ fahrenheit);
        System.out.println("fahrenheit temp: "+ celcius);
    }
}
