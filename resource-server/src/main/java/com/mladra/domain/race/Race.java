package com.mladra.domain.race;

import com.mladra.domain.common.BaseEntity;
import com.mladra.domain.race.participants.driver.Driver;
import com.mladra.domain.race.participants.referee.Referee;
import com.mladra.domain.user.Address;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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

    @ManyToMany
    @JoinTable(
            name = "RACE_DRIVER",
            joinColumns = { @JoinColumn(name = "RACE_ID") },
            inverseJoinColumns = { @JoinColumn(name = "DRIVER_ID") }
    )
    private List<Driver> drivers;

    @ManyToMany
    @JoinTable(
            name = "RACE_REFEREE",
            joinColumns = { @JoinColumn(name = "RACE_ID") },
            inverseJoinColumns = { @JoinColumn(name = "REFEREE_ID") }
    )
    private List<Referee> referees;

    @ManyToOne
    @JoinColumn(name = "TYPE_ID", nullable = false)
    private RaceType type;

    @ManyToOne
    @JoinColumn(name = "STATUS_ID", nullable = false)
    private RaceStatus status;

}
