package com.theruzil.TenThousandHours.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "activity", cascade = CascadeType.ALL, orphanRemoval=true)
    private Set<ActivityTime> activityTimes;
}
