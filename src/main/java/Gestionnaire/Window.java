package Gestionnaire;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Window extends javax.swing.JFrame {

    collectionneur admin = new collectionneur("admin","*****");
   
      public void ResetComponents(){   //This piece of code re-initialize all key components(textfields, labels) to their default status
        marque.setText("");
        modele.setText("");
        couleur.setText("");
        prix.setText("");
        type.setSelectedIndex(0);
        SuccesLabel.setVisible(false);
        Sold.setVisible(false);
        NotSold.setVisible(false);
        MarqueTextField3.setText("");
        ModeleTextField3.setText(""); 
        MarqueTextField.setText("");
        ModelTextField.setText(""); 
        Exist.setVisible(false);
        DoesNotExist.setVisible(false);
        ColorChoice.setVisible(false);
        couleurLabel2.setVisible(false);
        Consult.setVisible(false);
        jTable1.setVisible(false);
        ConsultPanel.setVisible(false);
        ColorChoice.setText("");
        
    }
   
    public Window() {
        initComponents();
        admin.InitArray();           //Initialize the arraylist
        jp4.setVisible(false);  //the following code set the JFrame components to their default status
        jp3.setVisible(false);
        jp2.setVisible(false);
        ResetComponents();
    }
    
    public void PrintInJtable(ArrayList <vehicule> Data){                  //This function takes an arraylist and add its content in the jTable1
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[5];
        
        for (int i=0; i < Data.size(); i++){
            rowData[0] = Data.get(i).getMarque();
            rowData[1] = Data.get(i).getModele();
            rowData[2] = Data.get(i).getType();
            rowData[3] = Data.get(i).getCouleur();
            rowData[4] = Data.get(i).getPrix();
            model.addRow(rowData);
        }
    }
    
    public void ClearJtable(){                                         //This code clears the JTable1 content
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }
    
    class MyWindowListener implements WindowListener {        //This class utilize the WindowsListener in order to personalize the event of closing the Jframe window 

   @Override
   public void windowClosing(WindowEvent arg0) {              //This function save the arrayList in a text file when the window is closed
        admin.SaveArray();
        System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent arg0) {}
    @Override
    public void windowClosed(WindowEvent arg0) {}
    @Override
    public void windowIconified(WindowEvent arg0) {}
    @Override
    public void windowDeiconified(WindowEvent arg0) {}
    @Override
    public void windowActivated(WindowEvent arg0) {}
    @Override
    public void windowDeactivated(WindowEvent arg0) {}

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AjouterPanel = new javax.swing.JPanel();
        AjouterLabel = new javax.swing.JLabel();
        RechercherPanel = new javax.swing.JPanel();
        RechercherLabel = new javax.swing.JLabel();
        ConsulterPanel = new javax.swing.JPanel();
        ConsulterLabel = new javax.swing.JLabel();
        VendrePanel = new javax.swing.JPanel();
        VendreLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jp1 = new javax.swing.JPanel();
        marque = new javax.swing.JTextField();
        modele = new javax.swing.JTextField();
        couleur = new javax.swing.JTextField();
        prix = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        ModeleLabel = new javax.swing.JLabel();
        MarqueLabel = new javax.swing.JLabel();
        TypeLabel = new javax.swing.JLabel();
        PrixLabel = new javax.swing.JLabel();
        CouleurLabel = new javax.swing.JLabel();
        TitreLabel = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        SuccesLabel = new javax.swing.JLabel();
        jp2 = new javax.swing.JPanel();
        MarqueTextField = new javax.swing.JTextField();
        ModelTextField = new javax.swing.JTextField();
        ModeleLabel2 = new javax.swing.JLabel();
        MarqueLabel2 = new javax.swing.JLabel();
        TitreLabel2 = new javax.swing.JLabel();
        SearchlButton = new javax.swing.JButton();
        Exist = new javax.swing.JLabel();
        DoesNotExist = new javax.swing.JLabel();
        jp3 = new javax.swing.JPanel();
        OptionConsult = new javax.swing.JPanel();
        ConsultAll = new javax.swing.JPanel();
        ConsultAllLabel = new javax.swing.JLabel();
        ColorConsult = new javax.swing.JPanel();
        ColorConsultLabel = new javax.swing.JLabel();
        couleurLabel2 = new javax.swing.JLabel();
        ColorChoice = new javax.swing.JTextField();
        Consult = new javax.swing.JButton();
        ConsultPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jp4 = new javax.swing.JPanel();
        MarqueTextField3 = new javax.swing.JTextField();
        ModeleTextField3 = new javax.swing.JTextField();
        ModeleLabel3 = new javax.swing.JLabel();
        MarqueLabel3 = new javax.swing.JLabel();
        TitreLabel3 = new javax.swing.JLabel();
        SellButton = new javax.swing.JButton();
        Sold = new javax.swing.JLabel();
        NotSold = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestionnaire de Collection Véhicules");
        setBackground(new java.awt.Color(51, 102, 255));
        setForeground(new java.awt.Color(51, 102, 255));
        setPreferredSize(new java.awt.Dimension(1195, 702));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        AjouterPanel.setBackground(new java.awt.Color(255, 255, 255));
        AjouterPanel.setPreferredSize(new java.awt.Dimension(218, 75));
        AjouterPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjouterPanelMouseClicked(evt);
            }
        });

        AjouterLabel.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        AjouterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AjouterLabel.setText("Ajouter");

        javax.swing.GroupLayout AjouterPanelLayout = new javax.swing.GroupLayout(AjouterPanel);
        AjouterPanel.setLayout(AjouterPanelLayout);
        AjouterPanelLayout.setHorizontalGroup(
            AjouterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AjouterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AjouterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        AjouterPanelLayout.setVerticalGroup(
            AjouterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AjouterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AjouterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        RechercherPanel.setBackground(new java.awt.Color(255, 255, 255));
        RechercherPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RechercherPanelMouseClicked(evt);
            }
        });

        RechercherLabel.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        RechercherLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RechercherLabel.setText("Rechercher");

        javax.swing.GroupLayout RechercherPanelLayout = new javax.swing.GroupLayout(RechercherPanel);
        RechercherPanel.setLayout(RechercherPanelLayout);
        RechercherPanelLayout.setHorizontalGroup(
            RechercherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RechercherPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RechercherLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );
        RechercherPanelLayout.setVerticalGroup(
            RechercherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RechercherPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RechercherLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        ConsulterPanel.setBackground(new java.awt.Color(255, 255, 255));
        ConsulterPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsulterPanelMouseClicked(evt);
            }
        });

        ConsulterLabel.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        ConsulterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConsulterLabel.setText("Consulter");

        javax.swing.GroupLayout ConsulterPanelLayout = new javax.swing.GroupLayout(ConsulterPanel);
        ConsulterPanel.setLayout(ConsulterPanelLayout);
        ConsulterPanelLayout.setHorizontalGroup(
            ConsulterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsulterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConsulterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ConsulterPanelLayout.setVerticalGroup(
            ConsulterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsulterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConsulterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        VendrePanel.setBackground(new java.awt.Color(255, 255, 255));
        VendrePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VendrePanelMouseClicked(evt);
            }
        });

        VendreLabel.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        VendreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VendreLabel.setText("Vendre");

        javax.swing.GroupLayout VendrePanelLayout = new javax.swing.GroupLayout(VendrePanel);
        VendrePanel.setLayout(VendrePanelLayout);
        VendrePanelLayout.setHorizontalGroup(
            VendrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VendrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VendreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        VendrePanelLayout.setVerticalGroup(
            VendrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VendrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VendreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VendrePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ConsulterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RechercherPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AjouterPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(AjouterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RechercherPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ConsulterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(VendrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(931, 702));

        jp1.setBackground(new java.awt.Color(255, 255, 255));
        jp1.setPreferredSize(new java.awt.Dimension(931, 702));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "voiture", "moto", "camion" }));
        type.setToolTipText("");

        ModeleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ModeleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModeleLabel.setText("Modele");

        MarqueLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MarqueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MarqueLabel.setText("Marque");

        TypeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TypeLabel.setText("Type");

        PrixLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PrixLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrixLabel.setText("Prix");

        CouleurLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CouleurLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CouleurLabel.setText("Couleur");

        TitreLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TitreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitreLabel.setText("Ajouter un véhicule à votre Collection");

        AddButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddButton.setText("Confirmer");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });

        SuccesLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SuccesLabel.setForeground(new java.awt.Color(0, 153, 0));
        SuccesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SuccesLabel.setText("Véhicule ajoutée avec succées !");

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ModeleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MarqueLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TypeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrixLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CouleurLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(type, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(prix, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                        .addComponent(couleur, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                        .addComponent(modele, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                        .addComponent(marque)))
                                .addGroup(jp1Layout.createSequentialGroup()
                                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(166, 166, 166)))
                            .addComponent(SuccesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(196, 196, 196))
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(TitreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarqueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modele, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModeleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(couleur, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CouleurLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrixLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SuccesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp2.setBackground(new java.awt.Color(255, 255, 255));
        jp2.setPreferredSize(new java.awt.Dimension(931, 702));

        MarqueTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ModelTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ModeleLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ModeleLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModeleLabel2.setText("Modele");

        MarqueLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MarqueLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MarqueLabel2.setText("Marque");

        TitreLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TitreLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitreLabel2.setText("Rechercher un Véhicule un votre collection");

        SearchlButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SearchlButton.setText("Rechercher");
        SearchlButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchlButtonMouseClicked(evt);
            }
        });

        Exist.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Exist.setForeground(new java.awt.Color(51, 204, 0));
        Exist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exist.setText("Le véhicule existe dans votre collection");

        DoesNotExist.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DoesNotExist.setForeground(new java.awt.Color(255, 0, 0));
        DoesNotExist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DoesNotExist.setText("Véhicule inexistant");

        javax.swing.GroupLayout jp2Layout = new javax.swing.GroupLayout(jp2);
        jp2.setLayout(jp2Layout);
        jp2Layout.setHorizontalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(SearchlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DoesNotExist, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exist, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jp2Layout.createSequentialGroup()
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TitreLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jp2Layout.createSequentialGroup()
                                .addComponent(MarqueLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(137, 137, 137)
                                .addComponent(ModeleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp2Layout.createSequentialGroup()
                                .addComponent(MarqueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137)
                                .addComponent(ModelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jp2Layout.setVerticalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(TitreLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModeleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarqueLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarqueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoesNotExist, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exist, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(SearchlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp3.setBackground(new java.awt.Color(255, 255, 255));
        jp3.setPreferredSize(new java.awt.Dimension(931, 702));

        OptionConsult.setBackground(new java.awt.Color(51, 102, 255));
        OptionConsult.setPreferredSize(new java.awt.Dimension(264, 702));
        OptionConsult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ConsultAll.setBackground(new java.awt.Color(255, 255, 255));
        ConsultAll.setPreferredSize(new java.awt.Dimension(218, 75));
        ConsultAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultAllMouseClicked(evt);
            }
        });

        ConsultAllLabel.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        ConsultAllLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConsultAllLabel.setText("Consulter toute la collection");

        javax.swing.GroupLayout ConsultAllLayout = new javax.swing.GroupLayout(ConsultAll);
        ConsultAll.setLayout(ConsultAllLayout);
        ConsultAllLayout.setHorizontalGroup(
            ConsultAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultAllLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConsultAllLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ConsultAllLayout.setVerticalGroup(
            ConsultAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultAllLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConsultAllLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        OptionConsult.add(ConsultAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 264, -1));

        ColorConsult.setBackground(new java.awt.Color(255, 255, 255));
        ColorConsult.setPreferredSize(new java.awt.Dimension(218, 75));
        ColorConsult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ColorConsultMouseClicked(evt);
            }
        });

        ColorConsultLabel.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        ColorConsultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ColorConsultLabel.setText("Consulter par couleur");

        javax.swing.GroupLayout ColorConsultLayout = new javax.swing.GroupLayout(ColorConsult);
        ColorConsult.setLayout(ColorConsultLayout);
        ColorConsultLayout.setHorizontalGroup(
            ColorConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ColorConsultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ColorConsultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ColorConsultLayout.setVerticalGroup(
            ColorConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ColorConsultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ColorConsultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        OptionConsult.add(ColorConsult, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 161, 264, -1));

        couleurLabel2.setBackground(new java.awt.Color(255, 255, 255));
        couleurLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        couleurLabel2.setForeground(new java.awt.Color(255, 255, 0));
        couleurLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        couleurLabel2.setText("Couleur");
        OptionConsult.add(couleurLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 27));
        OptionConsult.add(ColorChoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 272, 145, 27));

        Consult.setText("Consulter");
        Consult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultMouseClicked(evt);
            }
        });
        OptionConsult.add(Consult, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 110, 30));

        ConsultPanel.setBackground(new java.awt.Color(255, 255, 255));
        ConsultPanel.setPreferredSize(new java.awt.Dimension(661, 702));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Marque", "Modele", "Type", "Couleur", "Prix"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout ConsultPanelLayout = new javax.swing.GroupLayout(ConsultPanel);
        ConsultPanel.setLayout(ConsultPanelLayout);
        ConsultPanelLayout.setHorizontalGroup(
            ConsultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        ConsultPanelLayout.setVerticalGroup(
            ConsultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout jp3Layout = new javax.swing.GroupLayout(jp3);
        jp3.setLayout(jp3Layout);
        jp3Layout.setHorizontalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp3Layout.createSequentialGroup()
                .addComponent(OptionConsult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp3Layout.setVerticalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OptionConsult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ConsultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
        );

        jp4.setBackground(new java.awt.Color(255, 255, 255));
        jp4.setPreferredSize(new java.awt.Dimension(931, 702));

        MarqueTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ModeleTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ModeleLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ModeleLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModeleLabel3.setText("Modele");

        MarqueLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MarqueLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MarqueLabel3.setText("Marque");

        TitreLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TitreLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitreLabel3.setText("Vendre un Véhicule de votre collection");

        SellButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SellButton.setText("Vendre");
        SellButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellButtonMouseClicked(evt);
            }
        });

        Sold.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Sold.setForeground(new java.awt.Color(51, 204, 0));
        Sold.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sold.setText("Le véhicule est bien vendu et retiré de votre collection");

        NotSold.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NotSold.setForeground(new java.awt.Color(255, 0, 0));
        NotSold.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NotSold.setText("Véhicule inexistant");

        javax.swing.GroupLayout jp4Layout = new javax.swing.GroupLayout(jp4);
        jp4.setLayout(jp4Layout);
        jp4Layout.setHorizontalGroup(
            jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp4Layout.createSequentialGroup()
                .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp4Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(SellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp4Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NotSold, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sold, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp4Layout.createSequentialGroup()
                .addComponent(TitreLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp4Layout.createSequentialGroup()
                .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jp4Layout.createSequentialGroup()
                        .addComponent(ModeleLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ModeleTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp4Layout.createSequentialGroup()
                        .addComponent(MarqueLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MarqueTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(244, 244, 244))
        );
        jp4Layout.setVerticalGroup(
            jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp4Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(TitreLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarqueLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarqueTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModeleTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModeleLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NotSold, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sold, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(SellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TitreLabel3.getAccessibleContext().setAccessibleName("Rechercher un Véhicule dans votre collection");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jp4, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
                        .addComponent(jp2, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE))
                    .addContainerGap()))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp4, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jp2, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                    .addGap(22, 22, 22)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp3, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 759, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        String m = marque.getText();
        String mod = modele.getText();
        String c = couleur.getText();
        int p = Integer.parseInt(prix.getText());
        String t = String.valueOf(type.getSelectedItem());
        admin.AddVehicule(m,mod,t,c,p);
        SuccesLabel.setVisible(true);    
    }//GEN-LAST:event_AddButtonMouseClicked

    private void SellButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellButtonMouseClicked

        String brand = MarqueTextField3.getText();
        String model = ModeleTextField3.getText();
        ResetComponents();
       
        if (admin.SearchVehicule(brand,model)){
            Sold.setVisible(true);
            admin.SellVehicule(brand,model);
            
        }else{
            NotSold.setVisible(true);
        }
    }//GEN-LAST:event_SellButtonMouseClicked

    private void SearchlButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchlButtonMouseClicked
        String brand = MarqueTextField.getText();
        String model = ModelTextField.getText();
        ResetComponents();
        if (admin.SearchVehicule(brand,model)){
            Exist.setVisible(true);    
        }else{
            DoesNotExist.setVisible(true);
        }
    }//GEN-LAST:event_SearchlButtonMouseClicked
