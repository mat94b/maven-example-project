import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertiesReturner {

    private Properties myProperty;
    private InputStream loadPropertiesStream;
    private String title;
    private int sizeX, sizeY;



    public PropertiesReturner(){
        InputStream loadPropertiesStream = this.getClass().getResourceAsStream("basic_properties.properties");
        Properties myProperty = new Properties();
        try {
            myProperty.load(loadPropertiesStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.title = myProperty.getProperty("title");
        this.sizeX = Integer.parseInt(myProperty.getProperty("sizeX"));
        this.sizeY = Integer.parseInt(myProperty.getProperty("sizeY"));
    }

    public String getTitleReturner(){
        return this.title;
    }

    public int getSizeXReturner(){
        return this.sizeX;
    }

    public int getSizeYReturner(){
        return this.sizeY;
    }
}
