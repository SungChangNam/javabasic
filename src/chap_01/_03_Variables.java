package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "고객님";
        int hour = 15;
        System.out.println(name + ", 배송이 시작됩니다. "+ hour +"시에 방문 예정입니다");
        System.out.println(name + ", 배송이 완료 되었습니다.");

        double score = 90.5;
        char grade = 'A'; //한개 문자 표현 할때 사용
        name = "하위";

        System.out.println(name+ "님의 평균 점수는" +score+ "접입니다");
        System.out.println("학점은 " +grade+ "입니다");

        boolean pass = true;
        System.out.println("이번 시험에 합격 했을까요?" +pass);


        double d =3.1412345666; ///정밀 소수점 표현
        float f =3.1412345667F; ///double 보다는 정밀 하지 않음

        System.out.println(d);
        System.out.println(f);
        long l = 10000000000L; //범위 가 21억 이상이면 long 사용
        l = 1_000_000_000L;
        System.out.println(l);


    }
}
