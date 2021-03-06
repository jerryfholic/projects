/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fullhouse;

import java.awt.CardLayout;
import java.awt.Color;

/**
 *
 * @author Dave
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        viewSpelersBtn.setForeground(Color.red);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewSpelersBtn = new javax.swing.JButton();
        viewToernooienBtn = new javax.swing.JButton();
        viewMCBtn = new javax.swing.JButton();
        viewLocatiesBtn = new javax.swing.JButton();
        cards = new javax.swing.JPanel();
        spelerView = new fullhouse.SpelerView();
        toernooiView = new fullhouse.ToernooiView();
        locatieView = new fullhouse.LocatieView();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Full House registratie-programma");
        setPreferredSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        viewSpelersBtn.setText("Spelers");
        viewSpelersBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewSpelersBtnMouseClicked(evt);
            }
        });

        viewToernooienBtn.setText("Toernooien");
        viewToernooienBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewToernooienBtnMouseClicked(evt);
            }
        });

        viewMCBtn.setText("Master Classes");
        viewMCBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMCBtnMouseClicked(evt);
            }
        });

        viewLocatiesBtn.setText("Locaties");
        viewLocatiesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewLocatiesBtnMouseClicked(evt);
            }
        });

        cards.setLayout(new java.awt.CardLayout());
        cards.add(spelerView, "spelerView");
        cards.add(toernooiView, "toernooiView");
        cards.add(locatieView, "locatieView");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewSpelersBtn)
                .addGap(18, 18, 18)
                .addComponent(viewToernooienBtn)
                .addGap(18, 18, 18)
                .addComponent(viewMCBtn)
                .addGap(18, 18, 18)
                .addComponent(viewLocatiesBtn)
                .addGap(0, 187, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addComponent(cards, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {viewLocatiesBtn, viewMCBtn, viewSpelersBtn, viewToernooienBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewSpelersBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewToernooienBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewMCBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewLocatiesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cards, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewToernooienBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewToernooienBtnMouseClicked
        CardLayout cl = (CardLayout) cards.getLayout();
        cl.show(cards, "toernooiView");
        viewLocatiesBtn.setForeground(Color.black);
        viewMCBtn.setForeground(Color.black);
        viewSpelersBtn.setForeground(Color.black);
        viewToernooienBtn.setForeground(Color.red);
        toernooiView.getToernooien();
    }//GEN-LAST:event_viewToernooienBtnMouseClicked

    private void viewSpelersBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSpelersBtnMouseClicked
        CardLayout cl = (CardLayout) cards.getLayout();
        cl.show(cards, "spelerView");
        viewLocatiesBtn.setForeground(Color.black);
        viewMCBtn.setForeground(Color.black);
        viewSpelersBtn.setForeground(Color.red);
        viewToernooienBtn.setForeground(Color.black);
        spelerView.getSpelers();
    }//GEN-LAST:event_viewSpelersBtnMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            Dataconnection.closeConnection();
            System.out.println("Connection closed.");
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("Could not close connection!");
        }
    }//GEN-LAST:event_formWindowClosing

    private void viewLocatiesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewLocatiesBtnMouseClicked
        CardLayout cl = (CardLayout) cards.getLayout();
        cl.show(cards, "locatieView");
        viewLocatiesBtn.setForeground(Color.red);
        viewMCBtn.setForeground(Color.black);
        viewSpelersBtn.setForeground(Color.black);
        viewToernooienBtn.setForeground(Color.black);
        locatieView.getLocaties();
    }//GEN-LAST:event_viewLocatiesBtnMouseClicked

    private void viewMCBtnMouseClicked (java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMCBtnMouseClicked
        CardLayout cl = (CardLayout) cards.getLayout();
        cl.show(cards, "masterclassView");
        viewLocatiesBtn.setForeground(Color.black);
        viewMCBtn.setForeground(Color.red);
        viewSpelersBtn.setForeground(Color.black);
        viewToernooienBtn.setForeground(Color.black);
    }//GEN-LAST:event_viewMCBtnMouseClicked
    
    
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cards;
    private javax.swing.JSeparator jSeparator2;
    private fullhouse.LocatieView locatieView;
    private fullhouse.SpelerView spelerView;
    private fullhouse.ToernooiView toernooiView;
    private javax.swing.JButton viewLocatiesBtn;
    private javax.swing.JButton viewMCBtn;
    private javax.swing.JButton viewSpelersBtn;
    private javax.swing.JButton viewToernooienBtn;
    // End of variables declaration//GEN-END:variables
}
