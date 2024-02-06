
package progtetelek;

import java.util.Scanner;

public class Progtetelek {
    
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //sc.close();
        int n = -1;
        String s = sc.nextLine();
        System.out.println("beírt érték: " + s+3);
        sc.next();
        while (n < 0){
            System.err.println("N= ");
            n = sc.nextInt();
        }
        int ossz = 0;
        for (int i = 0; i<n+1;i++){
            ossz +=i;
        }
        System.out.println(ossz);
        
        int db = 0;
        for(int i = 10; i<=100;i++){
            if (i % 2 == 0){
                db++;
            }
        
        }
        System.out.println(db);
        
        
        
        final int VEGE = 0;
        db = 0;
        int min = Integer.MAX_VALUE;//2147483647;
        int szam;
        while((szam = sc.nextInt()) != VEGE){
        
            if(szam < min){
                min = szam;
            }
            db += 1;
        }
        System.out.println(db);
        
        
        
        
        n = sc.nextInt();
        boolean prim;
        int i;
        if (n < 2){
            prim = false;
        
        }else{
            i = 2;
            while (i <= Math.sqrt(n) && n % i != 0){
                i += 1;
            }
            prim = (i > Math.sqrt(n));
        }
        if (prim == true)
        System.out.println("Prím");
        
        else
            System.out.println("Nem prím");
                     
        
                
       
       
                
                
                
    }//main vége
   
}// class vége
    

