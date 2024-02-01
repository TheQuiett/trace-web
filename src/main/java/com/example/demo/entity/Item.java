package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity()
@Table()
@Data()
/**
 *@Where(clause = "deleted_at = null")
 * 문구를 넣으면 해당 테이블을 통해서 기본적으로
 * clause의 조건을 포함하도록 한다.
 */
@Where(clause = "deleted_at is null")
public class Item {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2",strategy="uuid2")
    private UUID id;

    @Column()
    private String itemName;

    @Column()
    private String itemType;

    @Column(columnDefinition = "timestamptz")
    private OffsetDateTime createDate;

    @Column(columnDefinition = "timestamptz")
    private OffsetDateTime editDate;

    @Column(columnDefinition = "timestamptz")
    private OffsetDateTime deleteDate;

    @ManyToOne()
    @JoinColumn(referencedColumnName = "id", name = "account_id")
    private Account account;

//    @ManyToOne()
//    // 별도의 키를 사용할때 사용
//    // referencedColumnName = 부모 entity의 컬럼명,
//    // name = entity 설정 시 해당 컬럼의 컬럼 명을 어떻게 지을지 지정할때 사용
//    @JoinColumn(referencedColumnName = "key", name = "account_key")
//    private Account accountKey;
}
