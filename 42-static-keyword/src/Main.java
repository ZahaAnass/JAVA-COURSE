
public class Main {

    public static void main(String[] args) {

        // static = Modifies a variable or method belong to the class,
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Bob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");
        Friend friend5 = new Friend("Gary");

        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
        System.out.println(friend4.name);
        System.out.println(friend5.name);

        Friend.showFriends();


    }

}