/* @(#) $$Id$$
 *
 * Copyright (c) 2000-2021 Comarch SA All Rights Reserved. Any usage,
 * duplication or redistribution of this software is allowed only according to
 * separate agreement prepared in written between Comarch and authorized party.
 */
package com.mladra.domain.user;

import com.mladra.domain.common.DictionaryTypeEntity;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Michał Ladra
 */
@NoArgsConstructor
@Entity
@Table(name = "ROLE")
public class Role extends DictionaryTypeEntity {
}
