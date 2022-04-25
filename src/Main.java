public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.setA(10);
        s2.setA(20);
        System.out.println(s1.getA());
        System.out.println(s2.getA());
    }
}
