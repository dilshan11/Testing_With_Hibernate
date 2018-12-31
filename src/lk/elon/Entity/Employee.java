package lk.elon.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Employee {
    @EmbeddedId
    private
    Person person;
    private int age;
    private char section;

    public Employee() {
    }

    public Employee(int age, char section) {
        this.setAge(age);
        this.setSection(section);
    }

    public Employee(Person person, int age, char section) {
        this.setPerson(person);
        this.setAge(age);
        this.setSection(section);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }
}
