/* @(#) $$Id$$
 *
 * Copyright (c) 2000-2021 Comarch SA All Rights Reserved. Any usage,
 * duplication or redistribution of this software is allowed only according to
 * separate agreement prepared in written between Comarch and authorized party.
 */
package com.mladra.domain.user;

import com.mladra.domain.common.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Michał Ladra
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ADDRESS")
public class Address extends BaseEntity {

    @Column(name = "STREET")
    private String street;

    @Column(name = "CITY")
    private String city;

    @Column(name = "COMMUNE")
    private String commune;

    @Column(name = "DISTRICT")
    private String district;

    @Column(name = "PROVINCE")
    private String province;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "LONGITUDE")
    private float longitude;

    @Column(name = "LATITUDE")
    private float latitude;

}
