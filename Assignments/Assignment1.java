// Class 4 : Assignments

public class Assignment1{
    public static void main(String[] args) {

        String[] newsOutlet = {"abc", "bbc", "CNN", "CBS", "AP", "NBC", "FOX", "npr", "Sky", "AlJazeera"};

        System.out.println("Longest Name: " + findLongestName(newsOutlet));

    }

    public static String findLongestName(String [] names){
        int sizeOfArray = names.length;
        int longestNameIndex = 0;
        for(int count = 1; count < sizeOfArray; count++){
            int sizeOfString = names[count].length();
            if(longestNameIndex < sizeOfString) {
                longestNameIndex = sizeOfString;
            }
        }
        return names[longestNameIndex];
    }
}
