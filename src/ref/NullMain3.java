package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);

        //NullPointerException
        System.out.println("bigData.data.value=" + bigData.data.value);
    }
}
/**
 * bigData.count=0
 * bigData.data=null
 * Exception in thread "main" java.lang.NullPointerException: Cannot read field "value" because "bigData.data" is null
 * 	at ref.NullMain3.main(NullMain3.java:11)
 * */
