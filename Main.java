import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wyraz; 
        System.out.println("Tekst do zbadania: "); 
        wyraz = scanner.nextLine(); 

        for (int i = 0; i < wyraz.length() / 2; i++) { 
                                                      
            if (wyraz.charAt(i) != wyraz.charAt(wyraz.length() - 1 - i)) { 
                                                                           
                                                                           
                                                                           
                                                                           
                                                                           
                System.out.println("Wyraz nie jest palindromem."); 
                scanner.close(); 
                return; 
            }
        }

        
        System.out.println("Wyraz jest palindromem.");

        scanner.close(); 
    }
}