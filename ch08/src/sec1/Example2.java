package sec1;

public class Example2 {

    public static void main(String[] args) {

        String num = "1004임창균";
        int parNum;

        try {
            parNum = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("원인 불명 예외");
            e.printStackTrace();
        }

    }

}