//Show panel vendre
    private void VendrePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VendrePanelMouseClicked
        jp1.setVisible(false);
        jp4.setVisible(true);
        jp3.setVisible(false);
        jp2.setVisible(false);
        OptionConsult.setVisible(false);
        ResetComponents();
    }//GEN-LAST:event_VendrePanelMouseClicked
//Show panel consulter
    private void ConsulterPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsulterPanelMouseClicked
        jp1.setVisible(false);
        jp4.setVisible(false);
        jp3.setVisible(true);
        jp2.setVisible(false);
        OptionConsult.setVisible(true);
        ResetComponents();
    }//GEN-LAST:event_ConsulterPanelMouseClicked
//Show panel rechercher
    private void RechercherPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RechercherPanelMouseClicked
        jp1.setVisible(false);
        jp4.setVisible(false);
        jp3.setVisible(false);
        jp2.setVisible(true);
        OptionConsult.setVisible(false);
        ResetComponents();
    }//GEN-LAST:event_RechercherPanelMouseClicked
//Show panel ajouter
    private void AjouterPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjouterPanelMouseClicked
        jp1.setVisible(true);
        jp4.setVisible(false);
        jp3.setVisible(false);
        jp2.setVisible(false);
        OptionConsult.setVisible(false);
        ResetComponents();

    }//GEN-LAST:event_AjouterPanelMouseClicked
