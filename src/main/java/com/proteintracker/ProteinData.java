package com.proteintracker;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;


/**
 * @author Andrea Marcela Cruz Moreno, bridgingIT
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"total","goal"})
@FieldDefaults(level = AccessLevel.PRIVATE)
class ProteinData{
        @Id
        @GeneratedValue
        int id;
        @OneToOne
        @JoinColumn(name = "id")
        User user;
        int total;
        int goal;
}
