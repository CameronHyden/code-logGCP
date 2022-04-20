package com.example.codeLog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeLogRepository extends JpaRepository<CodeLog, Integer> {
}
