package com.theruzil.TenThousandHours.service.impl;

import com.theruzil.TenThousandHours.entity.Activity;
import com.theruzil.TenThousandHours.repository.ActivityRepository;
import com.theruzil.TenThousandHours.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActivityServiceImpl implements ActivityService {

    private final ActivityRepository activityRepository;

    @Autowired
    public ActivityServiceImpl(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @Override
    public Activity create(Activity activity) {
        return activityRepository.save(activity);
    }

    @Override
    public void delete(Long id) {
        Optional<Activity> activity = activityRepository.findById(id);

        activity.ifPresent(activityRepository::delete);
    }

    @Override
    public List<Activity> findAll() {
        return activityRepository.findAll();
    }

    @Override
    public Activity findById(Long id) {
        return activityRepository.findById(id).orElse(null);
    }
}
