public class Loops {
    public static void main(String[] args) {

        // 반복문
        // 1. for
        // 초기화된 변수, 조건식, 증감식

        for (int i = 0; i < 10; i=i+2) {
            System.out.println(i);
        }


        // 2. while
        int b = 10;

//        while(b > 0){
//            System.out.println(b);
//            b--;
//        }
        do{
            System.out.println(b);
            b--;
        } while(b > 0);

    }
}
