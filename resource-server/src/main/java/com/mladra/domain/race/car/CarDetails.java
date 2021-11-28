package com.mladra.domain.race.car;

import com.mladra.domain.common.BaseEntity;
import com.mladra.domain.race.participants.driver.Driver;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "CAR_DETAILS")
public class CarDetails extends BaseEntity {

    @Column(name = "MARK")
    private String mark;

    @Column(name = "MODEL")
    private String model;

    @Column(name = "YEAR")
    private Integer year;

    @Column(name = "POWER")
    private Integer power;

    @Column(name = "CAPACITY")
    private Integer capacity;

    @Column(name = "PLATE_NUMBER")
    private String plateNumber;

    @Column(name = "VIN_NUMBER")
    private String vinNumber;

    @Column(name = "PHOTO")
    private byte[] photo;

    @OneToOne
    @JoinColumn(name = "DRIVER_ID", nullable = false)
    private Driver owner;

}
