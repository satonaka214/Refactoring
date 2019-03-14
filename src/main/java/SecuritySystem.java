import java.io.*;

public class SecuritySystem {
    public void checkSecurity(String[] people) throws IOException {
        sendAlert(people);
        String found = foundPerson(people);
        someLaterCode(found);
    }

    private void sendAlert(String[] people) {
        for (String person : people) {
            if (person.equals("Don")) {
                sendAlert(person);
                foundPerson(people);
                return;
            }
            if (person.equals("John")) {
                sendAlert(person);
                foundPerson(people);
                return;
            }
        }

        foundPerson(people);
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
