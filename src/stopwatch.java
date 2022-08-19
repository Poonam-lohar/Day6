import java.util.Scanner;
public class stopwatch {
    public static void main(String[] args){
        long startTime=System.currentTimeMillis();
        for (int i =0; i<10; i++) {
            int random = (int) Math.floor(Math.random() * 10);
            System.out.println(random);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Elapsed time is: " + (endTime - startTime));

    }
}
