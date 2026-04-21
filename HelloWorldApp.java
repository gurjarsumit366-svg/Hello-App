public class HelloWorldApp {
    public static void main(String[] args) {

        if (args.length > 0) {
            String result = String.join(" ", args);
            System.out.println("Hello " + result);
        } else {
            System.out.println("Hello, World!");
        }
    }
}