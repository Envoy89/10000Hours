package com.theruzil.TenThousandHours.repository;

import com.theruzil.TenThousandHours.entity.ActivityTime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityTimeRepository extends JpaRepository<ActivityTime, Long> {

    List<ActivityTime> findActivityTimeByActivity_Id(Long activityId);
}
