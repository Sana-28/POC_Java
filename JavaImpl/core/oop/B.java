package core.oop;

public class B extends A {
    public String method1(String name){
        return name;
    }

   public static void main(String args[]){
       //B b= new B();
       A a=new B();
       a.method1("Sana");
   }
}
