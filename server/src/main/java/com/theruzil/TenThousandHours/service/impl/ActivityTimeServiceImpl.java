package com.theruzil.TenThousandHours.service.impl;

import com.theruzil.TenThousandHours.entity.ActivityTime;
import com.theruzil.TenThousandHours.repository.ActivityTimeRepository;
import com.theruzil.TenThousandHours.service.ActivityTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActivityTimeServiceImpl implements ActivityTimeService {

    private final ActivityTimeRepository activityTimeRepository;

    @Autowired
    public ActivityTimeServiceImpl(ActivityTimeRepository activityTimeRepository) {
        this.activityTimeRepository = activityTimeRepository;
    }

    @Override
    public ActivityTime create(ActivityTime activityTime) {
        return activityTimeRepository.save(activityTime);
    }

    @Override
    public void delete(Long id) {
        Optional<ActivityTime> activityTime = activityTimeRepository.findById(id);

        activityTime.ifPresent(activityTimeRepository::delete);
    }

    @Override
    public List<ActivityTime> findAll() {
        return activityTimeRepository.findAll();
    }

    @Override
    public ActivityTime findById(Long id) {
        return activityTimeRepository.findById(id).orElse(null);
    }
}
