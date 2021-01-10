package com.mladra.domain.common;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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

}
