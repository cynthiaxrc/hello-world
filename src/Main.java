public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        Animal cat = new Animal("Bob", 5);
        Animal dog = new Animal("John", 80);
        System.out.println(cat.getName() + dog.getName());
    }
}

