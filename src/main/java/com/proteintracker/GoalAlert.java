package com.proteintracker;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Andrea Marcela Cruz Moreno, bridgingIT
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"message"})
@FieldDefaults(level = AccessLevel.PRIVATE)
class GoalAlert {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String message;
}
