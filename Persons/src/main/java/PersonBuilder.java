
public class PersonBuilder {

    protected static String name;
    protected static String surname;
    protected static int age;
    protected static String city;


    public PersonBuilder setName(String name1) {
        PersonBuilder personBuilder = new PersonBuilder();

        personBuilder.name = name1;
        return personBuilder;
    }

    public PersonBuilder setSurname(String surname1) { /*...*/
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.surname = surname1;
        return personBuilder;
    }

    public PersonBuilder setAge(int age1) { /*...*/
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.age = age1;
        return personBuilder;
    }

    public PersonBuilder setAddress(String address1) { /*...*/
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.city = address1;
        return personBuilder;
    }

    public Person build() { /*...*/


        return new Person(this);
    }
}