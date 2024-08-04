package interfaceEncrypt;

// Import necessary libraries for cryptographic operations

// Declare the Main class
public class Main {
    public static void main(String[] args) {
        // Create an instance of the AES class for encryption and decryption
        Encryptable aes = new AES();

        // Encrypt data using AES encryption and store the result
        String encryptedDataAES = aes.encrypt("Mavel Interface.");
        System.out.println("AES Encrypted: " + encryptedDataAES);

        // Decrypt the AES-encrypted data and store the result
        String decryptedDataAES = aes.decrypt(encryptedDataAES);
        System.out.println("AES Decrypted: " + decryptedDataAES);

        // Create an instance of the RSA class for encryption and decryption
        Encryptable rsa = new RSA();

        // Encrypt data using RSA encryption and store the result
        String encryptedDataRSA = rsa.encrypt("Mavel Interface.");
        System.out.println("RSA Encrypted: " + encryptedDataRSA);

        // Decrypt the RSA-encrypted data and store the result
        String decryptedDataRSA = rsa.decrypt(encryptedDataRSA);
        System.out.println("RSA Decrypted: " + decryptedDataRSA);
    }
}
