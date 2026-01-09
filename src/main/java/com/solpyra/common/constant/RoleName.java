package com.solpyra.common.constant;

/**
 * Role name constants used throughout the application.
 *
 * <p>These constants define the standard roles in the system and their access levels.
 */
public class RoleName {

  // Administrative roles
  public static final String ADMIN = "ADMIN";
  public static final String MANAGER = "MANAGER";

  // User roles
  public static final String USER = "USER";
  public static final String FLORIST = "FLORIST";
  public static final String SALE = "SALE";

  /**
   * Validates if a given role name is valid.
   *
   * @param role the role name to validate
   * @return true if the role is valid, false otherwise
   */
  public static boolean isValid(String role) {
    if (role == null) return false;
    return role.equals(ADMIN) || role.equals(MANAGER) ||
           role.equals(USER) || role.equals(FLORIST) || role.equals(SALE);
  }

  private RoleName() {
    // Prevent instantiation
  }
}
