package frames;

import java.io.IOException;
import java.io.PrintWriter;

public class SaveContact {
    private String phone;
    private String name;
    private String surname;
    private String email;

    public SaveContact(String p, String n, String s, String e){
        this.phone = p;
        this.name = n;
        this.surname = s;
        this.email = e;
        fileWriter();
    }


    private void fileWriter(){
        try{
            System.out.println(this.phone + ".xml");
            PrintWriter writer = new PrintWriter("./target/"+this.phone + ".xml", "UTF-8");
            writer.println("<person>");
            writer.println("<phone>");
            writer.println(phone);
            writer.println("</phone>");

            System.out.println("** ZAPISANO PHONE **");

            writer.println("<name>");
            writer.println(name);
            writer.println("</name>");

            System.out.println("** ZAPISANO ANEM **");

            writer.println("<surname>");
            writer.println(surname);
            writer.println("</surname>");

            System.out.println("** ZAPISANO SURNAME **");

            writer.println("<email>");
            writer.println(email);
            writer.println("</email>");

            System.out.println("** ZAPISANO EMAIL **");

            writer.println("</person>");

            System.out.println("** ZAPISANO PERSON/KONTAKT **");
            writer.close();
        } catch (IOException e) {
            System.out.println("EXCEPTION OCCURED - IOException");
        }
    }
}
