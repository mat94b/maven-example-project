package frames;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchContact {

    private String phone;
    private String recName;
    private String recSurname;
    private String recEmail;
    private String fileContent;

    public SearchContact(String phone) throws FileNotFoundException {
        this.phone = phone;
        openFile();
        new MessageDialog(phone, recName, recSurname, recEmail);
    }


    private void openFile() throws FileNotFoundException {
        try {
            Scanner scaner = new Scanner(new File("./target/"+this.phone + ".xml"));
            System.out.println("** OTWARTO PLIK POMYSLNIE **");
            int counter = 0;
            while (scaner.hasNextLine()) {
                ++counter;
                fileContent = scaner.nextLine();
                if(counter == 6){
                    recName = fileContent;
                }
                else if(counter == 9){
                    recSurname = fileContent;
                }
                else if(counter == 12){
                    recEmail = fileContent;
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("NIE ODNALEZIONO TAKIEGO PLIKU");
        }
    }
}
