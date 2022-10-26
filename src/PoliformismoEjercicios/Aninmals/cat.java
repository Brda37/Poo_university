package PoliformismoEjercicios.Aninmals;

public class cat extends animals {
    protected String taxonomy;
    protected int paws;
    public cat(String raza, String color, float size, String habitat, String taxonomy, int paws) {
        super(raza, color, size, habitat);
        this.taxonomy = taxonomy;
        this.paws = paws;
    }
    public String getTaxonomy() {
        return taxonomy;
    }
    public int getPaws() {
        return paws;
    }
    
    @Override
    public String showDates(){
        return "Raza: " + raza + "\nColor: " + color + "\nTamaño: " +
                size + "\nHabitat: " + habitat  + "\nTaxonomia: " + 
                taxonomy + "\nPatas: " + paws; 
    }
}
