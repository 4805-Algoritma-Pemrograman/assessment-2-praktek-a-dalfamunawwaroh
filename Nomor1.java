import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        /* Pekerjaan anda mulai dari sini */

        System.out.println("Masukkan angka n: ");
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
        int var2 = N;
        
                if (var2 % 2 != 0) {
                    System.out.println("Angka ganjil dari nol hingga " + var2 + ":");
                    System.out.println("" + var2 + " ");
                }
        }
           
        
        
        /* Pekerjaan anda berakhir sini */
        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    
}
