/**
 * Main class
 */
public class Main {
    /**
     * local variable
     */
    String name = "hello";
    /**
     * static main method
     * @param args arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.main();
        System.out.println(main.name);
    }

    /**
     * main method
     */
    public void main() {
        name = "changed";
    }
}
