package org.example.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "usres")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_gen")
    @SequenceGenerator(name = "user_gen", sequenceName = "user_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String email;
    private int age;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Phone> list = new ArrayList<>();

    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
}