//Show panel ColorConsult
    private void ColorConsultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColorConsultMouseClicked
        ResetComponents();
        ClearJtable();
        ConsultPanel.setVisible(true);
        jTable1.setVisible(false);
        ColorChoice.setVisible(true);
        couleurLabel2.setVisible(true);
        Consult.setVisible(true);
        
    }//GEN-LAST:event_ColorConsultMouseClicked
//Show panel ConsultAll
    private void ConsultAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultAllMouseClicked
        ClearJtable();
        ResetComponents(); 
        ConsultPanel.setVisible(true);
        jTable1.setVisible(true);
        PrintInJtable(admin.collection);
        
    }//GEN-LAST:event_ConsultAllMouseClicked
//Show vehicules with given color
    private void ConsultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultMouseClicked
        ClearJtable();
        String couleur = ColorChoice.getText();
        ColorChoice.setText("");
        jTable1.setVisible(true);
        PrintInJtable(admin.SelectVehicules(couleur));
    }//GEN-LAST:event_ConsultMouseClicked


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            Window root = new Window();
            root.setVisible(true);
            MyWindowListener wl = root.new MyWindowListener();   //Create MyWindowListner objet
            root.addWindowListener(wl);                       //Implement window closing feature to the app 
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel AjouterLabel;
    private javax.swing.JPanel AjouterPanel;
    private javax.swing.JTextField ColorChoice;
    private javax.swing.JPanel ColorConsult;
    private javax.swing.JLabel ColorConsultLabel;
    private javax.swing.JButton Consult;
    private javax.swing.JPanel ConsultAll;
    private javax.swing.JLabel ConsultAllLabel;
    private javax.swing.JPanel ConsultPanel;
    private javax.swing.JLabel ConsulterLabel;
    private javax.swing.JPanel ConsulterPanel;
    private javax.swing.JLabel CouleurLabel;
    private javax.swing.JLabel DoesNotExist;
    private javax.swing.JLabel Exist;
    private javax.swing.JLabel MarqueLabel;
    private javax.swing.JLabel MarqueLabel2;
    private javax.swing.JLabel MarqueLabel3;
    private javax.swing.JTextField MarqueTextField;
    private javax.swing.JTextField MarqueTextField3;
    private javax.swing.JTextField ModelTextField;
    private javax.swing.JLabel ModeleLabel;
    private javax.swing.JLabel ModeleLabel2;
    private javax.swing.JLabel ModeleLabel3;
    private javax.swing.JTextField ModeleTextField3;
    private javax.swing.JLabel NotSold;
    private javax.swing.JPanel OptionConsult;
    private javax.swing.JLabel PrixLabel;
    private javax.swing.JLabel RechercherLabel;
    private javax.swing.JPanel RechercherPanel;
    private javax.swing.JButton SearchlButton;
    private javax.swing.JButton SellButton;
    private javax.swing.JLabel Sold;
    private javax.swing.JLabel SuccesLabel;
    private javax.swing.JLabel TitreLabel;
    private javax.swing.JLabel TitreLabel2;
    private javax.swing.JLabel TitreLabel3;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JLabel VendreLabel;
    private javax.swing.JPanel VendrePanel;
    private javax.swing.JTextField couleur;
    private javax.swing.JLabel couleurLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JPanel jp3;
    private javax.swing.JPanel jp4;
    private javax.swing.JTextField marque;
    private javax.swing.JTextField modele;
    private javax.swing.JTextField prix;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
