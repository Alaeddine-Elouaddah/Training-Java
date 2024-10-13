/* 
 *  Onsouhaite disposer d’une classe permettant d’effectuer des conversions (dans les deux sens) entre nombre
 sexagésimaux (durée exprimée en heures, minutes, secondes) et des nombres décimaux (durée exprimée en
 heures décimales). Pour ce faire, on réalisera une classe permettant de représenter une durée. Elle comportera :
 — un constructeur recevant trois arguments de type int représentant une valeurs sexagésimale (heures,
 minutes, secondes) qu’on supposera normalisée (secondes et minutes entre 0 et 59). Aucune limitation
 ne portera sur les heures;
 — unconstructeur recevant un argument de type double représentant une durée en heures;
 — uneméthode getDec fournissant la valeur en heures décimales associée à l’objet,
 — des méthodes getH, getM et getS fournissant les trois composantes du nombre sexagésimal associé à
 l’objet.
 9
On proposera deux solutions :
 1. Avec un champ (privé) représentant la valeur décimale,
 2. Avec des champs (privés) représentant la valeur sexagésimale.
*/

public class Conversion{
   private int heures;
   private int minutes;
   private int secondes;
   Conversion(int heures,int minutes,int secondes){
    this.heures=heures;
    setMinutes(minutes);
    setSecondes(secondes);
   }
    Conversion(double heuresDecimales) {
    this.heures = (int) heuresDecimales; // La partie entière représente les heures
    double reste = heuresDecimales - this.heures;
    this.minutes = (int) (reste * 60); // La partie décimale * 60 donne les minutes
    this.secondes = (int) ((reste * 60 - this.minutes) * 60); // Conversion des secondes
 }
   public void  setMinutes(int minutes){
     if(minutes<60 && minutes>=0){
       this.minutes = minutes ; 
     }
     else{
        System.out.println("Entrer une valeur correct pour les minutes entre 59 et 0 ");
     }
   }
   public void setSecondes(int secondes){
     if(secondes <60  && secondes >= 0 ){
        this.secondes = secondes;
     }
     else{
        System.out.println("Entrer une valeur correct pour les Secondes entre 59 et 0 ");
     }
   }
   public int getH(){
    return this.heures;
   }
   public int getM(){
    return this.minutes;
   }
   public int getS(){
    return this.secondes;
   }
   public double  getDec(){
       return heures + (getM()/60.0) + (getS()/3600.0);
   }
   
   public void afficherEnHMS(){
    System.out.println("Heures:"+getH()+" Minutes:" +  getM() + " Secondes: " + getS());
   }
   public void afficherEnH(){
    System.out.println("Heures:" + getDec());
   }
 

    public static void main(String[] args) {
        Conversion dureeSex = new Conversion(2, 30, 0); 
      System.out.println("Heures décimales : " + dureeSex.getDec()); 

      Conversion dureeDec = new Conversion(2.5); 
      System.out.println("Heures sexagésimales : " + dureeDec.getH() + "h " + dureeDec.getM() + "m " + dureeDec.getS() + "s");
        
        
    }
}
