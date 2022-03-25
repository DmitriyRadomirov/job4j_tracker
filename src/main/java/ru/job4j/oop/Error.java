package ru.job4j.oop;

 public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
                 this.active = active;
                 this.status = status;
                 this.message = message;
    }

     public void printInfo() {
         System.out.println(active);
         System.out.println(status);
         System.out.println(message);
         System.out.println();
     }

    public static void main(String[] args) {
        Error error = new Error();
        Error error0 = new Error(true, 17, "Good!!!");
        Error error1 = new Error(false, 5, "Bag");
        Error error2 = new Error(true, 1, "!!!");
        error.printInfo();
        error0.printInfo();
        error1.printInfo();
        error2.printInfo();
    }
}