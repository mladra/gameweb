package com.mladra.domain.race;

import com.mladra.domain.common.DictionaryTypeEntity;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Table(name = "RACE_TYPE")
public class RaceType extends DictionaryTypeEntity {
}
