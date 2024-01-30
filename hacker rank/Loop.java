import java.io.*;
import java.util.*;

public class Loop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int input = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(input + " x " + i + " = " + input*i);
   }
 }
}