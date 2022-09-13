package com.theruzil.TenThousandHours.controller;

import com.theruzil.TenThousandHours.entity.ActivityTime;
import com.theruzil.TenThousandHours.service.ActivityTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/activity/{activityId}/time")
public class ActivityTimeController {

    private final ActivityTimeService activityTimeService;

    @Autowired
    public ActivityTimeController(ActivityTimeService activityTimeService) {
        this.activityTimeService = activityTimeService;
    }

    @PostMapping
    public ActivityTime create(@PathVariable("activityId") Long activityId, @RequestBody ActivityTime activityTime) {
        return activityTimeService.create(activityId, activityTime);
    }

    @GetMapping
    public List<ActivityTime> findAll(@PathVariable("activityId") Long activityId) {
        return activityTimeService.findAllByActivityId(activityId);
    }

    @GetMapping("/{activityTimeId}")
    public ActivityTime findById(@PathVariable Long activityTimeId) {
        return activityTimeService.findById(activityTimeId);
    }

    @DeleteMapping("/{activityTimeId}")
    public void delete(@PathVariable Long activityTimeId) {
        activityTimeService.delete(activityTimeId);
    }
}
