package com.kafeel.InstagramProfileDetails.model;

import java.util.List;

import org.springframework.stereotype.Component;


/**
 * @author Kafeelur Rahman T K
 *
 */
@Component
public class UserDetails {
	private String profileUrl;
	private String username;
	private long profileID;
	private String profileBio;
	private int followersCount;
	private int followingCount;
	private List<String> followersName;
	
	public String getProfileUrl() {
		return profileUrl;
	}
	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getProfileID() {
		return profileID;
	}
	public void setProfileID(long profileID) {
		this.profileID = profileID;
	}
	public String getProfileBio() {
		return profileBio;
	}
	public void setProfileBio(String profileBio) {
		this.profileBio = profileBio;
	}
	public int getFollowersCount() {
		return followersCount;
	}
	public void setFollowersCount(int followersCount) {
		this.followersCount = followersCount;
	}
	public int getFollowingCount() {
		return followingCount;
	}
	public void setFollowingCount(int followingCount) {
		this.followingCount = followingCount;
	}
	@Override
	public String toString() {
		return "UserDetails [profileUrl=" + profileUrl + ", username=" + username + ", profileID=" + profileID
				+ ", profileBio=" + profileBio + ", followersCount=" + followersCount + ", followingCount="
				+ followingCount + ", followersName=" + followersName.toString() + "]";
	}
	public List<String> getFollowersName() {
		return followersName;
	}
	public void setFollowersName(List<String> followersName) {
		this.followersName = followersName;
	}
	
	
}
