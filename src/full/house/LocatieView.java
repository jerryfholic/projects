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
public class LocatieView extends javax.swing.JPanel {

    MainWindow window;
    
    /**
     * Creates new form SpelerView
     */
    public LocatieView() {
        initComponents();
        getLocaties();
    }
    
    public LocatieView(MainWindow window) {
        initComponents();
        this.window = window;
        getLocaties();
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
        locatieTable = new javax.swing.JTable();
        addLocatieBtn = new javax.swing.JButton();
        editLocatieBtn = new javax.swing.JButton();
        deleteLocatieBtn = new javax.swing.JButton();
        viewToernooienBtn = new javax.swing.JButton();

        locatieTable.setModel(new javax.swing.table.DefaultTableModel(
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
        locatieTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(locatieTable);

        addLocatieBtn.setText("<html><div align=center>Nieuwe<br>locatie</div></html>");
        addLocatieBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addLocatieBtnMouseClicked(evt);
            }
        });

        editLocatieBtn.setText("<html><div align=center>Bewerk<br>locatie</div></html>");
        editLocatieBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editLocatieBtnMouseClicked(evt);
            }
        });

        deleteLocatieBtn.setText("<html><div align=center>Verwijder<br>locatie</html>");
        deleteLocatieBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteLocatieBtnMouseClicked(evt);
            }
        });

        viewToernooienBtn.setText("<html><div align=center>Bekijk<br>toernooien</div></html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addLocatieBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewToernooienBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteLocatieBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editLocatieBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addLocatieBtn, deleteLocatieBtn, editLocatieBtn, viewToernooienBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addLocatieBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editLocatieBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteLocatieBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewToernooienBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addLocatieBtn, deleteLocatieBtn, editLocatieBtn, viewToernooienBtn});

    }// </editor-fold>//GEN-END:initComponents

    private void addLocatieBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLocatieBtnMouseClicked
        AddLocatie addLocatie = new AddLocatie(this);
        addLocatie.setLocation(300, 150);
        addLocatie.setVisible(true);
    }//GEN-LAST:event_addLocatieBtnMouseClicked

    private void editLocatieBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLocatieBtnMouseClicked
        int[] rows = locatieTable.getSelectedRows();
        if (rows.length == 0) {
            JOptionPane.showMessageDialog(this, "Geen locatie(s) geselecteerd.", "Bewerk locatie", JOptionPane.PLAIN_MESSAGE);
        } else if (rows.length > 10) {
            JOptionPane.showMessageDialog(this, "Meer dan 10 locaties geselecteerd. Selecteerd een maximum van 10 locaties.", "Bewerk locatie", JOptionPane.PLAIN_MESSAGE);
        } else {
            for (int i = 0; i < rows.length; i++) {
                Locatie locatie = getLocatieFromTable(rows[i]);
                EditLocatie editLocatie = new EditLocatie(this, locatie);
                editLocatie.setLocation(200 + i*30, 150 + i*30 - (i/5)*150);
                editLocatie.setVisible(true);
            }
        }
    }//GEN-LAST:event_editLocatieBtnMouseClicked

    private void deleteLocatieBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLocatieBtnMouseClicked
        int confirm = JOptionPane.showConfirmDialog(null, "Weet U zeker dat U deze locatie wilt verwijderen?", "Verwijder locatie?", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            int[] rows = locatieTable.getSelectedRows();
            for (int i = 0; i < rows.length; i++) {
                int id = Integer.parseInt(locatieTable.getValueAt(rows[i], 0).toString());
                deleteLocatie(id);
            }
        }
    }//GEN-LAST:event_deleteLocatieBtnMouseClicked

    public final void getLocaties () {
        String query = "SELECT * FROM Locatie;";
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
    
    private void deleteLocatie (int id) {
        String query = "DELETE FROM Locatie WHERE locatieID = ?;";
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
        
        getLocaties();
    }
    
    private void fillTable(ResultSet result) throws SQLException {
        String[] columnNames = {"ID", "Naam", "Aantal tafels",  "Spelers per tafel", "Straatnaam", "HuisNr", "Plaats", "Postcode"};
        DefaultTableModel model = new TableModel();
        model.setDataVector(new Object[][]{}, columnNames);
        while (result.next()) {
            String ID = result.getString("locatieID");
            ID = FullHouse.addZeroes(ID, 4);
            String naam = result.getString("naam");
            int aantalTafels = result.getInt("aantalTafels");
            int spelersPerTafel = result.getInt("spelersPerTafel");
            String straatnaam = result.getString("straatnaam");
            String huisnr = result.getString("huisNr");
            String plaats = result.getString("woonplaats");
            String postcode = result.getString("postcode");
            Object[] rowData = {ID, naam, aantalTafels, spelersPerTafel, straatnaam, huisnr, plaats, postcode};
            model.addRow(rowData);
        }
        locatieTable.setModel(model);
        //setColumnWidth(locatieTable);
        result.close();
    }
    
    private Locatie getLocatieFromTable (int row) {
        int id = Integer.parseInt(locatieTable.getValueAt(row, 0).toString());
        String naam = locatieTable.getValueAt(row, 1).toString();
        int aantalTafels = Integer.parseInt(locatieTable.getValueAt(row, 2).toString());
        int spelersPerTafel = Integer.parseInt(locatieTable.getValueAt(row, 3).toString());
        String straatnaam = locatieTable.getValueAt(row, 4).toString();
        String huisNr = locatieTable.getValueAt(row, 5).toString();
        String plaats = locatieTable.getValueAt(row, 6).toString();
        String postcode = locatieTable.getValueAt(row, 7).toString();
        Locatie locatie = new Locatie(id, naam, straatnaam, huisNr, plaats, postcode, aantalTafels, spelersPerTafel);
        return locatie;
    }
    
    private void setColumnWidth (JTable table) {
        TableColumnModel tcm = table.getColumnModel();
        
        tcm.getColumn(0).setMaxWidth(35);
        tcm.getColumn(0).setPreferredWidth(35);
        tcm.getColumn(0).setMinWidth(35);
        tcm.getColumn(1).setMaxWidth(250);
        tcm.getColumn(1).setPreferredWidth(100);
        tcm.getColumn(2).setMaxWidth(70);
        tcm.getColumn(2).setPreferredWidth(70);
        tcm.getColumn(3).setMaxWidth(250);
        tcm.getColumn(3).setPreferredWidth(100);
        tcm.getColumn(4).setMaxWidth(100);
        tcm.getColumn(4).setPreferredWidth(80);
        tcm.getColumn(5).setMaxWidth(150);
        tcm.getColumn(5).setPreferredWidth(80);
        
        DefaultTableCellRenderer Renderer = new DefaultTableCellRenderer();
        Renderer.setHorizontalAlignment(SwingConstants.CENTER);
        tcm.getColumn(0).setCellRenderer(Renderer);
        tcm.getColumn(1).setCellRenderer(Renderer);
        tcm.getColumn(2).setCellRenderer(Renderer);
        tcm.getColumn(3).setCellRenderer(Renderer);
        tcm.getColumn(4).setCellRenderer(Renderer);
        tcm.getColumn(5).setCellRenderer(Renderer);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLocatieBtn;
    private javax.swing.JButton deleteLocatieBtn;
    private javax.swing.JButton editLocatieBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable locatieTable;
    private javax.swing.JButton viewToernooienBtn;
    // End of variables declaration//GEN-END:variables
}