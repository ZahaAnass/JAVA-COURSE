public class Main {

    static int x = 3; //CLASS

    public static void main(String[] args){
        int x = 1; //LOCAL
        System.out.println(x);
        doSomething();
    }

    static void doSomething(){
        int x = 2; //LOCAL
        System.out.println(x);
    }
}