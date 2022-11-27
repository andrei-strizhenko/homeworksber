package profdz3.task1;

public class MyAnnotation {

    public static void annotation(Class<checkAnnotation> ann) {
        IsLike annotation = checkAnnotation.class.getAnnotation(IsLike.class);
        System.out.println("Annotation message: " + annotation.check());
    }


    public static void main(String[] args) {
        annotation(checkAnnotation.class);
    }
}
