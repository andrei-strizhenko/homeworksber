package profdz3.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ReflectionInterface {

    interface first {
    }

    interface second {
    }

    class classC implements first {
    }

    class classB extends classC implements first {
    }

    class classA extends classB implements second {
    }

    public static void main(String[] args) {
        System.out.println("All Interface is found:  ");

        // интерфейсы
        List<Class<?>> interfaces = getAllInterfaces(classA.class);
        for (
                Class<?> anInterfaces : interfaces) {
            System.out.println(anInterfaces.getSimpleName());
        }
    }

    public static List<Class<?>> getAllInterfaces(Class<?> cls) {
        List<Class<?>> interfaces = new ArrayList<>();
        while (cls != Object.class) {
            interfaces.addAll(Arrays.asList(cls.getInterfaces()));
            cls = cls.getSuperclass();
        }
        return interfaces;
    }
}



