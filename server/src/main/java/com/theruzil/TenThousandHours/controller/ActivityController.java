package com.theruzil.TenThousandHours.controller;

import com.theruzil.TenThousandHours.entity.Activity;
import com.theruzil.TenThousandHours.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    private final ActivityService activityService;

    @Autowired
    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @PostMapping
    public Activity create(@RequestBody Activity activity) {
        return activityService.create(activity);
    }

    @GetMapping
    public List<Activity> findAll() {
        return activityService.findAll();
    }

    @GetMapping("/{id}")
    public Activity findById(@PathVariable Long id) {
        return activityService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        activityService.delete(id);
    }
}
