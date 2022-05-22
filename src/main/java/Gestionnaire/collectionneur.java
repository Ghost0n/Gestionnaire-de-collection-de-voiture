package Gestionnaire;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException; 

public class collectionneur extends ArrayList{
    
    public ArrayList <vehicule> collection = new ArrayList();
    private ArrayList <vehicule> buffer = new ArrayList();
    String User;
    String Password;
            
    public collectionneur(String User, String Password){
        this.User = User;
        this.Password = Password;
    }
    
    
    public void AddVehicule(String marque, String modele, String type, String couleur, int prix){      //This function takes attributes, create an object based on user input and add it in the arrayList 
        
        switch(type){
            case "voiture" -> { 
                voiture NewVoiture = new voiture(marque,modele,couleur,prix);
                collection.add(NewVoiture);
            }
            case "camion" -> {
                camion NewCamion = new camion(marque,modele,couleur,prix);
                collection.add(NewCamion);
            }
            case "moto" -> {
                moto NewMoto = new moto(marque,modele,couleur,prix);
                collection.add(NewMoto);
            }
        }
        
          
       
    }

    public ArrayList SelectVehicules(String color){         //Select vehicules based on color 
        buffer.clear();
        collection.forEach((temp) -> {
           String VehiculeColor = temp.getCouleur();
           if (color.equals(VehiculeColor)){
               buffer.add(temp);
           }    
        });
        
        return buffer;
    }
    
    public boolean SearchVehicule(String marque, String modele){    //Return true if the described vehicule exists
        int i = 0;
        while (i < collection.size()){ 
            vehicule temp = collection.get(i);
            if (temp.getMarque().equals(marque) && temp.getModele().equals(modele)){
                return true;
                
            }
            i++;
        }
        return false;
    }
    
    public int VehiculeIndex(String marque, String modele){    //This function works in the same way the search function works but it returns the object index instead
        int i = 0;
        while (i < collection.size()){
            vehicule temp = collection.get(i);
            if (temp.getMarque().equals(marque) && temp.getModele().equals(modele)){
                break;
            }
            i++;
        }
        return i;
    }
    
    public void SellVehicule(String marque, String modele){
        int index = VehiculeIndex(marque, modele);
        collection.remove(index);
    }
    
    
    
    
    public void InitArray(){    //This function restores the previous values of the arrayList from a text file
        try {
        File saved = new File("Collection.txt");  
            try (Scanner scan = new Scanner(saved)) {
                while (scan.hasNextLine()) {
                    
                    String data = scan.nextLine();
                    String[] vehicule = data.split("-");
                    
                    switch(vehicule[2]){
                        case "voiture" -> { 
                            voiture NewVoiture = new voiture(vehicule[0],vehicule[1],vehicule[3],Integer.parseInt(vehicule[4]));
                            collection.add(NewVoiture);
                        }
                        case "camion" -> {
                            camion NewCamion = new camion(vehicule[0],vehicule[1],vehicule[3],Integer.parseInt(vehicule[4]));
                            collection.add(NewCamion);
                        }
                        case "moto" -> {
                            moto NewMoto = new moto(vehicule[0],vehicule[1],vehicule[3],Integer.parseInt(vehicule[4]));
                            collection.add(NewMoto);
                        }
                    }
                }   }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
    
    public void SaveArray(){      //This function backup the values of an arrayList in a text file(formatted strings)
        
        try {
            FileWriter writer = new FileWriter("Collection.txt");     //delete the content of the file without deleting the file itself
            writer.write("");
            writer.close();
        } catch (IOException ex) {
            System.out.println("An error occurred.");
        }
    
        try{                                                                  //saving the arrayList data in the file (append mode)
            FileWriter save = new FileWriter("Collection.txt", true);
            BufferedWriter bw = new BufferedWriter(save);
            collection.forEach((temp) -> {
                String str = String.format("%s-%s-%s-%s-%d", temp.getMarque(),temp.getModele(),temp.getType(),temp.getCouleur(),temp.getPrix());
                try {
                    bw.write(str);
                    bw.newLine();
                } catch (IOException ex) {
                    System.out.println("An error occurred.");
                }
                
            });
        bw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
       
    }
}
