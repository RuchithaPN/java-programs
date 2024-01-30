public class EHand {
    public static void main(String[] args)  {
        
     
    System.out.println(1);
    System.out.println(4);    
    System.out.println(1);
    System.out.println(4);
    System.out.println(8);
    System.out.println(9);
    try {
        System.out.println(10/0);
    }
    catch(ArithmeticException e) {
        System.out.println("thats ok print the next number");
    }
    //System.out.println(10/0);
    System.out.println(14);
    System.out.println(44);

}
}





