package frames;


import javax.swing.*;

public class MessageDialog {

    private String name, phone, surname, email;


    public MessageDialog(String phone, String name, String surname, String email){
        this.phone = phone;
        this.name = name;
        this.surname = surname;
        this.email = email;
        showMessageDialog();
    }

    private void showMessageDialog(){
        JOptionPane.showMessageDialog(null, "Pomyslnie odnaleziono osobe " +phone+ ": " + name +" " +surname
        + ", " +email);
    }

}


