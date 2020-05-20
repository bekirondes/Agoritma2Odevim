
import java.util.Scanner;


public class Main {
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String islemler = "İşlemler ...\n"
                          +"Kare Alanı için 1'e bas..\n"
                          +"Üçgen Alanı için 2'e bas...\n"
                          +"Daire Alanı için 3'e bas..\n"
                          +"Çıkmak için 'q' a bas..";
        while(true){
            System.out.println(islemler);
            System.out.print("Hangi Şeklin Alanı Hesaplansın : ");
            String sekil_türü = scanner.nextLine();
            Sekil sekil = null;
            
            
            if (sekil_türü.equals("q")){
                System.out.println("Program Kapatılıyor..");
                break;
                
            }
            else if (sekil_türü.equals("1")){
                
                System.out.print("Karenin Kenarını giriniz : ");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Kare ("Kare: ",kenar);
                sekil.alanHesapla();
                
                
            }
            else if (sekil_türü.equals("2")){
                System.out.print("Kenar1: ");
                int kenar1 = scanner.nextInt();
                System.out.print("kenar2: ");
                int kenar2 = scanner.nextInt();
                System.out.print("kenar3: ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Ucgen("Ucgen 1 : ", kenar1,kenar2,kenar3);
                sekil.alanHesapla();
                
                 
            }
            else if (sekil_türü.equals("3")){
                System.out.print("Dairenin Yaricapi: ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                sekil = new Daire("Daire 1 ", yaricap);
                
                
                sekil.alanHesapla();
                
     
            }
            else {
                System.out.print("Geçersiz işlem..");
            }
            
            
        }
        
        
    }
    
}
