package com.ucl.kintai.enums;

public enum TimesheetStatus {
    DRAFT("下書き"),
    SUBMITTED("提出済み"),
    APPR_S1("一次承認済み"),
    APPR_S2("二次承認済み"),
    APPR_ADMIN("最終承認済み"),
    RETURN_S1("営業1次から差戻し"),
    RETURN_S2("営業2次から差戻し"),
    RETURN_ADMIN("総務から差戻し");

    private final String label;

    TimesheetStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static TimesheetStatus fromString(String status) {
        for (TimesheetStatus s : TimesheetStatus.values()) {
            if (s.name().equals(status)) return s;
        }
        return DRAFT; // 默认值
    }

    public String getBadgeClass() {
        switch (this) {
            case DRAFT:
                return "badge-secondary";
            case SUBMITTED:
                return "badge-primary";
            case APPR_S1:
            case APPR_S2:
            case APPR_ADMIN:
                return "badge-success";
            case RETURN_S1:
            case RETURN_S2:
            case RETURN_ADMIN:
                return "badge-danger";
            default:
                return "badge-secondary";
        }
    }
}
    