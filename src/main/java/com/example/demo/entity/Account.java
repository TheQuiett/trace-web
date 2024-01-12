package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GeneratedColumn;

@Entity()
@Table()
@Data()
public class Account {
    @Id
    private Long id;

    @Column()
    private String username;

    @Column()
    private String password;

}
