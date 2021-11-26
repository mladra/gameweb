/* @(#) $$Id$$
 *
 * Copyright (c) 2000-2021 Comarch SA All Rights Reserved. Any usage,
 * duplication or redistribution of this software is allowed only according to
 * separate agreement prepared in written between Comarch and authorized party.
 */
package com.mladra.domain.user;

import com.mladra.domain.common.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Michał Ladra
 */
@Entity
@Table(name = "USER_DETAILS")
public class UserDetails extends BaseEntity {

    @OneToOne(mappedBy = "details")
    private User user;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "AVATAR")
    private byte[] avatar;

    @ManyToOne
    @JoinColumn(name = "ADDRESS_ID", nullable = false)
    private Address address;
}
