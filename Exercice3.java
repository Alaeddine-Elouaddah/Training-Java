

/*
 *  Réaliser une classe Vecteur3d permettant de manipuler des vecteurs à trois composantes (de type double) et
 disposant :
 — d’unconstructeur à trois arguments,
 — d’uneméthode d’affichage des coordonnées du vecteur, sous la forme :
 < composante_1, composante_2, composante_3 >
 — d’uneméthode fournissant la norme d’un vecteur,
 — d’uneméthode (statique) fournissant la somme de deux vecteurs,
 — d’uneméthode (non statique) fournissant le produit scalaire de deux vecteurs.
 Écrire un petit programme (main) utilisant cette classe*/
 
 public  class Vecteur3d{
    private double composante_1 ; 
    private double composante_2;
    private double composante_3 ; 
    Vecteur3d(double composante_1 , double composante_2 , double composante_3 ){
        this.composante_1 = composante_1 ;
         this.composante_2 = composante_2 ; 
         this.composante_3 = composante_3;
    }
    public double getC1(){
        return this.composante_1 ; 
    }
    public double  getC2(){
        return this.composante_2 ; 
    }
    public double  getC3(){
        return this.composante_3 ; 
    }

    public void afficher(){
        System.out.println("<"+getC1()+ "," +getC2()+","+getC3()+">");
    }
    public double NormeVecteur(){
        return Math.sqrt(Math.pow(getC1(),2)+Math.pow(getC2(),2)+Math.pow(getC3(),2));
    }
    public static Vecteur3d SommeDeVecteur(Vecteur3d v1 , Vecteur3d v2){
      double NouvelleValeure1 = v1.composante_1 + v2.composante_1  ;
      double NouvelleValeure2 = v1.composante_2 + v2.composante_2 ; 
      double NouvelleValeure3  = v1.composante_3 + v2.composante_3  ;
      return new Vecteur3d(NouvelleValeure1, NouvelleValeure2, NouvelleValeure3);        
    }
    public double ProduitScalire(Vecteur3d autre){
       return  (this.composante_1 * autre.composante_1)+ (this.composante_2*autre.composante_2)+(this.composante_3*autre.composante_3);
    }
    public static void main(String [] args){
       Vecteur3d V1 = new Vecteur3d(12, 18,15);
       Vecteur3d V2 = new Vecteur3d(20, 18, 17);
       System.out.println("La norme du vecteur V1 est : " +  V1.NormeVecteur() );
       System.out.println("La norme du vecteur V2 est : " +  V2.NormeVecteur() );
        System.out.println("La Somme des deux  vecteurs  V1 + V2  ="+ SommeDeVecteur(V1,V2));
        System.out.println("Le produit scalaire de V1 et V2  est "+ V1.ProduitScalire(V2));
    }
 } 
