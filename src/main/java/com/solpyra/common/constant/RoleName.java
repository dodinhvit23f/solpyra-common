package com.solpyra.common.constant;

public enum  RoleName {
    USER,
    ADMIN,
    MANAGER,
    FLORIST;

    public static boolean isValid(String role) {
        if (role == null) return false;
        try {
            RoleName.valueOf(role);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }
}
