package com.proteintracker;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;

/**
 * @author Andrea Marcela Cruz Moreno, bridgingIT
 */
 
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@FieldDefaults(level = AccessLevel.PRIVATE)
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @NotNull
    String name;
    @OneToOne(cascade = CascadeType.ALL)
    ProteinData proteinData;
    @OneToMany(cascade = CascadeType.ALL)
    Collection<UserHistory> histories;
    @ManyToMany(cascade = CascadeType.ALL)
    Collection<GoalAlert> goalAlerts;
}
