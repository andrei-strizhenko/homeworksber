package profdz2.task4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Document {
    private int id;
    private String name;
    private int pageCount;


    public Document(Integer id, String name, Integer pageCount) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static Map<Integer, Document> organizeDocuments(List<Document> documents) {
        Map<Integer, Document> map = new HashMap<>();
        for (Document document : documents) {
            map.put(document.getId(), document);
        }
        return map;
    }

}