public class HelloWorldApp {
    public static void main(String[] args) {

        if (args.length > 0) {
            String result = "Hello ";

            for (String name : args) {
                result += name + " ";
            }

            // remove last space
            result = result.substring(0, result.length() - 1);

            System.out.println(result);

        } else {
            System.out.println("Hello, World!");
        }
    }
}