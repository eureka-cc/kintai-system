package com.ucl.kintai.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.ucl.kintai.enums.TimesheetStatus;

public class TimesheetDto {
    
    private final Long id;
    private final Long userId;

    private final int periodYear;
    private final int periodMonth;
    private final LocalDate periodStart;
    private final LocalDate periodEnd;

    private final TimesheetStatus status;

    private final double workHours;
    private final double overtimeHours;
    private final double nightHours;

    private final LocalDateTime finalizedAt;
    
    public TimesheetDto(
            Long id,
            Long userId,
            int periodYear,
            int periodMonth,
            LocalDate periodStart,
            LocalDate periodEnd,
            TimesheetStatus status,
            double workHours,
            double overtimeHours,
            double nightHours,
            LocalDateTime finalizedAt
    ) {
        this.id = id;
        this.userId = userId;
        this.periodYear = periodYear;
        this.periodMonth = periodMonth;
        this.periodStart = periodStart;
        this.periodEnd = periodEnd;
        this.status = status;
        this.workHours = workHours;
        this.overtimeHours = overtimeHours;
        this.nightHours = nightHours;
        this.finalizedAt = finalizedAt;
    }

    // ✅ 只有 getter
    public Long getId() { return id; }
    public Long getUserId() { return userId; }
    public int getPeriodYear() { return periodYear; }
    public int getPeriodMonth() { return periodMonth; }
    public LocalDate getPeriodStart() { return periodStart; }
    public LocalDate getPeriodEnd() { return periodEnd; }
    public String getStatus() { return status.getLabel(); }
    public String getStatusLabel() { return status.getLabel(); }
    public String getBadgeClass() { return status.getBadgeClass(); }
    public double getWorkHours() { return workHours; }
    public double getOvertimeHours() { return overtimeHours; }
    public double getNightHours() { return nightHours; }
    public LocalDateTime getFinalizedAt() { return finalizedAt; }

}
