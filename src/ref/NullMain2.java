package ref;

public class NullMain2 {

    public static void main(String[] args) {
        Data data = null;
        data.value = 10;// NullPointerException 예외 발생
        System.out.println("data = " + data.value);
    }
}

/**
 * Exception in thread "main" java.lang.NullPointerException: Cannot assign field "value" because "data" is null
 * 	at ref.NullMain2.main(NullMain2.java:7)
 * */