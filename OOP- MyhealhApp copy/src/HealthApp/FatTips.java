package HealthApp;

import java.io.Serializable;


/**
 * @author Morris Ouedraogo
 * 27/11/2023
 */
public abstract class FatTips extends EntryF implements Serializable{
    
    private int bmi;
    private double bmiPercentage;
    private double maxBmi;

   
    public FatTips(double bmi, String gender, String age, double weight, double height){
        super(gender, age, weight, height);
        this.bmi = (int) bmi;
    
    }

    public FatTips(){
        super();
        bmi = 0;
        maxBmi = 30;
        bmiPercentage= 0.0;
    }

    public double getMaxBmi() {
        return maxBmi;
    }

    public void setMaxBmi(double maxBmi) {
        this.maxBmi = maxBmi;
    }
   
    
   public void setBmi(int bmi) {
        this.bmi = (int) bmi;
    }
   
    public void setBmiPercentage(double bmiPercentage) {
        this.bmiPercentage = bmiPercentage;
    }

        
    public int getBmi() {
        return bmi;
    }

    public double getBmiPercentage() {
        return bmiPercentage;
    }


    
    @Override
    public String getDetails(){
            return super.getDetails()+" Your Information "+bmiPercentage;
    }
    
   
    public int computeBmi(){
      bmi = (int) (weight / (height / 100 * height / 100));
        return bmi;
        
    }
    
   public void computeBmiPercentage() {
       
    computeBmi(); // Ensure BMI is calculated before percentage
        bmiPercentage = (bmi/maxBmi) * 10;
    }

}

   

