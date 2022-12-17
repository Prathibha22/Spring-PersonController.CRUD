package io.zipcoder.crudapp.models;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "FIRST_NAME" ,nullable = true,insertable = true,updatable = true)
    private String fName;
    @Column(name = "LAST_NAME" ,nullable = true,insertable = true,updatable = true)
    private String lName;

    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public Person(Integer id, String fName, String lName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }

    public Integer getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }


}
