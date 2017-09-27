package frames;


import org.apache.commons.lang3.RandomStringUtils;

public class RandomGenerator {

    private String name, phone, surname, email;

    public RandomGenerator(){

        this.name = RandomStringUtils.randomAlphabetic(10);
        this.surname = RandomStringUtils.randomAlphabetic(12);
        this.phone = RandomStringUtils.randomNumeric(9);

        String h1 = RandomStringUtils.randomAlphabetic(5);
        String h2 = RandomStringUtils.randomAlphabetic(6);

        this.email = h1+ "@" +h2+ ".com";
    }

    public String getName(){
        return this.name;
    }

    public String getPhone(){
        return this.phone;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getEmail(){
        return this.email;
    }


}
