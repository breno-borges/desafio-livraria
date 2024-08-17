package library.models;

import java.util.Date;

public class Author {

    private int idAuthor;
    private String name;
    private Date birthDate;

    public Author(int idAuthor, String name, Date birthDate) {
        this.idAuthor = idAuthor;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
