/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.system;

/**
 *
 * @author Faiq Shahzad
 */
public class User {

    int id;
    String fullName;
    String username;
    String password;

    public User(int id, String fullName, String userName, String password) {
        this.id = id;
        this.fullName = fullName;
        this.username = userName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkCredentials(String username, String password) {
        if (this.username.compareTo(username) == 0 && this.password.compareTo(password) == 0) {
            return true;
        }

        return false;
    }

    public void printUser() {
        System.out.println("Username: " + username + " Password: " + password);
    }
}
