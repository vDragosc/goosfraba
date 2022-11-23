package com.project.city.management.repo;

import com.project.city.management.domain.ParkingFacilities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingFacilitiesRepo extends JpaRepository<ParkingFacilities, Integer> {
}
