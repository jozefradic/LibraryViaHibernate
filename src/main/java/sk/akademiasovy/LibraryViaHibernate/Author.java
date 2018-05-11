package sk.akademiasovy.LibraryViaHibernate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "writer")
public class Author {

    @Id
    @Column
    private long id;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "firstname")
    private String firstname;

    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "Author")                              //TOTO ROBI PREPOJENIE aby jeden writer mal viacej knih
    private List<Book> book=new ArrayList<Book>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}