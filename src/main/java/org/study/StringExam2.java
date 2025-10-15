package org.study;

public class StringExam2 {

    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = str1.substring(5);    // 5번째부터 잘라서 새로운 문자열 반환
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1 + str2;
        System.out.println(str3);

        // + 연산자를 수행했지만 java는 내부적으로 StringBuffer 클래스를 생성한다.
        // StringBuffer가 갖고 있는 메서드인 append를 이용해서 str을 붙여주고, 스트링을 리턴하는 toString 메서드를 수행해서 String으로 변환해서 전달한다.
        // 즉, 문자열을 +로 붙이게 되면 항상 StringBuffer 객체가 만들어지게 된다.
        String str4 = new StringBuffer().append(str1).append(str2).toString();
        System.out.println(str4);

        String str5 = "";
        for (int i = 0; i < 100; i++) {
            str5 = str5 + "*";
        }

        System.out.println(str5);
        // new 연산자로 새로운 객체를 만들어 낼 수록 속도가 느려진다.
        // 따라서 StringBuffer의 append를 적절히 사용해서 수행하는 것이 효과적이다.
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            sb.append("*");
        }
        String str6 = sb.toString();
        System.out.println(str6);
    }
}
