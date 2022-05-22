package Gestionnaire;

public class voiture extends vehicule{
     private String Type;
    
    public voiture(String marque, String modele, String couleur, int prix){
        super(marque,modele,couleur,prix);
        this.Type="voiture";
    }
    
     public String getType() {
        return Type;
    }
    
}
