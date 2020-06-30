import models.Encrypt;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {

    @Test
    public void runEncrypt_ifInputIsString() {
        Encrypt testEncrypt = new Encrypt("xyz",3);
        assertEquals("xyz", testEncrypt.getmInputString());
    }

    @Test
    public void runDecrypt_ifKeyIsInt() {
        Encrypt testEncrypt = new Encrypt("xyz",3);
        assertEquals(3, testEncrypt.getmShift());
    }

    @Test
    public void encrypt() {
    }
}