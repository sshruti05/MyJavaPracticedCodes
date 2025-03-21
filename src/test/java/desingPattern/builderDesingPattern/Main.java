package desingPattern.builderDesingPattern;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .setFirstName("Sneha")
                .setLastName("Shruti")
                .setAge(23).build();
        System.out.println(person);
    }
}
