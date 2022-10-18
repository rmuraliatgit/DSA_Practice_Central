public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'z';
        System.out.print(nextGreatestLetter(letters, target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {

        char answer = ' ';

        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        int indexOfTarget = alphabets.indexOf(target);

        int x = 0;
        for (int i = 0; i < letters.length; i++) {
            int temp = alphabets.indexOf(letters[i]);
            if(temp>indexOfTarget)return letters[i];
        }
        return letters[0];
    }
}
