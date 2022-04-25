public class Singleton {
    private int a;
    public void setA(int a){
        this.a = a;
    }
    public int getA(){
        return a;
    }

    private Singleton(){

    }

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
