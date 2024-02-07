package variable;

public class Print1 {
    public static void main(String[] args) {
        // 시스템 출력장치로 매개변수를 출력하고, 행을 변경하라.
        System.out.println("println");   // 행을 변경하고 출력
        System.out.println("println");
        System.out.print("print");     // 행을 변경하지 않고 출력
        System.out.print("print");     // 행을 변경하지 않고 출력

        System.out.printf("이름 : %s", "홍길동");    // 형식 문자열 출력

        /*  자주 사용되는 형식 문자열
            %s : %10s 열자리 문자열 형식
            %d : %10d 열자리 정수
            %f : %10f 열자리 실수
         */
        System.out.printf("%10s", "홍길동");
        System.out.printf("%10d", 100);
        System.out.printf("%10f", 10.0);    //기본 소수점 자리 6자리
    }
}
