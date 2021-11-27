package com.mladra.domain.race;

import com.mladra.domain.common.BaseEntity;
import com.mladra.domain.user.Address;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "RACE")
public class Race extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "ADDRESS_ID", nullable = false)
    private Address address;

    @Column(name = "START_DATE")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startDate;

    @Column(name = "SIGNING_CLOSED_TIMESTAMP")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date signingCloseDate;

    @Column(name = "MAX_PARTICIPANTS")
    private Integer maxParticipants;

    private List<Driver> drivers;

    private List<Referee> referees;

    @ManyToOne
    @JoinColumn(name = "TYPE_ID", nullable = false)
    private RaceType type;

    @ManyToOne
    @JoinColumn(name = "STATUS_ID", nullable = false)
    private RaceStatus status;

}
