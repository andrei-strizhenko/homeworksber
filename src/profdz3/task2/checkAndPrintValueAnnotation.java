package profdz3.task2;

import java.lang.reflect.AnnotatedElement;

public class checkAndPrintValueAnnotation {
    public static void main(String[] args) {
        AnnotatedElement searchAnnotation = checkAnnotation.class;
        if(searchAnnotation != null) {
            System.out.print("Annotation found.The value is: ");
            System.out.println(searchAnnotation.isAnnotationPresent(IsLike.class));
        }else{
            System.out.println("Annotation not found!");
        }

    }
}
