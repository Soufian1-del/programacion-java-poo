package com.soufianAhidar.poo.redsocial;
import java.util.ArrayList;

public class PerfilRedSocial {
	//Atributos
	private String name;
	private String userName;
	private String bio;
	private String location;
	private int followers;
	private int numberOfPublications;
	private Estado status;
	private boolean verified;
	private ArrayList<String> published;	
	//metodos
	public void showInfo() {
		System.out.printf("Your name is %s /n your username is %s /n your bio says '%s' /n you live in %s /n currently,  you have %d followers /n", name, userName, bio, location, followers);
	}
	
	public void addFollower(int followerAmountToAdd) {
		followers+= followerAmountToAdd;
	}
	
	public void changeUserStatus(boolean profileStatus) {
		if (profileStatus) {
			status= Estado.ACTIVADO;
		} else {
			status = Estado.DESACTIVADO;
		}
	}
	
	public void userStatus() {
		if (status==Estado.ACTIVADO) {
			System.out.println("perfil activado");
		} else {
			System.out.println("perfil no activado");
		}
	}
	
	public void newPost(String postContent) {
		published.add(postContent);
	}
	
	public void showPost() {
		published.forEach(n -> System.out.println(n));
	}
	 
	
	//getters y setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getFollowers() {
		return followers;
	}
	public void setFollowers(int followers) {
		this.followers = followers;
	}
	public int getNumberOfPublications() {
		return numberOfPublications;
	}
	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	public Estado getStatus() {
		return status;
	}
	public void setStatus(Estado status) {
		this.status = status;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public ArrayList<String> getPublished() {
		return published;
	}

	public void setPublished(ArrayList<String> published) {
		this.published = published;
	}
	
	public PerfilRedSocial() {
		this.published= new ArrayList<>();

	}
	
}
