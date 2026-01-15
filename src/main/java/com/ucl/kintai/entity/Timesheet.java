package com.ucl.kintai.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "timesheets")
public class Timesheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "period_year", nullable = false)
    private int periodYear;

    @Column(name = "period_month", nullable = false)
    private int periodMonth;

    @Column(name = "period_start")
    private LocalDate periodStart;

    @Column(name = "period_end")
    private LocalDate periodEnd;

    @Column(name = "default_start")
    private String defaultStart;

    @Column(name = "default_end")
    private String defaultEnd;

    @Column(name = "work_location")
    private String workLocation;

    @Column(nullable = false)
    private String status = "DRAFT";

    @Column(name = "summary_workdays", nullable = false)
    private int summaryWorkdays = 0;

    @Column(name = "summary_work_hours", nullable = false)
    private double summaryWorkHours = 0.0;

    @Column(name = "summary_overtime_hours", nullable = false)
    private double summaryOvertimeHours = 0.0;

    @Column(name = "summary_night_hours", nullable = false)
    private double summaryNightHours = 0.0;

    @Column(name = "summary_holiday_work_hours", nullable = false)
    private double summaryHolidayWorkHours = 0.0;

    @Column(name = "summary_annual_leave_full_days", nullable = false)
    private double summaryAnnualLeaveFullDays = 0.0;

    @Column(name = "summary_annual_leave_half_days", nullable = false)
    private double summaryAnnualLeaveHalfDays = 0.0;

    @Column(name = "summary_annual_leave_hours", nullable = false)
    private double summaryAnnualLeaveHours = 0.0;

    @Column(name = "summary_comp_off_days", nullable = false)
    private double summaryCompOffDays = 0.0;

    @Column(name = "summary_absence_days", nullable = false)
    private double summaryAbsenceDays = 0.0;

    @Column(name = "summary_late_count", nullable = false)
    private int summaryLateCount = 0;

    @Column(name = "summary_early_leave_count", nullable = false)
    private int summaryEarlyLeaveCount = 0;

    @Column(name = "reject_reason")
    private String rejectReason;

    @Column(name = "finalized_at")
    private LocalDateTime finalizedAt;

    @Column(name = "work_hours", nullable = false)
    private double workHours = 0.0;

    @Column(name = "standard_hours_total")
    private Integer standardHoursTotal;

    @Column(name = "overtime_hours", nullable = false)
    private double overtimeHours = 0.0;

    @Column(name = "night_hours", nullable = false)
    private double nightHours = 0.0;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // 勤怠日明細
    @OneToMany(mappedBy = "timesheet")
    private List<TimesheetDay> days;

    // getter & setter 
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public int getPeriodYear() { return periodYear; }
    public void setPeriodYear(int periodYear) { this.periodYear = periodYear; }
    public int getPeriodMonth() { return periodMonth; }
    public void setPeriodMonth(int periodMonth) { this.periodMonth = periodMonth; }
    public LocalDate getPeriodStart() { return periodStart; }
    public void setPeriodStart(LocalDate periodStart) { this.periodStart = periodStart; }
    public LocalDate getPeriodEnd() { return periodEnd; }
    public void setPeriodEnd(LocalDate periodEnd) { this.periodEnd = periodEnd; }
    public String getDefaultStart() { return defaultStart; }
    public void setDefaultStart(String defaultStart) { this.defaultStart = defaultStart; }
    public String getDefaultEnd() { return defaultEnd; }
    public void setDefaultEnd(String defaultEnd) { this.defaultEnd = defaultEnd; }
    public String getWorkLocation() { return workLocation; }
    public void setWorkLocation(String workLocation) { this.workLocation = workLocation; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public int getSummaryWorkdays() { return summaryWorkdays; }
    public void setSummaryWorkdays(int summaryWorkdays) { this.summaryWorkdays = summaryWorkdays; }
    public double getSummaryWorkHours() { return summaryWorkHours; }
    public void setSummaryWorkHours(double summaryWorkHours) { this.summaryWorkHours = summaryWorkHours; }
    public double getSummaryOvertimeHours() { return summaryOvertimeHours; }
    public void setSummaryOvertimeHours(double summaryOvertimeHours) { this.summaryOvertimeHours = summaryOvertimeHours; }
    public double getSummaryNightHours() { return summaryNightHours; }
    public void setSummaryNightHours(double summaryNightHours) { this.summaryNightHours = summaryNightHours; }
    public double getSummaryHolidayWorkHours() { return summaryHolidayWorkHours; }
    public void setSummaryHolidayWorkHours(double summaryHolidayWorkHours) { this.summaryHolidayWorkHours = summaryHolidayWorkHours; }
    public double getSummaryAnnualLeaveFullDays() { return summaryAnnualLeaveFullDays; }
    public void setSummaryAnnualLeaveFullDays(double summaryAnnualLeaveFullDays) { this.summaryAnnualLeaveFullDays = summaryAnnualLeaveFullDays; }
    public double getSummaryAnnualLeaveHalfDays() { return summaryAnnualLeaveHalfDays; }
    public void setSummaryAnnualLeaveHalfDays(double summaryAnnualLeaveHalfDays) { this.summaryAnnualLeaveHalfDays = summaryAnnualLeaveHalfDays; }
    public double getSummaryAnnualLeaveHours() { return summaryAnnualLeaveHours; }
    public void setSummaryAnnualLeaveHours(double summaryAnnualLeaveHours) { this.summaryAnnualLeaveHours = summaryAnnualLeaveHours; }
    public double getSummaryCompOffDays() { return summaryCompOffDays; }
    public void setSummaryCompOffDays(double summaryCompOffDays) { this.summaryCompOffDays = summaryCompOffDays; }
    public double getSummaryAbsenceDays() { return summaryAbsenceDays; }
    public void setSummaryAbsenceDays(double summaryAbsenceDays) { this.summaryAbsenceDays = summaryAbsenceDays; }
    public int getSummaryLateCount() { return summaryLateCount; }
    public void setSummaryLateCount(int summaryLateCount) { this.summaryLateCount = summaryLateCount; }
    public int getSummaryEarlyLeaveCount() { return summaryEarlyLeaveCount; }       
    public void setSummaryEarlyLeaveCount(int summaryEarlyLeaveCount) { this.summaryEarlyLeaveCount = summaryEarlyLeaveCount; }
    public String getRejectReason() { return rejectReason; }
    public void setRejectReason(String rejectReason) { this.rejectReason = rejectReason; }
    public LocalDateTime getFinalizedAt() { return finalizedAt; }
    public void setFinalizedAt(LocalDateTime finalizedAt) { this.finalizedAt = finalizedAt; }
    public double getWorkHours() { return workHours; }
    public void setWorkHours(double workHours) { this.workHours = workHours; }
    public Integer getStandardHoursTotal() { return standardHoursTotal; }
    public void setStandardHoursTotal(Integer standardHoursTotal) { this.standardHoursTotal = standardHoursTotal; }
    public double getOvertimeHours() { return overtimeHours; }
    public void setOvertimeHours(double overtimeHours) { this.overtimeHours = overtimeHours; }
    public double getNightHours() { return nightHours; }
    public void setNightHours(double nightHours) { this.nightHours = nightHours; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
    public List<TimesheetDay> getDays() { return days; }
    public void setDays(List<TimesheetDay> days) { this.days = days; }
}
