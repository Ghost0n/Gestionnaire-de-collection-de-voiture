package Gestionnaire;

public class moto extends vehicule{
     private String Type;
    
    public moto(String marque, String modele, String couleur, int prix){
        super(marque,modele,couleur,prix);
        this.Type="moto";
    }
    
     public String getType() {
        return Type;
    }
    
}
