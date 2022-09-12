package com.theruzil.TenThousandHours.repository;

import com.theruzil.TenThousandHours.entity.ActivityTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityTimeRepository extends JpaRepository<ActivityTime, Long> {
}
