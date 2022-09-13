package com.theruzil.TenThousandHours.service;

import com.theruzil.TenThousandHours.entity.ActivityTime;

import java.util.List;

public interface ActivityTimeService {
    ActivityTime create(Long activityId, ActivityTime activityTime);

    void delete(Long activityTimeId);

    List<ActivityTime> findAllByActivityId(Long activityId);

    ActivityTime findById(Long activityTimeId);
}
