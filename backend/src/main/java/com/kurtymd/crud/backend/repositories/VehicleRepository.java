package com.kurtymd.crud.backend.repositories;

import com.kurtymd.crud.backend.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
