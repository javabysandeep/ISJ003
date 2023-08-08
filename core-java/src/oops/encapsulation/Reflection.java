package oops.encapsulation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) {
        Class<BankAccount> bankAccountClass = BankAccount.class;
        Field[] fields = bankAccountClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        Method[] methods = bankAccountClass.getMethods();
        for (Method method:methods) {
            System.out.println(method.getName());
        }
    }
}
