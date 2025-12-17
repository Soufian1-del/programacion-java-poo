package com.soufianAhidar.poo.redsocial;
import java.util.Locale;

import com.github.javafaker.Faker;

public class profileGenerator {
	//metodos
	private static Faker faker = new Faker(Locale.forLanguageTag("es"));

	public static PerfilRedSocial createProfileTest(String profileName) {
		PerfilRedSocial profile = new PerfilRedSocial();
		profile.setName(profileName);
		profile.setUserName(faker.name().fullName());
		profile.setBio(faker.lorem().paragraph());
		profile.setLocation(faker.country().name());
		profile.setFollowers(faker.number().hashCode());
		profile.setNumberOfPublications(0);
		profile.setVerified(false);
		return profile;
	}
	
	public static PerfilRedSocial generatePost(String profileName2, int amountOfPost) {
		PerfilRedSocial profile = createProfileTest(profileName2);
		Publicacion profile2 = new Publicacion();
		for (int i = 0; i < amountOfPost; i++) {
			profile2.setPublicacion(profileName2);
		}
		return profile;
	}
}

