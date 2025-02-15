package com.lakshmi.metro.repository;

import com.lakshmi.metro.model.SOSAlert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SOSRepository extends JpaRepository<SOSAlert, String> {
}