public class SkillDemo{
    public static int countInstanceOf(String word, String find){
        int index=0, counter=0;
        while(index < word.length() && word.indexOf(find, index)!=-1){
            counter++;
            index = word.indexOf(find, index) + find.length();
        }
        return counter;
    }
}
