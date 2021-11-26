package entity;

public class Main {
    public static void main(String[] args) {
        Person person1 = Person.getPersonBuilder()
                .setFirstName("Толя")
                .setLastName("Постебайло")
                .setAge(32)
                .setEmail("tolya@mail.ru")
                .setPhone("+7924327443")
                .build();

        Person person2 = Person.getPersonBuilder()
                .setFirstName("Коля")
                .setEmail("kolya@mail.ru")
                .setPhone("+7924327443")
                .build();

        System.out.println(person1);
        System.out.println(person2);
    }
}
