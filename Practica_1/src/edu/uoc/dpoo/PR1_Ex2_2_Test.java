package edu.uoc.dpoo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.uoc.dpoo.Organizer;
import edu.uoc.dpoo.User;
import edu.uoc.dpoo.Platform;
import edu.uoc.dpoo.Participant;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author xavie
 */
public class PR1_Ex2_2_Test {
    
    private final String username1 = "username1";
    private final String password1 = "password1";
    private final String fullName1 = "Test User 1";
    
    private final String username2 = "username2";
    private final String password2 = "password2";
    private final String fullName2 = "Test User 2";
    
    public PR1_Ex2_2_Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    // Test login and check password   
    @Test
    public void checkPassword() {      
        Platform platform = new Platform();
        
        // Check that no user is in the platform
        assertEquals((int)platform.getNumUsers(), 0);
        
        // Register new user
        User u1=platform.registerUser(username1, password1, fullName1);        
        assertNotNull(u1);
        
        // Test password check
        assertTrue(u1.checkPassword(password1));
        assertFalse(u1.checkPassword(password2));
        
        // Check that only 1 user is in the platform
        assertEquals((int)platform.getNumUsers(), 1);
        
        // Try to login with the user credentials
        User u2 = platform.login(username1, password1);
        assertNotNull(u2);
        
        // User information is correct
        assertEquals(u1, u2);        
        
        // Check that only 1 user is in the platform (login does not created new user)
        assertEquals((int)platform.getNumUsers(), 1);        
    }
    
     // Test create new user controls  
    @Test
    public void loginUser() {        
        Platform platform = new Platform();
        
        // Check that no user is in the platform
        assertEquals((int)platform.getNumUsers(), 0);
        
        // Register new user
        User u1=platform.registerUser(username1, password1, fullName1);
        assertNotNull(u1);
        assertEquals((int)platform.getNumUsers(), 1);
        
        // Try to login with the new user credentials
        User u2 = platform.login(username1, password1);
        assertNotNull(u2);
        assertEquals((int)platform.getNumUsers(), 1);
        
        // User information is correct
        assertEquals(u1, u2);
        
        // Try to login with invalid username
        User u3 = platform.login(username2, password1);
        assertNull(u3);
        assertEquals((int)platform.getNumUsers(), 1);
        
        // Try to login with invalid password
        User u4 = platform.login(username1, password2);
        assertNull(u4);
        assertEquals((int)platform.getNumUsers(), 1);
        
    }
    
    // User specializations    
    @Test
    public void userSpecs() {        
        Platform platform = new Platform();
        User u1=platform.registerUser(username1, password1, fullName1);
        
        // User is not NULL
        assertNotNull(u1);

        // Get a participant object from user object
        Participant p1 = u1.asParticipant();
        assertNotNull(p1);
        assertEquals(u1.getFullName(), p1.getFullName());   
        assertTrue(p1 instanceof Participant);
        
        // Get a organizer object from user object
        Organizer o1 = u1.asOrganizer();
        assertNotNull(o1);
        assertEquals(u1.getFullName(), o1.getFullName());
        assertTrue(o1 instanceof Organizer);
    }
}
