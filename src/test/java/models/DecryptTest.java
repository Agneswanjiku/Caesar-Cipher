package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class DecryptTest {

    @Before
    public void setUp() throws Exception {

    } @Test
    public void runDecrypt_instantiates(){
        Decrypt testDecrypt = new Decrypt("!khta", 1);
        assertEquals(true, testDecrypt instanceof Decrypt);
    }

    @After
    public void tearDown() throws Exception {
    }
}