package com.abdurrakhmann.simplecrud.repository;

import com.abdurrakhmann.simplecrud.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}