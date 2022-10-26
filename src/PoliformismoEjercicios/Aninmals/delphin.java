package PoliformismoEjercicios.Aninmals;

public class delphin extends animals {
    protected String taxonomy;
    protected String  hocico;
    public delphin(String raza, String color, float size, String habitat, String taxonomy, String hocico) {
        super(raza, color, size, habitat);
        this.taxonomy = taxonomy;
        this.hocico = hocico;
    }
    public String getTaxonomy() {
        return taxonomy;
    }
    public String getHocico() {
        return hocico;
    }
    
    @Override
    public String showDates(){
        return "Raza: " + raza + "\nColor: " + color + "\nTamaño: " +
                size + "\nHabitat: " + habitat  + "\nTaxonomia: " + 
                taxonomy + "\nTipo de hocico: " + hocico; 
    }
}
