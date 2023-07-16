public class MyString implements IString{
    public boolean isConsonant(String str){
        int count =0;
        for(int i=0; i < str.length();i++){
            if(Character.isLetter(str.charAt(i)) && str.charAt(i) != 'u'
                    && str.charAt(i) != 'e' && str.charAt(i) != 'o'&& str.charAt(i)
                    != 'a'&& str.charAt(i) != 'i' ){
                count++;
            }
        }
        if(count >= 2) return true;
        return false;
    }

    @Override
    public int f1(String str) { 
        int count = 0;
        String[] words = str.split(" ");
        for(int i =0; i < words.length; i++){
            if(isConsonant(words[i])){
                count++;
            }
        }
        return count;
    }
    public boolean checkAppear(String str){
        for(int i=0; i < str.length();i++){
            for(int j=i+1; j < str.length(); j++){
                if(str)
            }
        }
    }
    @Override
    public String f2(String str) {
        String result = "";
        for(int i=0; i < str.length();i++){
            if()
        }
        return null;
        
    }
    
}
