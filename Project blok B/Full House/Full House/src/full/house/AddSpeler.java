/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package full.house;


/**
 *
 * @author Tim
 */
public class AddSpeler extends javax.swing.JFrame {

    SpelerView parent;
    /**
     * Creates new form AddUserFrame
     */
    public AddSpeler(SpelerView parent) {
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
        naamLbl = new javax.swing.JLabel();
        voorlettersLbl = new javax.swing.JLabel();
        straatHuisNrLbl = new javax.swing.JLabel();
        woonplaatsLbl = new javax.swing.JLabel();
        postcodeLbl = new javax.swing.JLabel();
        telefoonNrLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        naamField = new javax.swing.JTextField();
        voorlettersField = new javax.swing.JTextField();
        straatnaamField = new javax.swing.JTextField();
        huisNrField = new javax.swing.JTextField();
        woonplaatsField = new javax.swing.JTextField();
        postcodeField = new javax.swing.JTextField();
        telefoonNrField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        docentCB = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nieuwe speler");

        addUserLbl.setText("Voeg speler toe");

        naamLbl.setText("naam:");

        voorlettersLbl.setText("voorletters:");

        straatHuisNrLbl.setText("straatnaam & huisnr:");

        woonplaatsLbl.setText("woonplaats:");

        postcodeLbl.setText("postcode:");

        telefoonNrLbl.setText("telefoon nr:");

        emailLbl.setText("E-mail adres:");

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

        docentCB.setText("Docent");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addUserLbl)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(straatHuisNrLbl)
                            .addComponent(woonplaatsLbl)
                            .addComponent(postcodeLbl)
                            .addComponent(voorlettersLbl)
                            .addComponent(telefoonNrLbl)
                            .addComponent(emailLbl)
                            .addComponent(naamLbl))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(docentCB)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(naamField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(voorlettersField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(straatnaamField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(huisNrField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(postcodeField)
                                .addComponent(woonplaatsField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telefoonNrField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addUserLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(naamLbl)
                    .addComponent(naamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voorlettersLbl)
                    .addComponent(voorlettersField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(postcodeLbl)
                    .addComponent(postcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoonNrLbl)
                    .addComponent(telefoonNrField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLbl)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(docentCB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        String naam = naamField.getText();
        String voorletters = voorlettersField.getText();
        String straatnaam = straatnaamField.getText();
        String huisNr = huisNrField.getText();
        String woonplaats = woonplaatsField.getText();
        String postcode = postcodeField.getText();
        String telefoonNr = telefoonNrField.getText();
        String email = emailField.getText();
        boolean docent = docentCB.isSelected();
        Speler speler = new Speler(naam, voorletters, straatnaam, huisNr, woonplaats, postcode, telefoonNr, email, docent);
        parent.addSpeler(speler);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_addBtnMouseClicked

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelBtnMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel addUserLbl;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JCheckBox docentCB;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField huisNrField;
    private javax.swing.JTextField naamField;
    private javax.swing.JLabel naamLbl;
    private javax.swing.JTextField postcodeField;
    private javax.swing.JLabel postcodeLbl;
    private javax.swing.JLabel straatHuisNrLbl;
    private javax.swing.JTextField straatnaamField;
    private javax.swing.JTextField telefoonNrField;
    private javax.swing.JLabel telefoonNrLbl;
    private javax.swing.JTextField voorlettersField;
    private javax.swing.JLabel voorlettersLbl;
    private javax.swing.JTextField woonplaatsField;
    private javax.swing.JLabel woonplaatsLbl;
    // End of variables declaration//GEN-END:variables
}
