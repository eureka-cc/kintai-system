package com.ucl.kintai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.ucl.kintai.entity.Timesheet;

@Repository
public interface TimesheetRepository extends JpaRepository<Timesheet, Long> {

    // 按用户查询
    List<Timesheet> findByUserId(Long userId);

    // 按月份查询
    List<Timesheet> findByPeriodYearAndPeriodMonth(int year, int month);
}
