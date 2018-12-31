package lk.elon.Entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Person implements Serializable {

    private String id;
    private String name;
    private String address;

    public Person() {
    }

    public Person(String id, String name, String address) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
