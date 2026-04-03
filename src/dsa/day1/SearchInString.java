package dsa.day1;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Nakshatra";
        char target = 'a';
        System.out.println(searchForChar(str, target));
    }

    static boolean searchForChar(String str, char target){
        if(str.length() == 0){ // can use 'str.isEmpty()'
            return false;
        }
        //method one
//        for(int i = 0 ; i < str.length(); i++){
//            if(str.charAt(i) == target){
//                return  true;
//            }
//        }

        //method two
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }

        return false;
    }

}
