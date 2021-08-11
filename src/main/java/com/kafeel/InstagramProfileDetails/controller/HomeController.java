package com.kafeel.InstagramProfileDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kafeel.InstagramProfileDetails.model.UserDetails;
import com.kafeel.InstagramProfileDetails.service.InstagramProfileDetailsService;

/**
 * @author Kafeelur Rahman T K
 *
 */

@Controller
public class HomeController {
	
	@Autowired
	InstagramProfileDetailsService profile;
	UserDetails details;
	@RequestMapping("/")
	public String index() {
		profile.loginUser();
		return "index";
	}
	
	@RequestMapping("/profile")
	public ModelAndView profile(@RequestParam("username") String username) {
		ModelAndView mv=new ModelAndView("profile");
		details=profile.profileDetails(username);
		mv.addObject("profile", details);
		
		return mv;
	}
	
	
	@RequestMapping("/followers")
	@ResponseBody
	public String followers() {
		String followers=details.getFollowersName().toString();
		if(followers.equals("[]"))
			return "<center><h2 class='display-2 text-danger'>Private Account</h2></center>"; 
		return "<h2 class='display-2'>"+followers+"</h2>";
	}
}
