package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import net.sf.jsqlparser.statement.create.table.ColumnDefinition;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity()
@Table()
@Data
@Where(clause = "deletedTime = null")
public class Part {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2",strategy="uuid2")
    private UUID id;

    @Column
    private String partNo;

    @Column
    private String partName;

    @Column
    private String partType;

    @Column
    private String customerId;
}
