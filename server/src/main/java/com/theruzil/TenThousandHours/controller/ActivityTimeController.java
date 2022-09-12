package com.theruzil.TenThousandHours.controller;

import com.theruzil.TenThousandHours.entity.ActivityTime;
import com.theruzil.TenThousandHours.service.ActivityTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activityTime")
public class ActivityTimeController {

    private final ActivityTimeService activityTimeService;

    @Autowired
    public ActivityTimeController(ActivityTimeService activityTimeService) {
        this.activityTimeService = activityTimeService;
    }

    @PostMapping
    public ActivityTime create(@RequestBody ActivityTime activityTime) {
        return activityTimeService.create(activityTime);
    }

    @GetMapping
    public List<ActivityTime> findAll() {
        return activityTimeService.findAll();
    }

    @GetMapping("/{id}")
    public ActivityTime findById(@PathVariable Long id) {
        return activityTimeService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        activityTimeService.delete(id);
    }
}
