package java8features.lambda;

@FunctionalInterface
public interface NumberProcessor {
    int process(int number);//SAM

    public static void main(String[] args) {
        NumberProcessor reference = number -> number * number;
        //(int number) -> {return number*number;};
        //( number) -> {return number*number;};
        //(number) -> number * number;
        //number -> number * number
        System.out.println(reference.process(12));

        NumberProcessor cube = number -> number * number * number;
        System.out.println("Cube "+cube.process(10));


    }
}
