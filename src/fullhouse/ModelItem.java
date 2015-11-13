/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fullhouse;

/**
 *
 * @author Max
 */
public class ModelItem {
    
    int id;
    String beschrijving;
    
    public ModelItem (int id, String beschrijving) {
        this.id = id;
        this.beschrijving = beschrijving;
    }
    
    @Override
    public String toString () {
        return beschrijving;
    }
}
