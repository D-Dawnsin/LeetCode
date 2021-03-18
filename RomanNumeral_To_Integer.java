class Solution {
    public int romanToInt(String s) {
        
        int i;
        int number = 0;
        int answer = 0;

        //Think work backwards for roman numerals since that way you can account for things like "IV" = 4 and not 6
        for(i = s.length()-1; i >= 0; i--){  
            
            char sub = s.charAt(i);
                
            switch(sub){
                case 'I': number = 1; break;
                case 'V': number = 5; break;
                case 'X': number = 10; break;
                case 'L': number = 50; break;
                case 'C': number = 100; break;
                case 'D': number = 500; break;
                case 'M': number = 1000; break;
            }
            
            //This is multiplied by 4 because the tiniest gap between numbers is from 1 to 5 (which is 4)
            //So if V = 5 = number / number * 4 = 20 !< answer = 0 / so now answer = 5
            // I = 1 = number / number * 4 = 4 < answer = 5 / so now answer  = answer - number = 5-1 = 4 
            if(number * 4 < answer)
                answer -= number;
            else
                answer += number;
            
        }
        
        return answer;
            
    }
        
}
