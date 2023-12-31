

public class Orange {


    public static void main(String[] args) {

        Orange o1 = new Orange();
        Orange o2 = new Orange(0.80, "France");
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1.equals(o2));
        System.out.println(o1.isSeedless());
        System.out.println(o2.isSeedless());

    }

    private double prix;
    private String origine;

    public Orange() {
        this.prix = 0.5;  //prix en euros
        this.origine = "Espagne";
    }

    public Orange(double prix, String origine) {
        if (prix < 0) this.prix = -prix;  //une solution possible pour interdire les prix negatifs
        else this.prix = prix;

        if (origine.equals("")) this.origine = "Espagne";  //Espagne par défaut
        else this.origine = origine;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    @Override
    public String toString() {
        return "Orange de " + origine + " à " + prix + " euros";
    }

    @Override
    public boolean equals(Object o) {  //predicat pour tester si 2 oranges sont equivalentes
        if (o != null && getClass() == o.getClass()) {
            Orange or = (Orange) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


}
