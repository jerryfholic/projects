/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package full.house;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Tim
 */
public class AddInschrijving extends javax.swing.JFrame {

    int[] spelers;
    
    /**
     * Creates new form Inschrijving2
     */
    public AddInschrijving(int[] spelers) {
        initComponents();
        this.spelers = spelers;
        fillFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        evenementCB = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        betaaldCB = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        spelersList = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("spelers:");

        saveBtn.setText("Save");
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
        });

        jLabel1.setText("Nieuwe inschrijving");

        jLabel5.setText("evenement:");

        cancelBtn.setText("Cancel");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });

        betaaldCB.setText("betaald");

        spelersList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        spelersList.setEnabled(false);
        jScrollPane1.setViewportView(spelersList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(betaaldCB)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(evenementCB, 0, 155, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelBtn))
                    .addComponent(jLabel1))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelBtn, saveBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(evenementCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(betaaldCB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Schrijft de speler in voor het geselecteerde toernooi.
     * Laat een dialog zien als de inschrijving succesvol is.
     * @param evt 
     */
    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        if (addInschrijving()) {
            JOptionPane.showMessageDialog(rootPane, "Spelers zijn ingeschreven");
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_saveBtnMouseClicked
    
    /**
     * Annuleert de inschrijving.
     * @param evt 
     */
    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelBtnMouseClicked
    
    /**
     * Vult de textvelden met corresponderende waarden.
     */
    private void fillFields () {
        String query = "SELECT voorletters, naam FROM Speler WHERE spelerID = ?;";
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < spelers.length; i++) {
            try {
                Connection conn = SimpleDataSource.getConnection();
                PreparedStatement stat = conn.prepareStatement(query);
                int spelerID = spelers[i];
                stat.setInt(1, spelerID);

                ResultSet result = stat.executeQuery();
                result.next();
                String voorletters = result.getString("voorletters");
                String naam = result.getString("naam");
                ModelItem item = new ModelItem(spelers[i], naam + ", " + voorletters);
                model.addElement(item);
                
                result.close();
                stat.close();
            }
            catch (Exception e) {
                FullHouse.showDBError(e);
            }
        }
        spelersList.setModel(model);
        getToernooien();
    }
    
    /**
     * Haalt een lijst op met bestaande toernooien en vult een ComboBox hiermee.
     */
    private void getToernooien () {
        String query = "SELECT evenementID, naam FROM Evenement;";
        try {
            Connection conn = SimpleDataSource.getConnection();
            PreparedStatement stat = conn.prepareStatement(query);
            ResultSet result = stat.executeQuery();
            while (result.next()) {
                int evenementID = result.getInt("evenementID");
                String naam = result.getString("naam");
                ModelItem item = new ModelItem(evenementID, naam);
                evenementCB.addItem(item);
            }
            result.close();
            stat.close();
        }
        catch (Exception e) {
            FullHouse.showDBError(e);
        }
    }
    
    /**
     * Voegt een inschrijving toe.
     * Laat een dialog zien als een speler al is ingeschreven voor dit toernooi.
     * @return Returns false als de inschrijving niet gelukt is.
     */
    private boolean addInschrijving () {
        boolean succes = true;
        String query = "INSERT INTO Inschrijving(spelerID, evenementID, isBetaald)"
                + "VALUES(?,?,?)";
        ModelItem item = (ModelItem) evenementCB.getSelectedItem();
        int evenementID = item.id;
        boolean isBetaald = betaaldCB.isSelected();
        for (int i = 0; i < spelers.length; i++) {
            try {
                Connection conn = SimpleDataSource.getConnection();
                PreparedStatement stat = conn.prepareStatement(query);
                stat.setInt(1, spelers[i]);
                stat.setInt(2, evenementID);
                stat.setBoolean(3, isBetaald);
                stat.executeUpdate();
                stat.close();
            }
            catch (MySQLIntegrityConstraintViolationException e) {
                
            }
            catch (SQLException e) {
                FullHouse.showDBError(e);
                succes = false;
            }
        }
        return succes;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox betaaldCB;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox evenementCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveBtn;
    private javax.swing.JList spelersList;
    // End of variables declaration//GEN-END:variables
}
