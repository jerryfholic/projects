/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fullhouse;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 *
 * @author Dave
 */
public class LocatieToevoegen extends javax.swing.JFrame {

    LocatieView parent;
    String naam;
    String straatnaam;
    String huisNr;
    String woonplaats;
    String postcode;
    int aantalTafels;
    int spelersPerTafel;
    /**
     * Creates new form AddUserFrame
     */
    public LocatieToevoegen(LocatieView parent) {
        initComponents();
        this.parent = parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addUserLbl = new javax.swing.JLabel();
        straatHuisNrLbl = new javax.swing.JLabel();
        woonplaatsLbl = new javax.swing.JLabel();
        postcodeLbl = new javax.swing.JLabel();
        telefoonNrLbl = new javax.swing.JLabel();
        straatnaamField = new javax.swing.JTextField();
        huisNrField = new javax.swing.JTextField();
        woonplaatsField = new javax.swing.JTextField();
        postcodeField = new javax.swing.JTextField();
        aantalField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        naamField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        spelersPerCB = new javax.swing.JComboBox();
        warningLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nieuwe locatie");

        addUserLbl.setText("Voeg locatie toe");

        straatHuisNrLbl.setText("straatnaam & huisnr:");

        woonplaatsLbl.setText("woonplaats:");

        postcodeLbl.setText("postcode:");

        telefoonNrLbl.setText("aantal tafels:");

        addBtn.setText("Add");
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });

        jLabel1.setText("bescrhijving locatie:");

        jLabel2.setText("spelers per tafel:");

        spelersPerCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        warningLbl.setForeground(new java.awt.Color(240, 240, 240));
        warningLbl.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addUserLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(straatHuisNrLbl)
                                    .addComponent(woonplaatsLbl)
                                    .addComponent(postcodeLbl)
                                    .addComponent(telefoonNrLbl)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(postcodeField)
                                    .addComponent(woonplaatsField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(straatnaamField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(huisNrField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(naamField)
                                    .addComponent(spelersPerCB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aantalField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(warningLbl))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addUserLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(naamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(straatHuisNrLbl)
                    .addComponent(huisNrField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(straatnaamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(woonplaatsLbl)
                    .addComponent(woonplaatsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postcodeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoonNrLbl)
                    .addComponent(aantalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spelersPerCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(warningLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        if (getValues()) {
            if (FullHouse.checkPostcode(postcode)) {
                if (addLocatie()) {
                    this.setVisible(false);
                    this.dispose();
                }
            }
            else {
                warningLbl.setText("Ongeldige postcode. formaat postcode 1234AB");
                warningLbl.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_addBtnMouseClicked

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelBtnMouseClicked

    private boolean addLocatie () {
        String query = "INSERT INTO Locatie(naam, straatnaam, huisNr, woonplaats, postcode, aantalTafels, spelersPerTafel)"
                + "VALUES(?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = Dataconnection.getConnection();
            PreparedStatement stat = conn.prepareStatement(query);
            stat.setString(1, naam);
            stat.setString(2, straatnaam);
            stat.setString(3, huisNr);
            stat.setString(4, woonplaats);
            stat.setString(5, postcode);
            stat.setInt(6, aantalTafels);
            stat.setInt(7, spelersPerTafel);
            
            stat.executeUpdate();
            stat.close();
            
            parent.getLocaties();
        }
        catch (Exception e) {
            FullHouse.showDBError(e);
            return false;
        }
        return true;
    }
    
    private boolean getValues () {
        naam = naamField.getText();
        straatnaam = straatnaamField.getText();
        huisNr = huisNrField.getText();
        woonplaats = woonplaatsField.getText();
        postcode = postcodeField.getText();
        spelersPerTafel = Integer.parseInt(spelersPerCB.getSelectedItem().toString());
        try {
            aantalTafels = Integer.parseInt(aantalField.getText());
        }
        catch (Exception e) {
            return false;
        }
        if (naam.length() < 2) {
            warningLbl.setText("Naam moet minimaal 4 tekens lang zijn");
            warningLbl.setForeground(Color.red);
            return false;
        }
        else if (straatnaam.length() < 2) {
            warningLbl.setText("Vul een straatnaam in");
            warningLbl.setForeground(Color.red);
            return false;
        }
        else if (huisNr.length() < 1) {
            warningLbl.setText("Vul een huisnummer in");
            warningLbl.setForeground(Color.red);
            return false;
        }
        else if (woonplaats.length() < 2) {
            warningLbl.setText("Vul een woonplaats in");
            warningLbl.setForeground(Color.red);
            return false;
        }
        else {
            return true;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aantalField;
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel addUserLbl;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField huisNrField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField naamField;
    private javax.swing.JTextField postcodeField;
    private javax.swing.JLabel postcodeLbl;
    private javax.swing.JComboBox spelersPerCB;
    private javax.swing.JLabel straatHuisNrLbl;
    private javax.swing.JTextField straatnaamField;
    private javax.swing.JLabel telefoonNrLbl;
    private javax.swing.JLabel warningLbl;
    private javax.swing.JTextField woonplaatsField;
    private javax.swing.JLabel woonplaatsLbl;
    // End of variables declaration//GEN-END:variables
}
