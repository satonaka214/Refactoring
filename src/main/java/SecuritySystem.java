import java.io.*;

public class SecuritySystem {
    public void checkSecurity(String[] people) throws IOException {
        String found = foundMiscreant(people);
        someLaterCode(found);
    }

    private String foundMiscreant(String[] people) {
        for (String person : people) {
            if (person.equals("Don")) {
                sendAlert(person);
                return "Don";
            }
            if (person.equals("John")) {
                sendAlert(person);
                return "John";
            }
        }

        return "";
    }

    private void sendAlert(String person) {
        System.out.println(person + " alert!!!!!!!");
    }

    private void someLaterCode(String name) throws IOException {
        if (name.isEmpty()) return;

        try (FileWriter filewriter = new FileWriter("list.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(filewriter)) {
            bufferedWriter.write(name);
        }
    }
}
