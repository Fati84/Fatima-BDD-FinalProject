package tek.bdd.utility;

import java.util.Random;

public class DataProvider{

    public  String getRandomEmail() {
        Random random = new Random();
        String name = "Fati";
        String email = "@gmail.com";
        String num = "";
        for ( int i =0; i <= 4; i++) {
            num += (int) (Math.random() * 10);
        }

        return name + num + email;
    }
}

