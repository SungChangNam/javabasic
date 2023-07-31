package chap_02;
// 키가 115cm 이므로 탑승 불가 합니다.
// 키가 120cm 이므로 탑승 가능 합니다.

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 121;
        String result = (height >=120)? ("탑승 가능 합니다") : ("탑승 불가능 합니다");
        System.out.println("키가 " +height+ " cm 이므로 "+result);

        height = 115;
        String result2 = (height >=120)? ("탑승 가능 합니다") : ("탑승 불가능 합니다");
        System.out.println("키가 " +height+ " cm 이므로 "+result2);



        System.out.println();
    }

}
