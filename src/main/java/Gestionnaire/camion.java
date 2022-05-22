package Gestionnaire;

public class camion extends vehicule{
    private String Type;
    
    public camion(String marque, String modele, String couleur, int prix){
        super(marque,modele,couleur,prix);
        this.Type="camion";
    }
    
     public String getType() {
        return Type;
    }
}
