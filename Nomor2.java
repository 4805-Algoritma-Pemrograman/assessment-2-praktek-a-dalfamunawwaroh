import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args){
        ArrayList<Integer> angka = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String inputMenu;
        String pilihan;
        String menu;
        int hargaMenu;
        /* Pekerjaan anda mulai dari sini */

        
            while (true) {
                System.out.println("Masukan nama menu [Burger/Steak/Spagetti/Kentang]");
                inputMenu = input.nextLine();
                menu.add(inputMenu);
                input.nextLine();
                System.out.println("Lanjut? [Y/N]");
                pilihan = input.nextLine();
                if (pilihan.equalsIgnoreCase("N")) {
                    break;
                }
                
                String daftarMenu = "";
                switch (daftarMenu) {
                case 1:
                    daftarMenu = "Burger";
                    break;
                case 2:
                    daftarMenu = "Steak";
                    break;
                case 3:
                    daftarMenu = "Spagetti";
                    break;
                case 4:
                    daftarMenu = "Kentang";
                    break;
                default:
                    return;
                }
                switch (hargaMenu) {
                    case 1:
                        return 35000;
                    case 2:
                        return 45000;
                    case 3:
                        return 20000;
                    case 4:
                        return 15000;
                    default:
                        return 0; 
                }


        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
    }
}


    
