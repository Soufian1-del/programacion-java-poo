package com.soufianAhidar.poo.redsocial;

public class profileGenerator {
	//metodos
	
	public static PerfilRedSocial createProfileTest(String profileName) {
		PerfilRedSocial profile = new PerfilRedSocial();
		profile.setName(profileName);
		profile.setUserName("User1");
		profile.setBio("tell us a little about yourself");
		profile.setLocation("where do you live?");
		profile.setFollowers(0);
		profile.setNumberOfPublications(0);
		profile.setVerified(false);
		return profile;
	}
	
	public static PerfilRedSocial generatePost(String profileName2, int amountOfPost) {
		PerfilRedSocial profile = new PerfilRedSocial();
//		profile.setName(profileName);
//		profile.setUserName("User1");
//		profile.setBio("tell us a little about yourself");
//		profile.setLocation("where do you live?");
//		profile.setFollowers(0);
//		profile.setNumberOfPublications(0);
//		profile.setVerified(false);
		createProfileTest(profileName2);
		for (int i = 0; i < amountOfPost; i++) {
			profile.newPost("this is a test post");
		}
		return profile;
	}
}
