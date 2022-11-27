package profdz2.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Document> doc = new ArrayList<>();
        doc.add(new Document(1, "\"Регламент №8\"", 305));
        doc.add(new Document(2, "\"Регламент №13\"", 7));
        doc.add(new Document(3, "\"Регламент №5\"", 15));
        doc.add(new Document(4, "\"Регламент №6\"", 162));


        System.out.println("Enter the document Id: ");
        Map<Integer, Document> ourMap = Document.organizeDocuments(doc);

        Scanner scanner = new Scanner(System.in);
        int chooseId = scanner.nextInt();

        ourMap.forEach((key, value) -> {  // search by id
            if (key == chooseId) {
                System.out.print("Id " + key + ":  " + value.getName() + " страница " + value.getPageCount());
            }
        });
    }
}
