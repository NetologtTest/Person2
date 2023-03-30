public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String city;


    public PersonBuilder setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("нету имени");
        } else this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) { /*...*/
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("не фамилии ");
        } else this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) { /*...*/
        if (age < 0) {
            throw new IllegalArgumentException("не правильный возраст");
        } else this.age = age;
        return this;

    }

    public PersonBuilder setAddress(String address) { /*...*/

        PersonBuilder.this.city = address;

        return PersonBuilder.this;

    }

    public Person build() { /*...*/

        Person person;
        if (name == null || surname == null)
            throw new IllegalStateException("не работает");
        if (age < 0) {
            person = new Person(name, surname);
        } else person = new Person(name, surname, age, city);
        return person;

    }
}
