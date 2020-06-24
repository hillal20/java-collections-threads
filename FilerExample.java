import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilerExample {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("foo", "boo", "kill", "dill");
        List<String> objects = Arrays.asList("foo", "boo", "kill", "dill");

        // the classical way of doing it
        for (String name : names){
            System.out.println("name ===> "+ name);
        }

        // using the streams
        names.stream().forEach( (n) -> {
            System.out.println("n ==>"+ n);

        });


        // filter
       List<String>  x =  names.stream().filter( (f) -> {
           return f == "kill";
       }).collect(Collectors.toList());

        System.out.println("x ==> "+ x );
        System.out.println(Gender.FEMALE);

        // x :: y  operator in Java means the method y() in the class x
        names.forEach(System.out:: println);


        // threads
       try {Thread.sleep(5000);}catch (Exception e){
           System.out.println(e);
       }
        System.out.println("after sleep");
    }
}