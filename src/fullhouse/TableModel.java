/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fullhouse;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jerry
 */
public class TableModel extends DefaultTableModel {
    
    public boolean isCellEditable (int row, int column) {
        return false;
    }
    
    public Class getColumnClass (int c) {
        return getValueAt(0, c).getClass();
    }
}
