package edu.uoc.dpoo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt {
	/**
	 * Method to digest into MD5 the password, so we will always have the password encrypted. 
	 * Note that we cannot rollback, so always before to do any action with user's passwords, we have
	 * to convert it into digest password. Because we are checking passwords on platform or user's class,
	 * I create it as a global method on another file.
	 * 
	 * It's just expecting a String and returning a String so it's not risky use it as a global method.
	 * 
	 * @param password
	 * @return generatedPassword
	 */
	public static String password(String password){
        String generatedPassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //Add password bytes to digest
            md.update(password.getBytes());
            //Get the hash's bytes 
            byte[] bytes = md.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            generatedPassword = sb.toString();
        } 
        catch (NoSuchAlgorithmException e) 
        {
            e.printStackTrace();
        }
        return generatedPassword;
	}
}
