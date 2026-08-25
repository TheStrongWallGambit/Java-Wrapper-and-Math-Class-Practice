public class Assignment {

    public static void main(String[] args) {
        Integer int1 = 16;
        Integer int2 = 45;

        Double double1 = 7.5;
        Double double2 = 6.7;

        System.out.println(int1.intValue());
        System.out.println(int1.compareTo(int2));
        System.out.println(int1.equals(int2));
        System.out.println(int1.toString());
        System.out.println(Integer.parseInt("100"));
        System.out.println(Integer.valueOf(55));
        System.out.println(Integer.compare(int1, int2));
        System.out.println(Integer.MAX_VALUE);

        System.out.println(double1.doubleValue());
        System.out.println(double1.equals(double2));
        System.out.println(double1.compareTo(double2));
        System.out.println(double1.toString());
        System.out.println(Double.parseDouble("6.82"));
        System.out.println(Double.valueOf(5.6));
        System.out.println(Double.compare(double1, double2));
        System.out.println(double1.isNaN());
    }
}