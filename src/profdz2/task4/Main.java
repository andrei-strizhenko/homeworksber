package profdz2.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        Document d1 = new Document(0,"Регламент №1", 305);
        Document d2 = new Document(1, "Регламент №2", 7);
        Document d3 = new Document(2, "Регламент №3", 15);
        Document d4 = new Document(3, "Регламент №4", 162);
        List<Document> doc = new ArrayList<>();
        doc.add(d1);
        doc.add(d2);
        doc.add(d3);
        doc.add(d4);

     //   document.organizeDocuments(doc);


       System.out.println("Enter the document Id: ");
       Map<Integer, Document> ourMap = document.organizeDocuments(doc);


      //  System.out.println(ourMap.entrySet());




    //    Scanner scanner = new Scanner(System.in);
    //    int chooseId = scanner.nextInt();



       // Document chooseDoc = ;
     //  System.out.println(ourMap.get(chooseId).getName());

    }
}
