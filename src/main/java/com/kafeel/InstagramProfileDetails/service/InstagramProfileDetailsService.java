package com.kafeel.InstagramProfileDetails.service;

import com.kafeel.InstagramProfileDetails.model.UserDetails;

/**
 * @author Kafeelur Rahman T K
 *
 */
public interface InstagramProfileDetailsService {
	public void loginUser();
	public UserDetails profileDetails(String username);
}
