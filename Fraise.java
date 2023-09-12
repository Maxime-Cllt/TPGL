public class Fraise {

    private double prix;
    private String origine;

    public Fraise() {
        this.prix = 0;
        this.origine = null;
    }

    public Fraise(double prix, String origine) {
        if (prix < 0) this.prix = -prix;
        else this.prix = prix;

        if (origine.equals("")) this.origine = null;
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
        return "Fraise de " + origine + " a " + prix + " euros";
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
