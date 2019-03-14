import java.io.*;

public class SecuritySystem {
    public void checkSecurity(String[] people) throws IOException {
        sendAlert(people);
        String found = foundPerson(people);
        someLaterCode(found);
    }

    private void sendAlert(String[] people) {
        String person = foundPerson(people);
        if (!person.equals("")) {
            sendAlert(person);
        }
    }

    private String foundPerson(String[] people) {
        for (String person : people) {
            if (person.equals("Don")) {
                return "Don";
            }
            if (person.equals("John")) {
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
