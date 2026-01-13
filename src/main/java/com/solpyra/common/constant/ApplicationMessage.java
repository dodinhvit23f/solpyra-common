package com.solpyra.common.constant;

public class ApplicationMessage {
  public static class ErrorMessage {
    // User
    /* ===================== AUTH (001+) ===================== */
    public static final String TENANT_IS_EMPTY = "ERROR_AUTH_001";
    public static final String USERNAME_IS_EMPTY = "ERROR_AUTH_002";
    public static final String PASSWORD_IS_EMPTY = "ERROR_AUTH_003";
    public static final String INVALID_TOKEN = "ERROR_AUTH_004";
    public static final String UNAUTHORIZED_ACCESS = "ERROR_AUTH_005";
    public static final String TENANT_MAX_LENGTH_EXCEEDED = "ERROR_AUTH_006";
    public static final String USER_OR_PASSWORD_NOT_EXIST = "ERROR_AUTH_007";
    public static final String REFRESH_TOKEN_IS_EMPTY = "ERROR_AUTH_008";
    public static final String USER_NOT_EXIST = "ERROR_AUTH_009";
    public static final String USER_NOT_ACTIVE = "ERROR_AUTH_010";
    public static final String OLD_PASSWORD_NOT_EMPTY = "ERROR_AUTH_011";
    public static final String NEW_PASSWORD_NOT_EMPTY = "ERROR_AUTH_012";
    public static final String ACCESS_TOKEN_IS_EMPTY = "ERROR_AUTH_013";
    public static final String OTP_CODE_IS_EMPTY = "ERROR_AUTH_014";
    public static final String OTP_NOT_CORRECT = "ERROR_AUTH_015";
    public static final String ROLE_NOT_EXIST = "ERROR_AUTH_016";
    public static final String PASSWORD_NOT_CORRECT = "ERROR_AUTH_017";
    public static final String OTP_TOKEN_IS_EMPTY = "ERROR_AUTH_018";
    public static final String OTP_SECRET_IS_EMPTY = "ERROR_AUTH_019";
    public static final String ID_IS_REQUIRED = "ERROR_AUTH_020";
    public static final String PHONE_NUMBER_MAX_LENGTH_EXCEEDED = "ERROR_AUTH_021";
    public static final String USERNAME_MAX_LENGTH_EXCEEDED = "ERROR_AUTH_022";
    public static final String USER_NAME_IS_REQUIRED = "ERROR_AUTH_023";
    public static final String USER_PASSWORD_IS_REQUIRED = "ERROR_AUTH_024";
    public static final String USER_PASSWORD_MIN_REQUIRED = "ERROR_AUTH_025";
    public static final String TENANT_NOT_FOUND = "ERROR_AUTH_026";

    /* ===================== FACILITY (001+) ===================== */
    public static final String FACILITY_NOT_FOUND = "ERROR_FACILITY_001";
    public static final String NAME_IS_REQUIRED = "ERROR_FACILITY_002";
    public static final String ADDRESS_IS_REQUIRED = "ERROR_FACILITY_003";
    public static final String LATITUDE_IS_REQUIRED = "ERROR_FACILITY_004";
    public static final String LONGITUDE_IS_REQUIRED = "ERROR_FACILITY_005";
    public static final String ALLOW_DISTANCE_MIN = "ERROR_FACILITY_006";
    public static final String ALLOW_DISTANCE_MAX = "ERROR_FACILITY_007";

    /* ===================== EMPLOYEE (001+) ===================== */
    public static final String EMPLOYEE_NOT_FOUND = "ERROR_EMPLOYEE_001";
    public static final String EMPLOYEE_ID_ALREADY_EXISTS = "ERROR_EMPLOYEE_002";
    public static final String EMAIL_ALREADY_EXISTS = "ERROR_EMPLOYEE_003";
    public static final String EMPLOYEE_ID_IS_REQUIRED = "ERROR_EMPLOYEE_004";
    public static final String FULL_NAME_IS_REQUIRED = "ERROR_EMPLOYEE_005";
    public static final String EMAIL_IS_REQUIRED = "ERROR_EMPLOYEE_006";
    public static final String INVALID_EMAIL_FORMAT = "ERROR_EMPLOYEE_007";
    public static final String PHONE_NUMBER_IS_REQUIRED = "ERROR_EMPLOYEE_008";
    public static final String ACTIVE_STATUS_IS_REQUIRED = "ERROR_EMPLOYEE_009";
    public static final String VERSION_IS_REQUIRED = "ERROR_EMPLOYEE_010";
    public static final String ROLE_IS_REQUIRED = "ERROR_EMPLOYEE_011";
    public static final String FACILITY_IDS_IS_REQUIRED = "ERROR_EMPLOYEE_012";
    public static final String USERNAME_ALREADY_EXISTS = "ERROR_EMPLOYEE_013";
    public static final String ROLE_NAME_NOT_FOUND = "ERROR_EMPLOYEE_014";

    /* ===================== QR (001+) ===================== */
    public static final String QR_CODE_GENERATION_FAILED = "ERROR_QR_001";

    /* ===================== ATTENDANCE (001+) ===================== */
    public static final String ATTENDANCE_NOT_FOUND = "ERROR_ATTENDANCE_001";
    public static final String NOT_IN_ALLOWED_DISTANCE = "ERROR_ATTENDANCE_002";
    public static final String QR_CODE_EXPIRED = "ERROR_ATTENDANCE_003";
    public static final String LONGITUDE_REQUIRED = "ERROR_ATTENDANCE_004";
    public static final String LATITUDE_REQUIRED = "ERROR_ATTENDANCE_005";
    public static final String FACILITIES_NOT_FOUND = "ERROR_ATTENDANCE_006";
    public static final String FACILITY_REQUIRED= "ERROR_ATTENDANCE_007";
    public static final String NO_ATTENDANCE_RECORDS_FOUND = "ERROR_ATTENDANCE_008";
    public static final String EXPORT_START_DATE_REQUIRED = "ERROR_ATTENDANCE_009";
    public static final String EXPORT_END_DATE_REQUIRED = "ERROR_ATTENDANCE_010";
    public static final String EXPORT_DATE_RANGE_INVALID = "ERROR_ATTENDANCE_011";
    public static final String EXPORT_FAILED = "ERROR_ATTENDANCE_012";
    public static final String GOOGLE_API_ERROR = "ERROR_ATTENDANCE_013";

    /* ===================== ORDER (001+) ===================== */
    public static final String ORDER_CODE_NOT_EMPTY = "ERROR_ORDER_001";


    /* ===================== Optimistic (001+) ===================== */
    public static final String RECORD_HAVE_BEEN_CHANGED = "ERROR_OPT_001";
  }

}
