package com.proteintracker;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Embeddable;


/**
 * @author Andrea Marcela Cruz Moreno, bridgingIT
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"total","goal"})
@FieldDefaults(level = AccessLevel.PRIVATE)
@Embeddable
public class ProteinData{
        int total;
        int goal;
}
