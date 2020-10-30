 

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        
        for(String element:array){
            if(element==value){
                return true;
            }
                
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
         String [] expected =new String[array.length];
        int inc=0;
        for(int i=array.length; i>0; i--) {
        	
        	expected[inc]= array[i-1];
        	
        	inc++;
        }
        return expected;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        
		 String [] newarr= new String [array.length];
		 int inc=0;
	        for(int i=array.length; i>0; i--) {
	        	
	        	newarr[inc]= array[i-1];
	        	
	        	inc++;
	        }
	        
	       
	        for(int j=0;j<array.length;j++) {
	        	if(newarr[j]==array[j]) {
	        		return true;
	        	}
	        	
	        }
			
	        return false;
	        	 
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        char[] alphabet = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ".toCharArray();
	boolean test = false;
	for(String element:array) {
		for(int i=0; i<alphabet.length;i++) {
			
			String str = Character.toString(alphabet[i]);
			String newStr_noSpace= str.replace(" ", "");
			if(element.contains(newStr_noSpace)) {
				test=true;
				continue;
				
			}
			else {
				if( element.contains(str)) {
					test=true;
					continue;
				}
			}
		}
		
	}
	
	return test;
		
	
        
       
    
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter=0;
	for(int i=0;i<array.length;i++) {
		if(array[i]==value) {
			counter++;
		}
	}
    return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String [] newString = new String[array.length-1] ;
		int j=0;
		for(int i=0; i<array.length;i++) {
			
			if(array[i] !=valueToRemove) {
				
				newString[j++]=array[i];
				
			}
			
		}
        return newString;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
