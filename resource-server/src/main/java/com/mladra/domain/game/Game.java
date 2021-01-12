package com.mladra.domain.game;

import com.mladra.domain.common.BaseEntity;
import com.mladra.domain.company.Company;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@SuperBuilder
@Entity
public class Game extends BaseEntity {

    @Column
    private String name; 

    @Column
    private String description;

    @OneToOne
    @JoinColumn(name = "cover_id", referencedColumnName = "id")
    private Cover cover;

    @Column
    private Double avgPrice;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date releaseDate;

    @Column
    private Double rating;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Company author;

    public Game() {
        super();
    }

}
