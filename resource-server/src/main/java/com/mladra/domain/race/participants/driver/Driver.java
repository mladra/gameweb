package com.mladra.domain.race.participants.driver;

import com.mladra.domain.race.car.CarDetails;
import com.mladra.domain.common.BaseEntity;
import com.mladra.domain.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "DRIVER")
public class Driver extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    @OneToOne
    @JoinColumn(name = "LICENSE_ID", nullable = false)
    private DriverLicense license;

    @OneToOne(mappedBy = "owner")
    private CarDetails carDetails;
}
