package com.theruzil.TenThousandHours.repository;

import com.theruzil.TenThousandHours.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
