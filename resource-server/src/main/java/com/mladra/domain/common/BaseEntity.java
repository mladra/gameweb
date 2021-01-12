package com.mladra.domain.common;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generic-generator")
    @GenericGenerator(
        name = "generic-generator", 
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", 
        parameters = { @Parameter(name = "prefer_sequence_per_entity", value = "true") }
    )
    private Long id;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date modificationDate;

    @PrePersist
    private void prePersist() {
        createDate = new Date();
        modificationDate = new Date();
    }

    @PreUpdate
    private void preUpdate() {
        modificationDate = new Date();
    }

}
