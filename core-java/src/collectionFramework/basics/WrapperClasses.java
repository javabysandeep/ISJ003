package collectionFramework.basics;

public class WrapperClasses {
    public static void main(String[] args) {
        byte primitiveValue = 100;

        Byte wrapper1 = new Byte(primitiveValue); // explicit boxing --> convert primitive into object
        Byte wrapper2 = primitiveValue;// implicit boxing --> autoboxing
        System.out.println("Primitive " + primitiveValue);
        System.out.println("Byte wrapper value "+wrapper1);
        System.out.println("Byte wrapper value "+wrapper2);


        float floatValue = wrapper1.floatValue();
        System.out.println("Byte is converted into float "+floatValue);

        String byteStringValue = wrapper1.toString();
        System.out.println(byteStringValue);

    }
}
