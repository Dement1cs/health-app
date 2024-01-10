/**
 *@author Morris Ouedraogo
 *27/11/2023
 */

package HealthApp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EntryFormUI{

    private ArrayList<EntryF> Entryforms;

    public EntryFormUI() {
      Entryforms = new ArrayList<>();
  }
    
    public void Form(){
        int ans = Integer.parseInt(JOptionPane.showInputDialog(null, " checker \n1.Confirm \n2.Kcal \n3.Bmi \n4.Chat"));

        switch (ans) {
            case 1 -> Confirm();
            case 2 -> Kcal();
            case 3 -> Bmi();
            case 4 -> Chat();
          
            default -> {
            }
        }
   }
    
    private void Confirm(){
        
     if (Entryforms.isEmpty()) {

            JOptionPane.showMessageDialog(null, "You have  not enter details correctly");
        } else {
            for (int i = 0; i < Entryforms.size(); i++) {
               EntryF e = Entryforms.get(i);
                if (e instanceof EntryF) {
                    JOptionPane.showMessageDialog(null, " Your Information " + e.getDetails());
                } else if (e instanceof EntryF){
                    
                }
            }
        }
    }

    private void Kcal(){
       
     if (Entryforms.isEmpty()) {

            JOptionPane.showMessageDialog(null, "We cannot calculate your Kcal intake ");
        } else {
            for (int i = 0; i < Entryforms.size(); i++){
               EntryF e = Entryforms.get(i);
                if (e instanceof Calorie calorie) {
                    JOptionPane.showMessageDialog(null, " Your  Calorie intake should be  " + calorie.getBmr());
                } else if (e instanceof Calorie){
                    
          
                }
            }
        }
     }   
        
    private void Bmi(){
       
     if (Entryforms.isEmpty()) {
            JOptionPane.showMessageDialog(null, "We cannot calculate your BMI ");
        } else {
            for (int i = 0; i < Entryforms.size(); i++){
               EntryF e = Entryforms.get(i);
                if (e instanceof FatTips f) {
                    JOptionPane.showMessageDialog(null, " Your  Bmi percentage " + f.getBmiPercentage()+"%");
                } else if (e instanceof FatTips){
                    
          
                }
            }
        }
     }   
    
    private void Chat(){
       
         
  
    }
    
 }



