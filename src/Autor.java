import java.time.LocalDate;

public class Autor {
    private String firstName;
    private String lastName;
    public String autor;

    public Autor (String firstName, String lastName, String autor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.autor = firstName + " " + lastName;
    }
    public Autor (String firstName, String lastName) {
        this (firstName, lastName, null);
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAutor() {
        return autor;
    }
}
