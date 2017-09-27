package frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class NewFrame extends JFrame implements ActionListener{


    private String phoneText, nameText, surnameText, emailText;
    private JButton save, search, random;
    private JTextArea name;
    private JTextArea surname;
    private JTextArea phone;
    private JTextArea email;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel phoneLabel;
    private JLabel emailLabel;



    public NewFrame(String title, Dimension dimension){
        setSize(dimension);
        setTitle(title);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        buttonInitialization();
        textFieldInitialization();
        textLabelInitialization();
        setVisible(true);
    }

    private void refreshTextFromTextArea(){
        phoneText = phone.getText().toString();
        nameText = name.getText().toString();
        surnameText = surname.getText().toString();
        emailText = email.getText().toString();

        System.out.println("** PHONE REFRESHED: "+ phoneText + " **");
        System.out.println("** NAME REFRESHED: "+ nameText + " **");
        System.out.println("** SURNAME REFRESHED: "+ surnameText + " **");
        System.out.println("** EMAIL REFRESHED: "+ emailText + " **");
    }

    private void buttonInitialization(){
        save = new JButton("Save");
        save.setBounds(0, 0, 100, 150);
        save.addActionListener(this);
        add(this.save);

        search = new JButton("Search");
        search.setBounds(0, 150, 100, 150);
        search.addActionListener(this);
        add(this.search);

        random = new JButton("Random autofill");
        random.setBounds(215, 230, 170, 30);
        random.addActionListener(this);
        add(this.random);
    }

    private void textFieldInitialization(){
        name = new JTextArea("");
        name.setBounds(215, 46, 170, 20);
        add(name);

        surname = new JTextArea("");
        surname.setBounds(215, 96, 170, 20);
        add(surname);

        phone = new JTextArea();
        phone.setBounds(215, 146, 170, 20);
        add(phone);

        email = new JTextArea("");
        email.setBounds(215, 196, 170, 20);
        add(email);
    }

    private void textLabelInitialization(){
        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(115, 30,100,50);
        nameLabel.setFont(new Font("Arial", Font.ITALIC, 20));
        add(nameLabel);

        surnameLabel = new JLabel("Surname:");
        surnameLabel.setBounds(115, 80,100,50);
        surnameLabel.setFont(new Font("Arial", Font.ITALIC, 20));
        add(surnameLabel);

        phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(115, 130,100,50);
        phoneLabel.setFont(new Font("Arial", Font.ITALIC, 20));
        add(phoneLabel);

        emailLabel = new JLabel("E-mail:");
        emailLabel.setBounds(115, 180,100,50);
        emailLabel.setFont(new Font("Arial", Font.ITALIC, 20));
        add(emailLabel);
    }


    public void actionPerformed(ActionEvent e){

        Object src = e.getSource();
        if (search == src){
            System.out.println("** SOURCE BUTTON CLICKED **");
            this.refreshTextFromTextArea();
            try {
                new SearchContact(phoneText);
            } catch (FileNotFoundException exc) {
                System.out.println("NIE ODNALEZIONO TAKIEGO PLIKU");
            }
        }
        else if(save == src){
            System.out.println("** SAVE BUTTON CLICKED **");
            this.refreshTextFromTextArea();
            new SaveContact(phoneText, nameText, surnameText, emailText);
        }

        else if(random == src){
            System.out.println("** GENEROWANIE AUTOMATYCZNE BUTTON CLICKED **");
            RandomGenerator randomGenerator = new RandomGenerator();
            name.setText(randomGenerator.getName());
            surname.setText(randomGenerator.getSurname());
            phone.setText(randomGenerator.getPhone());
            email.setText(randomGenerator.getEmail());

        }
    }
}
