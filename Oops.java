import java.io.*;
import java.util.StringTokenizer;

class Oops {
    public static void main(String[] args) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader("file1.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("file2.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("combined_file.txt"));

            writer.write("===========================\n");
            writer.write("ID\tAge\tName\n");
            writer.write("===========================\n");

            String line1, line2;
            while ((line1 = reader1.readLine()) != null && (line2 = reader2.readLine()) != null) {
                StringTokenizer tokenizer1 = new StringTokenizer(line1);
                StringTokenizer tokenizer2 = new StringTokenizer(line2);

                String id1 = tokenizer1.nextToken();
                String age = tokenizer1.nextToken();
                String id2 = tokenizer2.nextToken();
                String name = tokenizer2.nextToken();

                if (id1.equals(id2)) {
                    writer.write(id1 + "\t" + age + "\t" + name + "\n");
                } else {
                    System.out.println("Mismatched IDs: " + id1 + " and " + id2);
                }
            }

            reader1.close();
            reader2.close();
            writer.close();

            System.out.println("Combined file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
