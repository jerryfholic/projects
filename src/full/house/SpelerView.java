/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package full.house;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Tim
 */
public class SpelerView extends javax.swing.JPanel {

    
    /**
     * Creates new form SpelerView
     */
    public SpelerView() {
        initComponents();
        getSpelers();
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
        spelerTable = new javax.swing.JTable();
        addSpelerBtn = new javax.swing.JButton();
        editSpelerBtn = new javax.swing.JButton();
        deleteSpelerBtn = new javax.swing.JButton();
        viewInschrijvingenBtn = new javax.swing.JButton();
        addInschrijvingBtn = new javax.swing.JButton();

        spelerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Naam", "Voorletters", "Straatnaam", "Huisnr", "Woonplaats", "Postcode", "E-mail adres", "Telefoon-nr", "Rating", "Winsten", "Docent"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spelerTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        spelerTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(spelerTable);

        addSpelerBtn.setText("<html><div align=center>Nieuwe<br>speler</div></html>");
        addSpelerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSpelerBtnMouseClicked(evt);
            }
        });

        editSpelerBtn.setText("<html><div align=center>Bewerk<br>speler</div></html>");
        editSpelerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editSpelerBtnMouseClicked(evt);
            }
        });

        deleteSpelerBtn.setText("<html><div align=center>Verwijder<br>speler</html>");
        deleteSpelerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteSpelerBtnMouseClicked(evt);
            }
        });

        viewInschrijvingenBtn.setText("<html><div align=center>Bekijk<br>inschrijvingen</div></html>");
        viewInschrijvingenBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewInschrijvingenBtnMouseClicked(evt);
            }
        });

        addInschrijvingBtn.setText("<html><div align=center>Nieuwe<br>inschrijving</div></html>");
        addInschrijvingBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addInschrijvingBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addSpelerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteSpelerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editSpelerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewInschrijvingenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addInschrijvingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addInschrijvingBtn, addSpelerBtn, deleteSpelerBtn, editSpelerBtn, viewInschrijvingenBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addSpelerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editSpelerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteSpelerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addInschrijvingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewInschrijvingenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addInschrijvingBtn, addSpelerBtn, deleteSpelerBtn, editSpelerBtn, viewInschrijvingenBtn});

    }// </editor-fold>//GEN-END:initComponents

    private void addSpelerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSpelerBtnMouseClicked
        AddSpeler addSpeler = new AddSpeler(this);
        addSpeler.setLocation(300, 150);
        addSpeler.setVisible(true);
    }//GEN-LAST:event_addSpelerBtnMouseClicked

    private void editSpelerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSpelerBtnMouseClicked
        int[] row = spelerTable.getSelectedRows();
        if (row.length == 0) {
            JOptionPane.showMessageDialog(this, "Geen speler geselecteerd.", "Bewerk speler", JOptionPane.PLAIN_MESSAGE);
        } else {
            for (int i = 0; i < row.length; i++) {
                int id = Integer.parseInt(spelerTable.getValueAt(row[i], 0).toString());
                EditSpeler editSpeler = new EditSpeler(this, id);
                editSpeler.setLocation(200 + i*30, 150 + i*30 - (i/5)*150);
                editSpeler.setVisible(true);
            }
        }
    }//GEN-LAST:event_editSpelerBtnMouseClicked

    private void deleteSpelerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteSpelerBtnMouseClicked
        int confirm = JOptionPane.showConfirmDialog(null, "Weet U zeker dat U deze speler(s) wilt verwijderen?", "Verwijder speler?", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            int[] rows = spelerTable.getSelectedRows();
            for (int i = 0; i < rows.length; i++) {
                int id = Integer.parseInt(spelerTable.getValueAt(rows[i], 0).toString());
                deleteSpeler(id);
            }
        }
    }//GEN-LAST:event_deleteSpelerBtnMouseClicked

    private void addInschrijvingBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addInschrijvingBtnMouseClicked
        int[] row = spelerTable.getSelectedRows();
        if (row.length == 0) {
            JOptionPane.showMessageDialog(this, "Geen speler(s) geselecteerd.", "Nieuwe inschrijving", JOptionPane.PLAIN_MESSAGE);
        } else {
            int[] spelers = new int[row.length];
            for (int i = 0; i < spelers.length; i++) {
                spelers[i] = Integer.parseInt(spelerTable.getValueAt(row[i], 0).toString());
            }
            AddInschrijving inschrijving = new AddInschrijving(spelers);
            inschrijving.setLocation(300, 300);
            inschrijving.setVisible(true);
        }
    }//GEN-LAST:event_addInschrijvingBtnMouseClicked

    private void viewInschrijvingenBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewInschrijvingenBtnMouseClicked
        int[] row = spelerTable.getSelectedRows();
        if (row.length > 1) {
            System.out.println("More than one user selected!");
        } else if (row.length == 0) {
            System.out.println("No user selected!");
        } else {
            int spelerID = Integer.parseInt(spelerTable.getValueAt(row[0], 0).toString());
            InschrijvingViewSpeler inschrijvingen = new InschrijvingViewSpeler(spelerID);
            inschrijvingen.setLocation(200,100);
            inschrijvingen.setVisible(true);
        }
    }//GEN-LAST:event_viewInschrijvingenBtnMouseClicked

    public final void getSpelers () {
        String query = "SELECT * FROM Speler;";
        try {
            Connection conn = SimpleDataSource.getConnection();
            PreparedStatement stat = conn.prepareStatement(query);
            ResultSet result = stat.executeQuery();
            fillTable(result);
            result.close();
            stat.close();
        }
        catch (Exception e) {
            FullHouse.showDBError(e);
        }
    }
    
    
    private void fillTable(ResultSet result) throws SQLException {
        String[] columnNames = {"ID", "Naam", "Voorletters", "Straatnaam", "HuisNr", "Woonplaats", "Postcode", "Telefoon nr", "E-mail adres", "Rating", "Winsten", "Docent"};
        DefaultTableModel model = new TableModel();
        model.setDataVector(new Object[][]{}, columnNames);
        while (result.next()) {
            String ID = result.getString("spelerID");
            ID = FullHouse.addZeroes(ID, 4);
            String naam = result.getString("naam");
            String voorletters = result.getString("voorletters");
            String straatnaam = result.getString("straatnaam");
            String huisnr = result.getString("huisNr");
            String woonplaats = result.getString("woonplaats");
            String postcode = result.getString("postcode");
            String telefoonNr = result.getString("telefoonNr");
            String email = result.getString("email");
            String rating = result.getString("rating");
            String winsten = result.getString("gewonnenGeld");
            Boolean docent = result.getBoolean("isDocent");
            Object[] rowData = {ID, naam, voorletters, straatnaam, huisnr, woonplaats, postcode, telefoonNr, email, rating, winsten, docent};
            model.addRow(rowData);
        }
        spelerTable.setModel(model);
        setColumnWidth(spelerTable);
        result.close();
    }
    
    private void deleteSpeler (int id) {
        String query = "DELETE FROM Speler WHERE spelerID = ?;";
        try {
            Connection conn = SimpleDataSource.getConnection();
            PreparedStatement stat = conn.prepareStatement(query);
            stat.setInt(1, id);
            stat.executeUpdate();
            stat.close();
        }
        catch (Exception e) {
            FullHouse.showDBError(e);
        }
        
        getSpelers();
    }
    
    private void setColumnWidth (JTable table) {
        TableColumnModel tcm = table.getColumnModel();
        
        tcm.getColumn(0).setMaxWidth(35);
        tcm.getColumn(0).setPreferredWidth(35);
        tcm.getColumn(0).setMinWidth(35);
        tcm.getColumn(1).setMaxWidth(150);
        tcm.getColumn(1).setPreferredWidth(100);
        tcm.getColumn(2).setMaxWidth(70);
        tcm.getColumn(2).setPreferredWidth(70);
        tcm.getColumn(3).setMaxWidth(150);
        tcm.getColumn(3).setPreferredWidth(100);
        tcm.getColumn(4).setMaxWidth(50);
        tcm.getColumn(4).setPreferredWidth(45);
        tcm.getColumn(5).setMaxWidth(150);
        tcm.getColumn(5).setPreferredWidth(100);
        tcm.getColumn(6).setMaxWidth(60);
        tcm.getColumn(6).setPreferredWidth(60);
        tcm.getColumn(7).setMaxWidth(100);
        tcm.getColumn(7).setPreferredWidth(90);
        tcm.getColumn(8).setMaxWidth(200);
        tcm.getColumn(8).setPreferredWidth(150);
        
        DefaultTableCellRenderer Renderer = new DefaultTableCellRenderer();
        Renderer.setHorizontalAlignment(SwingConstants.RIGHT);
        tcm.getColumn(0).setCellRenderer(Renderer);
        tcm.getColumn(9).setCellRenderer(Renderer);
        tcm.getColumn(10).setCellRenderer(Renderer);        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addInschrijvingBtn;
    private javax.swing.JButton addSpelerBtn;
    private javax.swing.JButton deleteSpelerBtn;
    private javax.swing.JButton editSpelerBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable spelerTable;
    private javax.swing.JButton viewInschrijvingenBtn;
    // End of variables declaration//GEN-END:variables
}
