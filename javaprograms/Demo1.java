public class Demo1{
static void method1(){
System.out.println("This is the static method..");
}
void method2(double a,double b,double c,double d){
double sub=(a+b+c+d)/4;
System.out.println("Average" +sub);
}

public static void main(String[] args){
Demo1 d= new Demo1();
Demo1.method1();
d.method2(80,70,80,70);
}
}