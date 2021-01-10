package com.mladra.domain.game;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

import com.mladra.domain.common.BaseEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@Entity
public class Cover extends BaseEntity {

    @Column
    @Enumerated(EnumType.STRING)
    private CoverType type;
    
    @Basic
    private byte[] content;
    
    @Column
    private String coverUrl;

    @OneToOne(mappedBy = "cover")
    private Game game;

    public static enum CoverType {
        URL,
        IMAGE
    }
    
    public Cover() {
        super();
    }
}
