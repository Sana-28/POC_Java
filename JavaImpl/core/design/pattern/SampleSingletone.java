package core.design.pattern;

public class SampleSingletone {
    private static SampleSingletone ref = null;
    private SampleSingletone() { }
    public static SampleSingletone getInstance() {
        if(ref == null)
            ref = new SampleSingletone();
        System.out.println(ref);
        return ref;
    }

    public static void main(String args[]){
        SampleSingletone.getInstance();
    }

}
