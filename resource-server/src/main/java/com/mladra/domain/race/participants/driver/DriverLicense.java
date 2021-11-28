package com.mladra.domain.race.participants.driver;

import com.mladra.domain.common.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DRIVER_LICENSE")
public class DriverLicense extends BaseEntity {

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "RELEASE_DATE")
    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    @Column(name = "REMARKS")
    private String remarks;

    @Column(name = "DUE_DATE")
    @Temporal(TemporalType.DATE)
    private Date dueDate;
}
