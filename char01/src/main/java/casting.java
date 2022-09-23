public class casting {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;

/* a / b 앞에 (double)을 붙여주지 않을 경우 결과값으로 2가 d에 대입되는데,
그 이유는 a , b 는 정수기 때문에 '/'연산시 결과값이 5/2 의 몫인 2가 나오기 때문이다.
때문에 실수형 double 로 a, b 둘 중 하나라도 casting 해줌으로서 d의 값을 5로 만들 수 있다.
 */

        double c =  (double) a / b;

        int d = (int)(c * b);
        System.out.println(d);

    }
}
