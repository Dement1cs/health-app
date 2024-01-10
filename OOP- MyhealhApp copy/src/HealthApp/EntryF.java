package HealthApp;


import java.io.Serializable;

/**
 *@author Morris Ouedraogo
 *27/11/2023
 */

public abstract class EntryF implements Serializable{
    String gender;
    String age;
    double weight;
    double height;
    
    
    public void setValues(String gender, String age, double weight, double height) {
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

 
    
    public EntryF(){
        gender = " ";
        age = " ";
        weight = 0.0;
        height = 0.0;
             
    }

    public EntryF(String gender, String age, double weight, double height) {
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
        
    }

 

   public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    

    public String getDetails(){
        return "Gender: " + gender+ " Age-  " + age + " Weight- " + weight + " Kg " + " Height- " +height+ " CM";
    }

        
}
