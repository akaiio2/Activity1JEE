package presentation;


import dao.DaoImpl;
import metier.MetierImpl;


public class Presentation {
    public static void main(String[] args) {
// L injection des dependances
//Cad on va creer un objet de la classe MetierImpl,DaoImpl et on va faire l association
//2 manieres -> l instanciation statique (des classes des news,mais non fermé a la modification
// cad quand on a une nouvelle version de DaoImpl , on doit modifier le code )
//
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        System.out.println(metier.calcul());


 //on veut faire l injection de depandance avec framework spring








    }
}
