package com.kafeel.InstagramProfileDetails.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.brunocvcunha.instagram4j.Instagram4j;
import org.brunocvcunha.instagram4j.requests.InstagramGetUserFollowersRequest;
import org.brunocvcunha.instagram4j.requests.InstagramSearchUsernameRequest;
import org.brunocvcunha.instagram4j.requests.payload.InstagramGetUserFollowersResult;
import org.brunocvcunha.instagram4j.requests.payload.InstagramSearchUsernameResult;
import org.brunocvcunha.instagram4j.requests.payload.InstagramUserSummary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.kafeel.InstagramProfileDetails.model.UserDetails;

/**
 * @author Kafeelur Rahman T K
 *
 */
@ComponentScan("com.kafeel")
@Component
public class InstagramProfileDetailsServiceImpl implements InstagramProfileDetailsService {
	
	private Instagram4j instagram;
	
	@Value("${app.instagram.username}")
	private String username;
	
	@Value("${app.instagram.password}")
	private String password;
	
	
	UserDetails userDetails = new UserDetails();
	
	@Override
	public void loginUser() {
		
		try {
			
			instagram = Instagram4j.builder()
					.username(username)
					.password(password)
					.build();
			
			instagram.setup();
			instagram.login();
			
			System.out.println("Login Successfull...");
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}

	}

	@Override
	public UserDetails profileDetails(String uname) {
		
		
		try {
			
			InstagramSearchUsernameResult searchResult=instagram.sendRequest( new InstagramSearchUsernameRequest(uname));
			
			String nextMaxId=null;
			
			userDetails.setUsername(searchResult.getUser().getUsername());
			userDetails.setProfileID(searchResult.getUser().getPk());
			userDetails.setProfileUrl(searchResult.getUser().getProfile_pic_url());
			userDetails.setProfileBio(searchResult.getUser().getBiography());
			userDetails.setFollowersCount(searchResult.getUser().getFollower_count());
			userDetails.setFollowingCount(searchResult.getUser().getFollowing_count());
			
			List<InstagramUserSummary> users=new ArrayList<>();
			
			List<String> followersName=new ArrayList<>();
			
			while(true) {
				
				InstagramGetUserFollowersResult res = instagram
						.sendRequest(new InstagramGetUserFollowersRequest(searchResult.getUser().pk,nextMaxId));
				
				users.addAll(res.getUsers());
				
				nextMaxId=res.getNext_max_id();
				
				if(nextMaxId == null) {
					break;
				}
			}
			
			for(int i=0;i<users.size();i++) {
				
				String user=users.get(i).toString();
				user=user.substring(user.indexOf("username="),user.indexOf("pk"));
				user=user.replace("username=","");
				user=user.replace(",", "");
				
				followersName.add(user);
				
			}
			
			userDetails.setFollowersName(followersName);
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return userDetails;
		
	}

}
