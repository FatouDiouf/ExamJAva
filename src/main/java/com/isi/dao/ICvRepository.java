package com.isi.dao;

import com.isi.entities.CvUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICvRepository extends JpaRepository<CvUserEntity, Integer> {
    Optional<CvUserEntity> findByEmail(String email);
}
