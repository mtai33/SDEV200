public class Exercise10_14 {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        System.out.println("Date 1: Year=" + date1.getYear() + ", Month=" + date1.getMonth() + ", Day=" + date1.getDay());
        System.out.println("Date 2: Year=" + date2.getYear() + ", Month=" + date2.getMonth() + ", Day=" + date2.getDay());
    }
}
