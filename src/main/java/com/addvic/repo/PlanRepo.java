package com.addvic.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.addvic.entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer> {

}
