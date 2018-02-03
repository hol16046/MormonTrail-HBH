/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
*
* @author Chaskiel, Jared, Heather
*/
public class Player implements Serializable{
   private String name;
   
    public Player() {
   }

   public String getActorName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   @Override
   public int hashCode() {
       int hash = 7;
       hash = 11 * hash + Objects.hashCode(this.name);
       return hash;
   }

    public Player(String name) {
        this.name = name;
    }

   @Override
   public boolean equals(Object obj) {
       if (this == obj) {
           return true;
       }
       if (obj == null) {
           return false;
       }
       if (getClass() != obj.getClass()) {
           return false;
       }
       final Player other = (Player) obj;
       if (!Objects.equals(this.name, other.name)) {
           return false;
       }
       return true;
   }

   @Override
   public String toString() {
       return "Player{" + "name=" + name + '}';
   }

  
   
   
   
}