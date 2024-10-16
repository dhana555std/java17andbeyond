package org.dhana.day2.switchadv;

public enum Status {
    ACTIVE(1, "Active Status"),
    INACTIVE(0, "Inactive Status"),
    PENDING(2, "Pending Status");

    private final int code;
    private final String description;

    Status(int code, String description) {
        this.description = description;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
