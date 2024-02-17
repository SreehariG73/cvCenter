package com.hack.cvcenter.constants;

public interface ErrorMessages {

    static final String IS_REQUIRED = "is required";

    static final String USERNAME_ERR_MSG = "Please enter username between minimum 3 and maximum 15 characters";

    static final String PASSWORD_REGEX_ERR_MSG = "Password must contain minimum eight characters, at least one letter, one number and one special character";

    static final String DOB_ERR_MSG = "Date of birth should be DD/mm/yyy";
    static final String USER_EXISTS_ERR_MSG = "USER already exists";

    static final String DB_CONNECTION_EXCEPTION = "Exception with connecting to database";

    static final String GENERAL_EXCEPTION_MSG = "Exception occured:";

    static final String PASSWORD_NOT_MATCH_ERR_MSG = "password and confirm password does not match";

    static final String USER_NOT_FOUND_ERR_MSG = "Username and email does not exist";

    static final String INVALID_PASSWORD_ERR_MSG = "Username and password does not match";

    static final String DATE_REGEX_ERR_MSG = "Please enter date in mm/dd/yyyy format";

    static final String TIME_REGEX_ERR_MSG = "Please enter time in hh:mm format";

    static final String USER_NOT_PRESENT_ERR_MSG = "Customer not found/invalid customer id";
}
