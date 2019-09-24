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
    public int BouleLancee;
    public Tour TourSuivant;
    
    public Tour(int t, Tour suivant){
        if(t<1 || t>9){
            System.out.print("Impossible");
        }
        NumeroTour = t;
        suivant = TourSuivant;
    }
    public Tour AllerAuTourSuivant(){
        return TourSuivant;
    }
    
    public int NumeroDuTour() {
        return NumeroTour;
    }
    
    public int NombreBouleLancee() {
        return BouleLancee;
    }

    public boolean Strike() {
	return PremierLancee == 10;
    }

    public boolean Spare() {
	return (PremierLancee + DeuxiemeLancee) == 10;
    }
    
    public int PointStrike(){
        if (Strike()) {
		return PremierLancee;
	} else {
		return PremierLancee + DeuxiemeLancee;
	}
    }
    
    public int PointSpare() {
	return PremierLancee;
    }
    
    public int Score() {
		int ScoreJoueur = 0;
		if (Strike()) {
			ScoreJoueur = 10 + TourSuivant.PointStrike();
		}
                else if (Spare()) {
			ScoreJoueur = 10 + TourSuivant.PointSpare();
		} else {
			ScoreJoueur = PremierLancee + DeuxiemeLancee;
		}
	return ScoreJoueur + TourSuivant.Score();
	}
    
    
    public void Lancer(int NumeroLancee) {
                BouleLancee=0;
                if (BouleLancee > 1) {
			throw new UnsupportedOperationException();
		}
                
		BouleLancee++;
		switch (BouleLancee) {
                    case 1:
			PremierLancee = NumeroLancee;
			break;
                    case 2:
			DeuxiemeLancee = NumeroLancee;
                        break;
		}
	}
}
