package HealthApp;


import java.io.Serializable;

/**
 * @author Morris Ouedraogo
 * 27/11/23
 */



public abstract class Calorie extends EntryF implements Serializable {

    private double bmr;
    private int num1;
    private double num2;
    private int num4;
    private int num5;

    public Calorie(double bmr,int num1, double num2, int num4, int num5, String gender, String age, double weight, double height) {
        super(gender, age, weight, height);
        this.bmr = bmr;
        this.num1= num1;
        this.num2 = num2;
        this.num4 = num4;
        this.num5= num5;           
    }
    
    public Calorie() {
      super();
        bmr = 0.0;
        num1= 10;
        num2 = 6.25;
        num4 = 5;
        num5= 161;
    }


    public void setNum1(int num1){
        this.num1 = num1;
    }
    
    public int getNum1() {
        return num1;
    }
    
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double getNum2(){
        return num2;
    }
    
    public void setNum4(int num4) {
        this.num4 = num4;
    }
    

    public int getNum4() {
        return num4;
    }

    public void setNum5(int num5) {
        this.num5 = num5;
    }
     
    public int getNum5() {
        return num5;
    }

    public void setBmr(double bmr) {
        this.bmr = bmr;
    }

    public double getBmr() {
        return bmr;
    }
    
    
    @Override
    public String getDetails() {
        return super.getDetails() + "Your Calorie intake in Kcals " + bmr;
    }

    
    public void computeIntake(){
        try {
            int ageInt = Integer.parseInt(age); // Converting  age from a String to int
            if (gender.equalsIgnoreCase("Male")){
                bmr = num1 * weight + num2 * height - num4 * ageInt +num5;
            } else {
                bmr = num1 * weight + num2* height- num4* ageInt-num5;
            }
        }catch (NumberFormatException e) {
            // Handle the exception, for example, set bmr to some default value
            bmr = 0.0; // Set bmr to default value if age is not a valid number
            System.err.println("Invalid age format: " + age);
        }
     }
 }
   

