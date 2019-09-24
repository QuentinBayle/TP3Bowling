/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;

/**
 *
 * @author pedago
 */
public class Tour {
    
    public  int NumeroTour;
    public int PremierLancee;
    public int DeuxiemeLancee;
    public int Score;
    
    public Tour(int t){
        if(t<1 || t>9){
            System.out.print("Impossible");
        }
        
    }
    
}
