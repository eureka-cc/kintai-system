package com.ucl.kintai.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(name = "employee_code", unique = true, nullable = false)
    private String employeeCode;

    private String department;

    @Column(name = "email_verified_at")
    private LocalDateTime emailVerifiedAt;

    @Column(nullable = false)
    private String password;

    @Column(name = "remember_token")
    private String rememberToken;

    @Column(name = "annual_leave_remaining_days", nullable = false)
    private Double annualLeaveRemainingDays = 0.0;

    @Column(name = "annual_leave_next_renewal_date")
    private LocalDate annualLeaveNextRenewalDate;

    @Column(name = "furikyu_remaining_days", nullable = false)
    private Double furikyuRemainingDays = 0.0;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // 关联 Timesheet
    @OneToMany(mappedBy = "user")
    private List<Timesheet> timesheets;

    // getter & setter
    // 可以使用 Lombok @Getter @Setter 简化
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getEmployeeCode() { return employeeCode; }
    public void setEmployeeCode(String employeeCode) { this.employeeCode = employeeCode; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public LocalDateTime getEmailVerifiedAt() { return emailVerifiedAt; }
    public void setEmailVerifiedAt(LocalDateTime emailVerifiedAt) { this.emailVerifiedAt = emailVerifiedAt; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getRememberToken() { return rememberToken; }
    public void setRememberToken(String rememberToken) { this.rememberToken = rememberToken; }
    public Double getAnnualLeaveRemainingDays() { return annualLeaveRemainingDays; }
    public void setAnnualLeaveRemainingDays(Double annualLeaveRemainingDays) { this.annualLeaveRemainingDays = annualLeaveRemainingDays; }
    public LocalDate getAnnualLeaveNextRenewalDate() { return annualLeaveNextRenewalDate; }
    public void setAnnualLeaveNextRenewalDate(LocalDate annualLeaveNextRenewalDate) { this.annualLeaveNextRenewalDate = annualLeaveNextRenewalDate; }
    public Double getFurikyuRemainingDays() { return furikyuRemainingDays; }
    public void setFurikyuRemainingDays(Double furikyuRemainingDays) { this.furikyuRemainingDays = furikyuRemainingDays; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
    public List<Timesheet> getTimesheets() { return timesheets; }
    public void setTimesheets(List<Timesheet> timesheets) { this.timesheets = timesheets; }
}
