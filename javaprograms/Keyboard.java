   import java.util.*;
   public class Keyboard{

   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        String name;
        int age;
        System.out.println("Enter your name:");
        name=sc.next();
        System.out.println("Enter your age:");
        age=sc.nextInt();
        System.out.println("My name is "+name+"I'm "+age+" years old");
   }
} 