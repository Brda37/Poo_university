package PoliformismoEjercicios.Aninmals;

public class worm extends animals {
    protected String taxonomy;
    protected String clasification;

    public worm(String raza, String color, float size, String habitat, String taxonomy, String clasification) {
        super(raza, color, size, habitat);
        this.taxonomy = taxonomy;
        this.clasification = clasification;
    }

    public String getTaxonomy() {
        return taxonomy;
    }

    public String getClasification() {
        return clasification;
    }

    @Override
    public String showDates(){
        return "Raza: " + raza + "\nColor: " + color + "\nTamaño: " +
                size + "\nHabitat: " + habitat  + "\nTaxonomia: " + 
                taxonomy + "\nClasificación: " + clasification; 
    }
}
