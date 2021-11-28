package com.mladra.domain.race.participants.referee;

import com.mladra.domain.common.BaseEntity;
import com.mladra.domain.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "REFEREE")
public class Referee extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    @Column(name = "FROM")
    @Temporal(TemporalType.DATE)
    private Date from;

    @Column(name = "DUE")
    @Temporal(TemporalType.DATE)
    private Date due;

}
