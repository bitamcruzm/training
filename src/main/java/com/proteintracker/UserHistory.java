package com.proteintracker;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Andrea Marcela Cruz Moreno, bridgingIT
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"entryTime","entry"})
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    Date entryTime;
    String entry;
}
