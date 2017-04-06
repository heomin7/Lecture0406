import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class ArrayListExampleFunctionVersion {
    public static void main(String[] args){
        String review = "오늘의 2번째 포스팅역시 맛집! 주말에 남자친구랑 너무 맛있게" +
                "먹고온 구로 초밥뷔페를 추천해드리려고하는데요!!" +
                "구로 초밥뷔페집의 이름은 스시메이진이라는 곳이에요^^♥";

        List<String> wordList = Arrays.asList(review.split(" "));
        List<String> under5Character = new ArrayList<>();

        int sum = 0;
        double average = 0.0;

        average = GetAverage(wordList);
        under5Character = Under5WordListMaker(wordList);

        System.out.println("average: " + average);
        for(String e: under5Character){
            System.out.println(e);
        }

    }

    public static double GetAverage(List<String> wordList){
        int sum = 0;

        for(String e: wordList){
            sum += e.length();
        }

        double average = sum/(double)wordList.size();

        return average;
    }

    public static List<String> Under5WordListMaker(List<String> wordlist){
        List<String> under5character= new ArrayList<>();

        for(String e: wordlist){
            System.out.println(e);
            if(e.length() <= 5) under5character.add(e);
        }

        return under5character;
    }
}
