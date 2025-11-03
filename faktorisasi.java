import java.util.Scanner;

public class faktorisasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Masukkan bilangan");
        int x = input.nextInt();

        if (x < 0) {
            System.out.println("Bilangan harus positif");
            
        }else{
            long faktorial = 1;
            for (int i= 1; i <= x ; i++) {
                faktorial *= i;
        }
        System.out.println( + x + " Faktorial adalah: " + faktorial);

    
    }
        
    }
    }
    

    
    

