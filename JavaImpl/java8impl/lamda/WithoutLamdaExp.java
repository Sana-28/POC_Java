package java8impl.lamda;

interface Drawable{
     void draw();
}

public class WithoutLamdaExp {
    public static void main(String args[]){
        int width=10;
        //without lambda, Drawable implementation using anonymous class
        Drawable drawable= new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawable width:"+width);
            };
        };
        drawable.draw();
    }
}
