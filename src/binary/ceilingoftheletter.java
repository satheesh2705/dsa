public class ceilingoftheletter {
    
    /*
     * ASCII characters
     * a-97
     * b-98
     * c-99
     * d-100
     * e-101
     * f-102
     * g-103
     * h-104
     * i-105
     * j-106
     * 
     */
        public static void main(String args[]){
            char letter[]  = {'a','b','c','e','f','j','s','z'};
//        	char letter [] = new char [2];
            char target = 'z';
        
            char ch = (char) ceilingSearch(letter,target);
            System.out.println("ans is : "+ch);   
         	        
        }

    static int ceilingSearch(char letter[],  char target){      
    
            int start = 0;
            int end = letter.length-1;
        
            while( start <= end ){
    
                int mid = (start + end)/2;   
                
                if (  target < letter[mid]  ){
                       end =  mid - 1;
                   }
                   else{
                       start = mid + 1;
                }
    
            }

            return letter[start % letter.length];
        }
        
    }
    

