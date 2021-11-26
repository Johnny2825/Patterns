package entity;

public class Person {

    private final String firstName, lastName, phone, email;
    private final int age;

    private Person(PersonBuilder personBuilder) {
        firstName = personBuilder.firstName;
        lastName = personBuilder.lastName;
        phone = personBuilder.phone;
        email = personBuilder.email;
        age = personBuilder.age;
    }

    public static PersonBuilder getPersonBuilder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private String firstName, lastName, phone, email;
        private int age;

        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public PersonBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public PersonBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

    @Override
    public String toString() {
        return  String.format("%s %s %s %s %s", firstName, lastName, email, phone, age);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
