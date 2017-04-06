import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        String review = "오늘의 2번째 포스팅역시 맛집! 주말에 남자친구랑 너무 맛있게" +
                "먹고온 구로 초밥뷔페를 추천해드리려고하는데요!!" +
                "구로 초밥뷔페집의 이름은 스시메이진이라는 곳이에요^^♥";
        /*
        1. 스트링 단어 단위로 나누어 리스트 변환

        2. 리스트를 순회해서 전체 단어의 글자수의 평균을 구한다

        3. 단어가 5자리 이하인 새로운 리스트를 생성한다.
        */

        List<String> wordList = Arrays.asList(review.split(" "));
        List<String> under5Character = new ArrayList<>();

        int sum = 0;
        double average = 0.0;

        for(String e: wordList){
    //        System.out.println(e);
            if(e.length() <= 5){
                under5Character.add(e);
            }
            sum += e.length();
        }

        average = sum/(double)wordList.size();
        System.out.printf("wordAverage: %.1f\n", average);

        System.out.println("under5 word: ");
        for (String e: under5Character){
            System.out.println(e);
        }
    }
}

