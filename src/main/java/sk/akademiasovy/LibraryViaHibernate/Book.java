package sk.akademiasovy.LibraryViaHibernate;

import javax.persistence.*;


@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "idw")
    private Integer idw;

    @Column(name = "year")
    private Integer year;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdw() {
        return idw;
    }

    public void setIdw(Integer idw) {
        this.idw = idw;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
