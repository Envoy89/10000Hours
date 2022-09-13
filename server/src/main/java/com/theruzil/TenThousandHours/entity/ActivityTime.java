package com.theruzil.TenThousandHours.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ActivityTime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToOne
    @JsonBackReference
    private Activity activity;

    public ActivityTime(ActivityTime activityTime) {
        this.id = activityTime.getId();
        this.name = activityTime.getName();
        this.activity = activityTime.getActivity();
    }
}
