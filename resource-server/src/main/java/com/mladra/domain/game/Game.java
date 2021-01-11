package com.mladra.domain.game;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.mladra.domain.common.BaseEntity;
import com.mladra.domain.company.Company;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id", nullable = true)
    private Company author;

    public Game() {
        super();
    }

}
