package mk.ukim.finki.emt.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    @ManyToOne
    private Country country;

    public Author() {
    }
}
