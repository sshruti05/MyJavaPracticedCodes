package desingPattern.builderDesingPattern;
/*
BuilderDesingPattern:
    This is an exellent solution to create complex objects in a cleaner and readable manner.
    By using builder, you :
    - avoid constructors with long parameter list.
    - Make it easier to manage the creation of objects, especially when the object has
      optional parameters.
    - Maintains flexibility and immutability in your models.
 */

public class Person {
    private String firstName;
    private String lastName;
    private int age;

//    privater constructor to prevent direct instantiation
    private Person(PersonBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
//    Static Builder class
    public static class PersonBuilder{
        private String firstName;
        private String lastName;
        private int age;

        // Setters method in Builder to set the values.
        public PersonBuilder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public PersonBuilder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public PersonBuilder setAge(int age){
            this.age = age;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
}
