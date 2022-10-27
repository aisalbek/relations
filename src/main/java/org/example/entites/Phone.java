package org.example.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor

@Table(name = "phones")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_gen")
    @SequenceGenerator(name = "user_gen", sequenceName = "user_seq", allocationSize = 1)
    private Long id;
    private String model;
    private String color;
    private String price;
    @ManyToOne(cascade = CascadeType.ALL )
    private User user;

    public Phone(String model, String color, String price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}
