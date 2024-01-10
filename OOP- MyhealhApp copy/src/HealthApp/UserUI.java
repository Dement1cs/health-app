package HealthApp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dmytro Zadorozhnyi x21516939
 */


public class UserUI { //пользовательский интерфейс для управления пользователями / user interface for user management

    private ArrayList<User> users;  //создается новый экземпляр, храненит объектоы типа User/ new examp class for 

    public UserUI() {
        users = new ArrayList<>();
    }

    public void menu() {
        int ans = Integer.parseInt(JOptionPane.showInputDialog(null, "Please select option: \n 1.Add \n 2.Print \n 3.Search \n 4.Delete"));

        switch (ans) {
            case 1:
                add(); //add user
                break;
            case 2:
                print();  //print user info
                break;
            case 3:
                search(); //sech user
                break;
            case 4:
                delete(); //delete profile
                break;
            default:
                break;
        }
    }

    private void add() { 
        User user = new User() {}; //Создается новый объект типа User/ new object User
        user.setName(JOptionPane.showInputDialog(null, "Enter name:"));
        user.setsName(JOptionPane.showInputDialog(null, "Enter surname:"));
        user.setId(JOptionPane.showInputDialog(null, "Enter ID:"));
        user.setDob(JOptionPane.showInputDialog(null, "Enter DOB:"));
        user.setEmail(JOptionPane.showInputDialog(null, "Enter email:"));
        user.setHeight(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter height:")));
        user.setWeight(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter weight:")));
        user.setDescription(JOptionPane.showInputDialog(null, "Enter description:"));

        users.add(user); // use add method for it)
    }

    private void print() {
        if (users.isEmpty()) {          //проверяется, пуст ли список/ check for empty
            JOptionPane.showMessageDialog(null, "Sorry, there are no users to display"); //выводится сообщение о том, что нет пользователей/ new user massage
        } else {
            for (User user : users) {
                JOptionPane.showMessageDialog(null, user.getDetails());         //пройти по каждому пользователю в списке и вывести его детали/ check every user and print details
            }
        }
    }

    private void search() {
        String searchTerm = JOptionPane.showInputDialog(null, "Enter the ID you wish to search for:");
        for (User user : users) {
            if (user.getId().equalsIgnoreCase(searchTerm)) {
                JOptionPane.showMessageDialog(null, user.getDetails());
            }
        }
    }

    private void delete() {
        String searchTerm = JOptionPane.showInputDialog(null, "Enter the ID you wish to search for:");
        User userToRemove = null;
        for (User user : users) {  // Когда пользователь найден, его ссылка сохраняется в userToRemove, и цикл прерывается/ whan user findead he saving in user to remove
            if (user.getId().equalsIgnoreCase(searchTerm)) {
                userToRemove = user;
                break;
            }
        }
        if (userToRemove != null) {   // если был найден пользователь, то он удаляется из списка/ if user find, he revomuvs
            users.remove(userToRemove);
        }
    }
}

