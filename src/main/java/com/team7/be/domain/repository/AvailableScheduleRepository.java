package com.team7.be.domain.repository;

import com.team7.be.domain.entity.availableSchedule.AvailableSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AvailableScheduleRepository extends JpaRepository<AvailableSchedule,Long> {

    List<AvailableSchedule> findByAvailableScheduleIdAndGroupId(@Param("availableScheduleId")Long availableScheduleId, @Param("groupId")Long groupId);

    List<AvailableSchedule> findByGroupId(@Param("groupId")Long groupId);

    List<AvailableSchedule> findByUserName(@Param("userName")String userName);

    List<AvailableSchedule> findByAvailableScheduleId(@Param("availableScheduleId")Long availableScheduleId);

}
