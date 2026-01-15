package com.ucl.kintai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.ucl.kintai.entity.TimesheetDay;

public interface TimesheetDayRepository extends JpaRepository<TimesheetDay, Long> {

    List<TimesheetDay> findByTimesheetId(Long timesheetId);
}
