/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



 
package mormontrail.controller;
import java.io.Serializable;
import java.util.Objects;
import static mormontrail.controller.GameController.createMap;
/**
 *
 * @author Chaskiel
 */
/*
public class MapControl {
    

    
    
    
    private double ;
    
    private double ;
}
*/
public class MapControl{
    

public void createMap() {
		createMap cm = new createMap();
		cm.display();
                
 }

    void setDescription(String current_Location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setRow(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setColumn(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class createMap {

        public createMap() {
        }

        private void display() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}