public class Main {
    String name = "hello";

    public static void main(String[] args) {
        Main main = new Main();
        main.main();
        System.out.println(main.name);
    }
    public void main() {
        name = "changed";
    }
}
