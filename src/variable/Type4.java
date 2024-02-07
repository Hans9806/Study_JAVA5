package variable;

public class Type4 {
    public static void main(String[] args) {
        // 강제 타입 변환 Casting
        // 큰 타입을 작은 타입으로 강제로 나눠서 저장하는 것
        int i = 10;
       // byte b = i;     //작은 타입으로 강제로 변환, 캐스팅 연산자 사영
        byte b = (byte) i;

        double d = 3.14;
        int i2 = (int) d;
        System.out.println("i2 = " + i2);
        //신수 타입이 정수 타입으로
    }
}
