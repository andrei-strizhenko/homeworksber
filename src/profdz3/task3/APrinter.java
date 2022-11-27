package profdz3.task3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class APrinter {
    public void print(int a) {
        System.out.println(a);
    }
    public static void main(String args[]) throws IllegalAccessException {

        try {
            Method method = APrinter.class.getMethod("print", int.class);
            System.out.print("Print number: ");
            int result = (Integer) method.invoke(new APrinter(), 1022555255);
            System.out.println(result);
        } catch (NullPointerException e) {   //|  | NoSuchMethodException | IllegalAccessException e) {
            System.out.println("A reference to a place in memory that is null!!");
        } catch (InvocationTargetException e){
            System.out.println("The problem with wrapping!!");
        }  catch (NoSuchMethodException e){
            System.out.println("The metod is not found!!");
        } catch (IllegalAccessException e){
            System.out.println("The method does not have access to the definition of the specified class, field, method, or constructor!!");
        }
    }
}


