package edu.uoc.dpoo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class Platform {
	/**
	 * Attributes for Platform.
	 */
	private ArrayList<User> users ;
	
	/**
	 * Constructor for Platform class
	 */
	public Platform(){
		this.users = new ArrayList<User>();
	}
	
	
	/**
	 * METHODS FROM PLATFORM
	 */
	
	
	/**
	 * Metods registerUser
	 * @param name
	 * @param password
	 * @param fullname
	 * @return
	 */
	public User registerUser(String name, String password, String fullname) {
		User user_exist= findUser(name);
		if (user_exist==null){
			User new_user = new User(name,password,fullname);
			this.users.add(new_user);
			return new_user;
		}
		else{
			System.out.println(name+" is already taken.");
			return null;
		}
	}

	public User login(String username, String password) {
		String passDigested = Encrypt.password(password);
		User userAuth = null;
		for(User user: users){
			
			if(username.equals(user.getUsername()) && passDigested.equals(user.getPassword())){
				userAuth=user;
			}
			 
		}
		return userAuth;
	}

	public int getNumUsers() {
		return this.users.size();
	}

	public int getNumCompetitions() {
		return 0;
	}

	public Message sendMessage(User from, String to, String subject,
			String message) {
		return null;
	}

	public void evaluteAll() {

	}

	public User findUser(String username) {
		
		User result = null;
		for(User user: users){
			if (user.getUsername() == username){
				result = user;
			}
		}
		return result;
	}

	public ArrayList<Competition> getOpenCompetitions() {
		return null;
	}
	
	
}
