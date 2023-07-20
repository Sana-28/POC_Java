package core.oop;

class Inherit {
}
class Aa {
    public String draw() {
        //System.out.println("Hello,A!");
        return "Hello,A!";
    }
}
class Bb extends Aa{
    public String draw() {
        //System.out.println("Hello, b!");
        return "Hello B";
    }
    public static void main(String args[]){
        Aa aa=new Aa();
        System.out.println("Hello, A!"+aa.draw());

        Aa aa1= new Bb();
        System.out.println("Hello, AB!"+aa1.draw());

        Bb ba= new Bb();
        System.out.println("Hello, BB!"+ ba.draw());

    }
}
class Cc extends Aa{
    public String draw() {
        return "Hello C";
    }
    public static void main(String args[]){
        Aa aa=new Aa();
        System.out.println("Hello, A!"+aa.draw());

        Cc cc=new Cc();
        System.out.println("Hello, CC!"+ cc.draw());

        Aa ac=new Cc();
        System.out.println("Hello, CA!"+ ac.draw());
    }
}