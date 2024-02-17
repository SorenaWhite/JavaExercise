package L9M_C;

class Error {
    private String[] msg = {
        "Output error",
        "Input error",
        "Disk full",
        "Index Out-Of-Bounds"
    };

    String getMessage(int i) {
        if(i >=0 && i<msg.length) return msg[i];
        else return "Invalid Error Code";
    }
}

public class ErrorMessage {
    public static void main (String [] args) {
        Error error = new Error();
        System.out.println(error.getMessage(0));
        System.out.println(error.getMessage(3));
        System.out.println(error.getMessage(20));
    }
}
