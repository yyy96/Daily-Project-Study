package com.week.zumgnmarket.user.exception;

import javax.persistence.EntityNotFoundException;

public class UserNotFoundException extends EntityNotFoundException {

	public UserNotFoundException(String message) {
		super(message);
	}
}