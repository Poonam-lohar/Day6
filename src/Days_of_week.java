import java.util.Scanner;
public class Days_of_week {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month;
        int day;
        int year;
        System.out.println( "day : ");
        day=sc.nextInt();
        System.out.println( "month : ");
        month=sc.nextInt();
        System.out.println( "year : ");
        year=sc.nextInt();
        sc.close();
        double m;
        int x;
        int dow;
        m=month+12*((14-month)/12)-2;
        if (month <= 2){
            year--;
        }
        x=year+(year%4)-(year%100)+(year%400);
        dow=(day+x+31%12)%7;
        System.out.println("day of week (sunday=0,monday=1,tuesday=3,wednesday=4,thursday=5,friday=6,saturday=7 : " +dow);
    }
}