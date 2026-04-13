
public class HelloWorld {
    public static void main(String[] args) {

        // Check if user provided input
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello User");
        }
    }
}