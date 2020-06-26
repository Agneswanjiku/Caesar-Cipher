import java.io.Console;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Input string:");
        String wordResponse = myConsole.readLine();
        System.out.println("Key:");
        String keyResponse = myConsole.readLine();
        int intKeyResponse = Integer.parseInt(keyResponse);
        CaesarCipher caesarCipher = new CaesarCipher(wordResponse, intKeyResponse);
        String encryptionResult = caesarCipher.indexOfWord();
        System.out.println("Encrypted String:" + encryptionResult + ".");
        String finalOutput = caesarCipher.decryptedWord();
        System.out.println("Decrypted string:" + finalOutput + ".");
    }
}