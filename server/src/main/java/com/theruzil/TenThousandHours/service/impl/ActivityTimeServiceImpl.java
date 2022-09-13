package com.theruzil.TenThousandHours.service.impl;

import com.theruzil.TenThousandHours.entity.Activity;
import com.theruzil.TenThousandHours.entity.ActivityTime;
import com.theruzil.TenThousandHours.exception.ResourceNotFoundException;
import com.theruzil.TenThousandHours.repository.ActivityRepository;
import com.theruzil.TenThousandHours.repository.ActivityTimeRepository;
import com.theruzil.TenThousandHours.service.ActivityTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityTimeServiceImpl implements ActivityTimeService {

    private final ActivityTimeRepository activityTimeRepository;
    private final ActivityRepository activityRepository;

    @Autowired
    public ActivityTimeServiceImpl(
            ActivityTimeRepository activityTimeRepository,
            ActivityRepository activityRepository
    ) {
        this.activityTimeRepository = activityTimeRepository;
        this.activityRepository = activityRepository;
    }

    @Override
    public ActivityTime create(Long activityId, ActivityTime activityTime) {
        Activity activity = activityRepository.findById(activityId).orElseThrow(ResourceNotFoundException::new);

        ActivityTime newActivityTime = new ActivityTime(activityTime);
        newActivityTime.setActivity(activity);

        return activityTimeRepository.save(newActivityTime);
    }

    @Override
    public void delete(Long activityTimeId) {
        ActivityTime activityTime = activityTimeRepository.findById(activityTimeId).orElseThrow(ResourceNotFoundException::new);
        activityTimeRepository.delete(activityTime);
    }

    @Override
    public List<ActivityTime> findAllByActivityId(Long activityId) {
        return activityTimeRepository.findActivityTimeByActivity_Id(activityId);
    }

    @Override
    public ActivityTime findById(Long activityTimeId) {
        return activityTimeRepository.findById(activityTimeId).orElseThrow(ResourceNotFoundException::new);
    }
}
