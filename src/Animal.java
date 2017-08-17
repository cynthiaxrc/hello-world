public class Animal {

    private String name;
    private int age;
    private boolean isCute;

    public Animal (String name, int age) {
        System.out.println("Constructor for animal is called for " + name);
        this.name = name;
        this.age = age;
        this.isCute = true;
    }

    public String getName() {
        return "Mr." + this.name;
    }
}
