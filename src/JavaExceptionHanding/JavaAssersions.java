package JavaExceptionHanding;

public class JavaAssersions {
    public static void main(String args[]) {
        String[] weekends = {"Friday", "Saturday", "Sunday"};
        assert weekends.length == 3 : "There are only 2 weekends in a week";
        System.out.println("There are " + weekends.length + "  weekends in a week");
    }
}
