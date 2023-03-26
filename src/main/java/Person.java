import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;


    public Person(String name, String surname) {

        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {

        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String city) {

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() {
        if (age < 0) {
            return false;
        } else return true;
    }

    public boolean hasAddress() {
        if (city == null) {
            return false;
        } else return true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return city;
    }

    public void setAddress(String address) {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setAddress(address);
        personBuilder.build();
    }

    public void happyBirthday() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setAge(age + 1);
    }

    @Override
    public String toString() {

        return name + "-name" + "\n" + surname + "-surname" + "\n" + age + "-age" + "\n" + city + "-city";
    }

    @Override
    public int hashCode() {

        return name.hashCode() + surname.hashCode();
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder person = new PersonBuilder();
        person.setAge(0);
        person.setSurname(surname);
        person.setAddress(city);
        return person;
    }
}



