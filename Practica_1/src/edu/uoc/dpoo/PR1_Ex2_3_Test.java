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
public class PR1_Ex2_3_Test {
    
    private final String username1 = "username1";
    private final String password1 = "password1";
    private final String fullName1 = "Test User 1";

    public PR1_Ex2_3_Test() {
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
        
    
    // Copy constructor
    @Test
   public void userCopyConstructor() {        
        Platform platform = new Platform();
        User u1=platform.registerUser(username1, password1, fullName1);
        
        // User is not NULL
        assertNotNull(u1);

        // Get a participant object from user object
        User u2 = new User(u1);        
        assertNotNull(u2);
        assertEquals(u1, u2);        
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
