package com.theruzil.TenThousandHours.service;

import com.theruzil.TenThousandHours.entity.Activity;

import java.util.List;

public interface ActivityService {
    Activity create(Activity activity);

    void delete(Long id);

    List<Activity> findAll();

    Activity findById(Long id);
}
