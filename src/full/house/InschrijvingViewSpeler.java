/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package full.house;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tim
 */
public class InschrijvingViewSpeler extends javax.swing.JFrame {

    int spelerID;
    
    /**
     * Creates new form InschrijvingView
     */
    public InschrijvingViewSpeler(int spelerID) {
        initComponents();
        this.spelerID = spelerID;
        getInschrijvingen();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        inschrijvingTable = new javax.swing.JTable();
        betaaldBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inschrijvingen");
        setResizable(false);

        inschrijvingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(inschrijvingTable);

        betaaldBtn.setText("Betaald");
        betaaldBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                betaaldBtnMouseClicked(evt);
            }
        });

        deleteBtn.setText("<html><div align=center>Verwijder<br>inschrijving</div></html>");
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(betaaldBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {betaaldBtn, deleteBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(betaaldBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 169, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {betaaldBtn, deleteBtn});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void betaaldBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_betaaldBtnMouseClicked
        int[] rows = inschrijvingTable.getSelectedRows();
        for (int i = 0; i < rows.length; i++) {
            int evenementID = Integer.parseInt(inschrijvingTable.getValueAt(rows[i], 0).toString());
            setBetaald(spelerID, evenementID);
        }
        getInschrijvingen();
    }//GEN-LAST:event_betaaldBtnMouseClicked

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        int confirm = JOptionPane.showConfirmDialog(null, "Weet U zeker dat U deze inschrijving(en) wilt verwijderen?", "Verwijder inschrijving(en)?", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            int[] rows = inschrijvingTable.getSelectedRows();
            for (int i = 0; i < rows.length; i++) {
                int speler = Integer.parseInt(inschrijvingTable.getValueAt(rows[i], 0).toString());
                int toernooi = Integer.parseInt(inschrijvingTable.getValueAt(rows[i], 1).toString());
                deleteInschrijving(speler, toernooi);
            }
        }
        getInschrijvingen();
    }//GEN-LAST:event_deleteBtnMouseClicked

    private void getInschrijvingen () {
        String query = "SELECT Inschrijving.evenementID, naam, isBetaald, soortToernooi, datum "
                + "FROM Inschrijving "
                + "JOIN Evenement ON Inschrijving.evenementID = Evenement.evenementID "
                + "LEFT JOIN Toernooi ON Inschrijving.evenementID = Toernooi.evenementID "
                + "WHERE Inschrijving.spelerID = ?;";
        try {
            Connection conn = SimpleDataSource.getConnection();
            PreparedStatement stat = conn.prepareStatement(query);
            stat.setInt(1, spelerID);
            ResultSet result = stat.executeQuery();
            fillTable(result);
            result.close();
            stat.close();
        }
        catch (Exception e) {
            FullHouse.showDBError(e);
        }
    }
    
    private boolean setBetaald (int spelerID, int evenementID) {
        String query = "UPDATE Inschrijving "
                + "SET isBetaald = true "
                + "WHERE spelerID = ? AND evenementID = ?;";
        try {
            Connection conn = SimpleDataSource.getConnection();
            PreparedStatement stat = conn.prepareStatement(query);
            
            stat.setInt(1, spelerID);
            stat.setInt(2, evenementID);
            
            stat.executeUpdate();
            
            stat.close();
            return true;
        }
        catch (SQLException e) {
            FullHouse.showDBError(e);
            return false;
        }
    }
    
    private void deleteInschrijving (int speler, int toernooi) {
        String query = "DELETE FROM Inschrijving WHERE spelerID = ? AND evenementID = ?;";
        try {
            Connection conn = SimpleDataSource.getConnection();
            PreparedStatement stat = conn.prepareStatement(query);
            stat.setInt(1, speler);
            stat.setInt(2, toernooi);
            stat.executeUpdate();
            stat.close();
        }
        catch (Exception e) {
            FullHouse.showDBError(e);
        }
    }
    
    private void fillTable(ResultSet result) throws SQLException {
        String[] columnNames = {"Evenement ID", "Evenement naam", "Datum", "Soort", "Betaald"};
        DefaultTableModel model = new TableModel();
        model.setDataVector(new Object[][]{}, columnNames);
        while (result.next()) {
            String evenementID = result.getString("evenementID");
            evenementID = FullHouse.addZeroes(evenementID, 4);
            String naam = result.getString("naam");
            Date datum = result.getDate("datum");
            boolean betaald = result.getBoolean("isBetaald");
            String soort;
            if (result.getString("soortToernooi") == null) {
                soort = "Masterclass";
            }
            else {
                soort = "Toernooi";
            }
            
            Object[] rowData = {evenementID, naam, datum, soort, betaald};
            model.addRow(rowData);
        }
        inschrijvingTable.setModel(model);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton betaaldBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable inschrijvingTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
