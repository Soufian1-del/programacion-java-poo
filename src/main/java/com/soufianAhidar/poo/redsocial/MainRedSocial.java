package com.soufianAhidar.poo.redsocial;
import java.util.ArrayList;
import java.util.Scanner;
public class MainRedSocial {
	public static void main(String[] args) {
		ProfileGenerator generator = new ProfileGenerator();
		Profile profilesAction = new Profile();
		Post postAction = new Post();
		Scanner sc = new Scanner(System.in);
		System.out.print("Welcome to DAM1´s social site! please, write your username: ");
		String userName = sc.nextLine();
		System.out.print("We need more information in case your account gets lost, please, add another username: ");
		String userName2 = sc.nextLine();
		System.out.print("Lastly, its important to have a private account, please add one last userName: ");
		String userName3 = sc.nextLine();
		Profile profile = generator.createProfileTest(userName);
		Profile profile2 = generator.generatePost(userName2, 3);
		Profile profile3 = generator.createProfileTest(userName3);
		
		ArrayList<Profile> profiles = new ArrayList<>();
		profiles.add(profile);
		profiles.add(profile2);
		profiles.add(profile3);
		
		for (Profile perfilRedSocial : profiles) {
			profilesAction.showInfo();
			postAction.mostrar();
		

		}
		
		profiles.get(0).addFollower(6);
		profiles.get(0).newPost("Just went out to eat in this new restaurant, I hope is worth the money");
		profiles.get(0).showInfo();
		profiles.get(0).showPost();
	}

}
