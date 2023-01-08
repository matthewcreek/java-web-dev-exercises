package exercises.chapter3;

public class ArrayPractice {
    public static void main(String[] args){
        int[] newArr = {1, 1, 2, 3, 5, 8};
//        for (int i = 0; i < newArr.length; i++){
//            System.out.println(newArr[i]);
//        }
        for (int i = 0; i < newArr.length; i++){
            if (newArr[i]%2 == 0){
                System.out.println(newArr[i]);
            } else continue;
        }
        String excerpt = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] excerptArr = excerpt.split(" ");
        System.out.println(java.util.Arrays.toString(excerptArr));
        String[] sentenceArr = excerpt.split("\\.");
        System.out.println(java.util.Arrays.toString(sentenceArr));
    }
}
