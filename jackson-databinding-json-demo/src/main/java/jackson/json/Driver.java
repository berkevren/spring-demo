package jackson.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {

        try {

            ObjectMapper objectMapper = new ObjectMapper();

            //read JSON file and map/convert to Java POJO:
            //data/sample-lite.json
            Student student = objectMapper.readValue(
                    new File("data/sample-full.json"), Student.class);

            System.out.println("First name: " + student.getFirstName());
            System.out.println("Last name: " + student.getLastName());

            Address address = student.getAddress();
            System.out.println("Street: " + address.getStreet());
            System.out.println("City: " + address.getCity());

            for (String language: student.getLanguages()) {
                System.out.println(language);
            }
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }

    }

}
