package com.emmanuelpapa.user.repository;

import com.emmanuelpapa.user.entity.Userr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserrRepository extends JpaRepository<Userr, Long> {
    Userr getUserById(Long userrdId);
}
