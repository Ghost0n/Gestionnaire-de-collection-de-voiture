package Gestionnaire;

public class vehicule {
    
    private String marque;
    private String modele;
    private String couleur;
    private String Type;

    private int prix;
    
    public vehicule(String marque, String modele, String couleur, int prix){            
        this.marque=marque;
        this.modele=modele;
        this.couleur=couleur;
        this.prix=prix;
        this.Type=Type;                         //Type attribute is going to be assigned with constant strings depending on its class 
        
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getPrix() {
        return prix;
    }
    
    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
    
}
