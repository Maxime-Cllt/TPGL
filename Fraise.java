public class Fraise {

    public Fraise(double prix, String origine) {
        if (prix < 0) this.prix = -prix;
        else this.prix = prix;

        if (origine.isEmpty()) this.origine = null;
        else this.origine = origine;
    }

    private double prix;
    private String origine;

    public Fraise() {
        this.prix = 0;
        this.origine = null;
    }

    public static void main(String[] args) {
        Fraise f1 = new Fraise();
        Fraise f2 = new Fraise(0.80, "France");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f1.equals(f2));
        System.out.println(f1.isSeedless());
        System.out.println(f2.isSeedless());
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
        return "Fraise de " + origine + " à " + prix + " euros";
    }

    public boolean isSeedless() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && getClass() == o.getClass()) {
            Fraise or = (Fraise) o;
            return (prix == or.prix && origine.equals(or.origine));
        } else {
            return false;
        }
    }

}
