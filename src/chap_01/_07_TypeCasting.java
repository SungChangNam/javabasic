package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형 에서 실수형으로
        // 실수형 에서 정수 형으로

        // int to float, double
        int score = 93;

        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        // float , double to int

        float score_f = 93.3f;
        double score_d = 98.8;


        System.out.println((int) score_f); // 93
        System.out.println((int) score_d); // 98

        // 정수 + 실수 연산

        score  = 93 + (int) 98.8;
        System.out.println(score); // 191


        score_d =  (double) 93 + 98.8; //double 자동으로 변환되기 때문에 사용안해도됨
        System.out.println(score_d); // 191.8


        // 변수에 형변환된 데이터 집어 넣기
        double convertedScoreDouble = score; //191 - > 191.0
        // int -> long -> float -> double (자동 형변환) 작

        int convertedScoreInt = (int) score_d; //191.8 -> 191
        // double -> float -> long -> int (수동 형변환)

        // 숫자를 문자열로
        String  s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1); // 93 String

        String s2 = String.valueOf(98.8);
        s2 =Double.toString(98.8);
        System.out.println(s2); // 98.8 String

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);// 정수형
        double d = Double.parseDouble("98.8"); //문자열 을 실수형으로 변환
        System.out.println(d); // 98.8

        int error = Integer.parseInt("java"); //올바른 데이터가 아닐경우
        System.out.println(error);



    }
}
