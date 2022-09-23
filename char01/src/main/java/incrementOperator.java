public class incrementOperator {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

//  ++x : 다른 연산식 전에 값을 1 증가 시킨다.
//  y-- : 다른 연산식 후에 값을 1 감소 시킨다.

        int z = (++x) + (y--); //31
        System.out.println(z);
// 때문에 z = ( 21 )+ 10 이기 때문에 31이라는 결과값이 출력된다.


    }
}
