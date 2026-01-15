package com.ucl.kintai.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.ucl.kintai.dto.TimesheetDto;
import com.ucl.kintai.entity.Timesheet;
import com.ucl.kintai.repository.TimesheetRepository;
import com.ucl.kintai.enums.TimesheetStatus;

@Service
public class TimesheetService {

    @Autowired
    private TimesheetRepository timesheetRepository;

    public TimesheetService(TimesheetRepository timesheetRepository) {
        this.timesheetRepository = timesheetRepository;
    }

    // 查询所有 Timesheet 并转换成 DTO
    public List<TimesheetDto> findAll() {
        List<Timesheet> entities = timesheetRepository.findAll();
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    // Entity → DTO 转换方法
    private TimesheetDto toDto(Timesheet t) {
        return new TimesheetDto(
                t.getId(),
                t.getUser().getId(),
                t.getPeriodYear(),
                t.getPeriodMonth(),
                t.getPeriodStart(),
                t.getPeriodEnd(),
                TimesheetStatus.fromString(t.getStatus()), // 需要定义 enum 转换
                t.getWorkHours(),
                t.getOvertimeHours(),
                t.getNightHours(),
                t.getFinalizedAt()
        );
    }
    
}
