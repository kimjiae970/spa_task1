public class diceGame {
    public static void main(String[] args) {

// 주사위의 두 수를 받을 변수 a ,b 선언
        int a =0;
        int b =0;

        System.out.println("시작 !");
// 두 수의 합이 5가 아닐 때 동안 반복문 이행
        while(a + b != 5) {
// Math.random ( 1 ~ 6 까지의 범위 ) -> 정수형(int)
            a = (int)(Math.random() * 6)+1;
            b = (int)(Math.random() * 6)+1;

            System.out.println("("+ a +","+b+" )");

        }
        System.out.println("끝 !");
    }
}
