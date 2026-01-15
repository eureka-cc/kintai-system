package com.ucl.kintai.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "timesheets_days")
public class TimesheetDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "timesheet_id", nullable = false)
    private Timesheet timesheet;

    @Column(name = "work_date", nullable = false)
    private LocalDate workDate;

    @Column(name = "leave_type")
    private String leaveType;

    @Column(name = "clock_in_hour")
    private Integer clockInHour;

    @Column(name = "clock_in_minute")
    private Integer clockInMinute;

    @Column(name = "clock_out_hour")
    private Integer clockOutHour;

    @Column(name = "clock_out_minute")
    private Integer clockOutMinute;

    @Column(name = "lunch_break_hours")
    private Double lunchBreakHours;

    @Column(name = "after_hours_break_hours", nullable = false)
    private double afterHoursBreakHours = 0.0;

    @Column(name = "midnight_break_hours", nullable = false)
    private double midnightBreakHours = 0.0;

    @Column(name = "work_hours", nullable = false)
    private double workHours = 0.0;

    @Column(name = "overtime_hours", nullable = false)
    private double overtimeHours = 0.0;

    @Column(name = "night_hours", nullable = false)
    private double nightHours = 0.0;

    @Column(name = "standard_hours_of_day", nullable = false)
    private double standardHoursOfDay = 8.0;

    @Column(columnDefinition = "text")
    private String note;

    @Column(name = "is_holiday", nullable = false)
    private boolean isHoliday = false;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // getter & setter 
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }    
    public Timesheet getTimesheet() { return timesheet; }
    public void setTimesheet(Timesheet timesheet) { this.timesheet = timesheet; }
    public LocalDate getWorkDate() { return workDate; }
    public void setWorkDate(LocalDate workDate) { this.workDate = workDate; }
    public String getLeaveType() { return leaveType; }
    public void setLeaveType(String leaveType) { this.leaveType = leaveType; }
    public Integer getClockInHour() { return clockInHour; }
    public void setClockInHour(Integer clockInHour) { this.clockInHour = clockInHour; }
    public Integer getClockInMinute() { return clockInMinute; } 
    public void setClockInMinute(Integer clockInMinute) { this.clockInMinute = clockInMinute; }
    public Integer getClockOutHour() { return clockOutHour; }
    public void setClockOutHour(Integer clockOutHour) { this.clockOutHour = clockOutHour; }
    public Integer getClockOutMinute() { return clockOutMinute; }
    public void setClockOutMinute(Integer clockOutMinute) { this.clockOutMinute = clockOutMinute; }
    public Double getLunchBreakHours() { return lunchBreakHours; }
    public void setLunchBreakHours(Double lunchBreakHours) { this.lunchBreakHours = lunchBreakHours; }
    public double getAfterHoursBreakHours() { return afterHoursBreakHours; }
    public void setAfterHoursBreakHours(double afterHoursBreakHours) { this.afterHoursBreakHours = afterHoursBreakHours; }
    public double getMidnightBreakHours() { return midnightBreakHours; }
    public void setMidnightBreakHours(double midnightBreakHours) { this.midnightBreakHours = midnightBreakHours; }
    public double getWorkHours() { return workHours; }
    public void setWorkHours(double workHours) { this.workHours = workHours; }
    public double getOvertimeHours() { return overtimeHours; }
    public void setOvertimeHours(double overtimeHours) { this.overtimeHours = overtimeHours; }
    public double getNightHours() { return nightHours; }
    public void setNightHours(double nightHours) { this.nightHours = nightHours; }
    public double getStandardHoursOfDay() { return standardHoursOfDay; }
    public void setStandardHoursOfDay(double standardHoursOfDay) { this.standardHoursOfDay = standardHoursOfDay; }
    public String getNote() { return note; }
    public void setNote(String note) { this.note = note; }
    public boolean isHoliday() { return isHoliday; }
    public void setHoliday(boolean holiday) { isHoliday = holiday; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
