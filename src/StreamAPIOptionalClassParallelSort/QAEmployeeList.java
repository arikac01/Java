package StreamAPIOptionalClassParallelSort;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QAEmployeeList {
    private int id;
    private String name;
    private double salary;
    private String city;

    public QAEmployeeList(int id, String name, double salary, String city) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public String getCity(){
        return city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", city=" + city +
                '}';
    }

    public static void main(String[] args) {
        // Create a list of employees
        List<QAEmployeeList> employees = new ArrayList<>();
        employees.add(new QAEmployeeList(1, "Alice", 50000, "c"));
        employees.add(new QAEmployeeList(2, "Bob", 60000, "a"));
        employees.add(new QAEmployeeList(3, "Charlie", 55000, "b"));

        // Print the list of employees
        for (QAEmployeeList emp : employees) {
            System.out.println(emp);
        }

        //employee list - find out the highest salary, find the employee by city or department
        //by id

        Optional<QAEmployeeList> highsalary = employees.stream().max((e1, e2)->Double.compare(e1.getSalary(),e2.getSalary()));
        System.out.println("highest salary: "+highsalary.get());

        List<QAEmployeeList> filterCity = employees.stream().filter(x -> x.getCity().equals("c")).collect(Collectors.toList());
        System.out.println("Filter by City: where city is C" + filterCity);

        List<QAEmployeeList> filterId = employees.stream().filter(x -> x.getId()==2).collect(Collectors.toList());
        System.out.println("Filter by ID: "+ filterId);

        /*
Integer List  -> duplicate and unique elements -> output in Map key as number, value as occurance
String of Array -> letter occurence ->bharathmathakijai, java,
Iamnotmad
 */

        List<Integer> li = Arrays.asList(5,3,5,4,3,7,4,6);
        Map<Integer, Long> occurrenceMap = li.stream()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()));
        occurrenceMap.forEach((num, count) -> System.out.println(num + "\t" + count));

        String s[] = {"java","python","javascript","java","javascript","c","cpp","c"};
        Map<String, Long> oM = Arrays.stream(s)
                .collect(Collectors.groupingBy(string -> string, Collectors.counting()));
        oM.forEach((val, count) -> System.out.println(val + ": " + count));

        String s1 = "bharathmathakijai";
        String[] s4 = s1.split("");
        Map<String, Long> oS = Arrays.stream(s4)
                .collect(Collectors.groupingBy(string -> string, Collectors.counting()));
        oS.forEach((val, count) -> System.out.println(val + ": " + count));
    }
}

