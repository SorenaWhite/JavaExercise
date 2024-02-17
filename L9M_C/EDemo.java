package L9M_C;

class E {
    String message;
    int severity;
    E(String m, int s) {
        message = m;
        severity = s;
    }
    public String toString() {
        return message + " with a severity of " + severity;
    }
}

class EInfo {
    private String[] message = {
        "Output error",
        "Input error",
        "Disk full",
        "Index Out-Of-Bounds"
    };

    E getE(int i) {
        if (i >= 0 && i<message.length) return new E(message[i], 2);
        else return new E("Invalid Error Code", 0);
    }
}

public class EDemo {
    public static void main (String [] args) {
        EInfo error = new EInfo();
        System.out.println(error.getE(2));
        System.out.println(error.getE(0));
    }
}

