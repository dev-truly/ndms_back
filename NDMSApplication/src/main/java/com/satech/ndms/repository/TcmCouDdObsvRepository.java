package com.satech.ndms.repository;

import com.satech.ndms.entity.TcmCouDdObsv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TcmCouDdObsvRepository extends JpaRepository<TcmCouDdObsv, String>, TcmCouDdObsvRepositoryCustom {
}