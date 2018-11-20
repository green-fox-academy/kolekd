package com.greenfox.frontend.repository;

import com.greenfox.frontend.models.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<Log, Long> {
}
