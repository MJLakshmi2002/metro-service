package com.lakshmi.metro.repository;

import com.lakshmi.metro.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, String> {
}