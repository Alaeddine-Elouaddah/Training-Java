public class Point {
    private String nom ;
    private double abcisse;
    Point(String nom , double abcisse){
    this.nom=nom;
    this.abcisse=abcisse;
    }
    public String getNom(){
       return this.nom;
    }
    public double getAbcisse(){
        return this.abcisse;
    }
    public void afficher(){
        System.out.println("Nom = " + getNom()  +   "Abcisse  = " + getAbcisse()  );
    }
    public void translate(double translate){
         this.abcisse+=translate;
    }
    public static void main(String[] args) {
         Point  P =  new Point("A",  15);
         P.afficher();
         P.translate(10);
         P.afficher();
    }
}
