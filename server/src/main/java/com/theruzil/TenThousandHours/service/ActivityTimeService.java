package com.theruzil.TenThousandHours.service;

import com.theruzil.TenThousandHours.entity.ActivityTime;

import java.util.List;

public interface ActivityTimeService {
    ActivityTime create(ActivityTime activityTime);

    void delete(Long id);

    List<ActivityTime> findAll();

    ActivityTime findById(Long id);
}
