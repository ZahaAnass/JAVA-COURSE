public class Main {

    public static void main(String[] args) {
        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collections Framework and static utility methods.

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        // Unboxing
        int x = a;


        String e = Integer.toString(123);
        String f = Double.toString(3.14);
        String g = Character.toString('$');
        String h = Boolean.toString(true);

        int i = Integer.parseInt("123");
        double j = Double.parseDouble("3.14");
        char k = "Pizza".charAt(0);
        boolean l = Boolean.parseBoolean("true");

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("x: " + x);
        System.out.println("e: " + e);
        System.out.println("f: " + f);
        System.out.println("g: " + g);
        System.out.println("h: " + h);
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("k: " + k);
        System.out.println("l: " + l);

    }

}