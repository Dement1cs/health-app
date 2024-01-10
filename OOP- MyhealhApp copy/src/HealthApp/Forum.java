/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthApp;

/**
 *
 * @author Dmytro Zadorozhnyi x21516939
 */
import java.util.ArrayList;
//import javax.swing.JOptionPane;

public class Forum {
    private ArrayList<String> comments;  

    public Forum() {
        this.comments = new ArrayList<>();
    }

    public void addComment(String comment) { // add коммент
        comments.add(comment);
    }

    public ArrayList<String> getComments() { // возвращает список комментов
        return comments;
    }
}
