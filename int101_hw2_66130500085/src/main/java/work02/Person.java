package work02;

import java.util.Objects;
import work01.Utilitor;

public class Person {

    private static int nextId = 1;
    private final int id;
    private String firstname;
    private String lastname;

    Utilitor utilitor = new Utilitor();

    public Person(String firstname, String lastname) {
        utilitor.testString(firstname);
        utilitor.testString(lastname);
        this.id = nextId;
        nextId++;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        utilitor.testString(firstname);
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        utilitor.testString(lastname);
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Person(");
        sb.append(id);
        sb.append(",");
        sb.append(firstname);
        sb.append(",");
        sb.append(lastname);
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }
}
