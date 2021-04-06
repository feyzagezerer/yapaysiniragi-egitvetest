/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0odev2;

import java.net.URISyntaxException;

import java.util.Scanner;

/*
 * @author feyza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        
        System.out.println("1. Ağı Eğit");
        
        System.out.println("2. Ağı Test Et");
       
        System.out.println("3. Tek Veri İle Test Et");
        
        System.out.println("4. Çıkış");
       
        int secim;
        secim=in.nextInt();
        switch(secim){
                case 1:                        
                  break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Hatalı giriş. 1., 2., 3. veya 4. seçenekten birini seçiniz.");
                  break;
                
        }
                
    
        try{
            
            BasariNotu b=new BasariNotu(derse_devam,odev_sayisi,sinav_notu);
               
            JFuzzyChart.get().chart(b.getModel());
            System.out.println(b);

        }
        catch(URISyntaxException ex)
        {
            System.out.print("HATA");
        }
    }
    }
    
}
