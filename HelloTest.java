public class HelloTest {
    public static void main(String[] args) {
        String result = "Hello from Jenkins + Java!";
        
        if (result.equals("Hello from Jenkins + Java!")) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
            System.exit(1);
        }
    }
}
