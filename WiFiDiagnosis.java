/*Class: CMSC203 CRN31569
 Program: Assignment # 1 – design document
 Instructor: Professor Ahmed Tarek
 Summary of Description: This program could possibly solve internet connectivity issues using a set of instructions and advising to contact the internet service provider in case the given instructions fail to solve the problem.
 Due Date: 01/31/2023 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Student’s Name: Abdullah Shirzoi
 * 
 */


import java.util.Scanner;

public class WiFiDiagnosis {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // letting the user know this program can solve wifi issues.  
        System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
        
        // 1: ask the user to reboot their computer to solve wifi connectivity isuues  
        System.out.println("\nFirst step: reboot your computer");
        System.out.print("Are you able to connect with the internet? (yes or no) ");
        String answer = scanner.nextLine().toLowerCase();
        
        // if the answer is "yes" quit the program 
        if (answer.equals("yes")) {
            System.out.println("Rebooting your computer seemed to work");
            return;
        }
        
        // Step 2: this function asks the user to reboot the computer to solve the internet issue 
        System.out.println("\nSecond step: reboot your router");
        System.out.print("Now are you able to connect with the internet? (yes or no) ");
        answer = scanner.nextLine().toLowerCase();
        
        // this function exits the program if rebooting solves the issue
        if (answer.equals("yes")) {
            System.out.println("Rebooting your router seemed to work");
            return;
        }
        
        // Step 3: this function asks the user to make sure cables are connected properly 
        System.out.println("\nThird step: make sure the cables to your router are plugged in firmly and your router is getting power");
        System.out.print("Now are you able to connect with the internet? (yes or no) ");
        answer = scanner.nextLine().toLowerCase();
        
        // this function exits the program if the answer is yes
        if (answer.equals("yes")) {
            System.out.println("Checking the router's cables seemed to work");
            return;
        }
        
        // Step 4: asks the user to get closer to the router
        System.out.println("\nFourth step: move your computer closer to your router");
        System.out.print("Now are you able to connect with the internet? (yes or no) ");
        answer = scanner.nextLine().toLowerCase();
        
     // this function exits the program if the answer is yes
        if (answer.equals("yes")) {
            System.out.println("Moving your computer closer to your router seemed to work");
            return;
        }
        
        // Step 5: 
        System.out.println("\nFifth step: contact your ISP");
        System.out.println("Make sure your ISP is hooked up to your router.");
        
        scanner.close();
    }

}
