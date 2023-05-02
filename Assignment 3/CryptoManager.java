package application;

/**
 Class: CMSC203 CRN 31569
 Program: Assignment 3 Design
 Instructor: Professor Ahmed Tarek
 Summary of Description: This program can encrypt and decrypt a phrase using two approaches which are Caesar Cipher and Giovan Battista Bellaso. In Caesar Cipher, characters are replaced by a substitute character and Giovan Battista Bellaso uses a key word that specifies corresponds character in the program.
 Due Date: 02/28/2023
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Student: Abdullah Shirzoi
*/
//This class will make the encryptions and decryptions necessary to change the plainText into an encrypyed string and then change it back
public class CryptoManager {
	
    private static final char LOWER_BOUND = 32;
    private static final char UPPER_BOUND = 95;
    private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;
	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */

    public static boolean stringInBounds(String plainText) {
        for (int i = 0; i < plainText.length(); i++) 
        {
            char c = plainText.charAt(i);
            if (c < LOWER_BOUND  || UPPER_BOUND < c) {
                return false;
            }
        }
        return true;
    }

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
    public static String encryptCaesar(String plainText, int key) {
        String encryptedText = "";
        for (int i =0; i< plainText.length(); i++) {
            char ch = plainText.charAt(i);
            int encryptedValue = (ch - LOWER_BOUND + key) % RANGE + LOWER_BOUND;
            encryptedText += (char) encryptedValue;
        }
        return encryptedText;
    }

	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
    public static String encryptBellaso(String plainText, String bellasoStr) {
      String encryptedText=""; 
      int belassioLength= bellasoStr.length();
      for (int i=0;i<plainText.length();i++){
    	  char c=plainText.charAt(i);
    	  int encryptedNum=((int)c+(int)bellasoStr.charAt(i%belassioLength));
    	  while(encryptedNum>UPPER_BOUND) {
    		  encryptedNum=encryptedNum-RANGE;
    	  }
    	  encryptedText+=(char)encryptedNum;
      }
      return encryptedText;
    }
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
    public static String decryptCaesar(String encryptedText, int key) {
        String decryptedText = "";
        for (int i = 0; i < encryptedText.length(); i++) {
            char c = encryptedText.charAt(i);
            int decryptedNum = ((int)c-key);
            while(decryptedNum<LOWER_BOUND) {
            	decryptedNum+=RANGE;
            
            }
        	decryptedText+=(char)decryptedNum;

        }
        return decryptedText;
    }
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
    public static String decryptBellaso(String encryptedText, String bellasoStr) {
    	   String decryptedText = "";
           int belassioLength= bellasoStr.length();
           for (int i = 0; i < encryptedText.length(); i++) {
               char c = encryptedText.charAt(i);
               int decryptedNum = ((int)c-(int)bellasoStr.charAt(i%belassioLength));
               while(decryptedNum<LOWER_BOUND) {
               	decryptedNum+=RANGE;
               
               }
           	decryptedText+=(char)decryptedNum;

           }
           return decryptedText;
}
}