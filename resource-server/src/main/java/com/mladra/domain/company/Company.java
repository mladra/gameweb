package com.mladra.domain.company;

import com.mladra.domain.common.BaseEntity;
import com.mladra.domain.game.Game;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Getter
@Setter
@Entity
@SuperBuilder
public class Company extends BaseEntity {

    @Column
    private String name;

    @Column
    private String description;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @OneToMany(mappedBy = "author")
    private Collection<Game> games;

    public Company() {
        super();
    }

}
