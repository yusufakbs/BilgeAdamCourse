package supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierTest04 {
    public static void main(String[] args) {
        Stream.of("Java8","Supplier","Example")
                .forEach(name ->{
                    printNames(() -> name);
                });

        List<String> stringList = Stream.generate(SupplierTest04::createNewString)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(stringList);

    }

    private static void printNames(Supplier<String> supplier){
        System.out.println(supplier.get());
    }

    private static String createNewString(){
        return new String();
    }
}
