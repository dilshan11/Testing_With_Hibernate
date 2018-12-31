# Testing_With_Hibernate
Simple Testing
I study about how to save a Entity which have object as primary key,
For it i have used @Embeddable annotation and @Embedded annotation

value class,

@Embeddable
public class Person implements Serializable {

    private String id;
    private String name;
    private String address;
    
    
and Entity class,

@Entity
public class Employee {
    @EmbeddedId
    private
    Person person;
    private int age;
    private char section;
    
    person is the object which i have used as primary key,
    I used Hibernate Framework and Database connecter and if you use java 1.11 use jaxb as a library.
