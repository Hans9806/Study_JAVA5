package variable;

public class Var4 {
    public static void main(String[] args) {
        //두 변수의 값을 교환하기
        /*
        두 그릇의 내용물을 바꾸는 순서
        A 그릇에는 10ml의 물이 있고
        B 그릇에는 20ml의 음료가 있다.
        어떻게 하면 내용물을 바꿀 수 있을까
        1. C를 준비해서 A의 내용물을 옮기고 B를 A에 A를 B에 넣는 방법
        2.
        */
        int a = 10; //A그릇
        int b = 20; //B그릇
        int tem;    //빈 그릇

        tem = a;    //빈 그릇에 A그릇의 내용물을 옮긴다.
        a = b;      //B 그릇의 내용물을 A 그릇에 옮긴다.
        b = tem;    //임시의(tem)에서 B 그릇에 옮긴다.

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
