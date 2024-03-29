package com.hack.cvcenter.facade;

import com.hack.cvcenter.dto.LoginDto;
import com.hack.cvcenter.dto.UserDto;
import com.hack.cvcenter.dto.UserSearchDto;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.ResponseEntity;

public interface UserFacade {

    ResponseEntity<?> createUser(UserDto userDto) throws DuplicateKeyException;

    ResponseEntity<?> userLogin(LoginDto loginDto);

    ResponseEntity<?> fetchAllUserDetails(String userUuid);

    ResponseEntity<?> fetchFilteredUsers(UserSearchDto userSearchDto);
}
