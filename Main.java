import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Welcome to Assignment Two of CSC 300 - Alex Jeter\n\n");
		
		System.out.println("Please enter your first value.");
		String val1 = scnr.next();
		System.out.println("Please enter your second value.");
		String val2 = scnr.next();
		
		
		int count1 = 0, count2 = 0; 	// Period counter
		int nums1 = 0, nums2 = 0;		// number counter
		int lets1 = 0, lets2 = 0;		// Letter counter
		
		
		for(int i = 0; i < val1.length(); i++) {
			if(!(Character.isDigit(val1.charAt(i)))) {
				lets1++;
			}
			if(val1.charAt(i) == '.') {
				count1++;
				
			}
			if(Character.isDigit(val1.charAt(i))) {
				nums1++;
			}
			
		}
		

		for(int i = 0; i < val2.length(); i++) {
			if(!(Character.isDigit(val2.charAt(i)))) {
				lets2++;
			}
			if(val2.charAt(i) == '.') {
				count2++;
				
			}
			if(Character.isDigit(val2.charAt(i))) {
				nums2++;
			}
		}
		
		
		if(nums1 == val1.length() && nums2 == val2.length()) {
		    int curr = 0;
		    int num = 0;
		    int result = 0;
		    for(int i = 0; i <= val1.length() - 1; i++){
		      num = 0;
		      curr = val1.charAt(i);
		      num = (curr - 48);
		        for (int j = val1.length() - 1; j > i; j--){
		          num *= 10;
		        }
		      result += num;
		    }
			int int1 = result;
			
		    curr = 0;
		    num = 0;
		    result = 0;
		    for(int i = 0; i <= val2.length() - 1; i++){
		      num = 0;
		      curr = val2.charAt(i);
		      num = (curr - 48);
		        for (int j = val2.length() - 1; j > i; j--){
		          num *= 10;
		        }
		      result += num;
		    }
			int int2 = result;
			addStuff(int1,int2);
		}
		else if(count1 == 1 && count2 == 1 && lets1 == 1 && lets2 == 1) {
			
			int counter1 = 0;
			int counter2 = 0;
			boolean dotFlag = false;
			for(int i = 0; i < val1.length(); i++){
	        if(dotFlag){
	          counter2++;
	          continue;
	        }
	        if(val1.charAt(i) == '.'){
	          dotFlag = true;
	          continue;
	        }
	        counter1++;
	      }
	      
	
	      double num = 0;
	      double curr = 0;
	      double result = 0;
	      for(int i = 0; i < counter1; i++){
	        
	
	        curr = val1.charAt(i);
	        num = curr - 48;          
	        for(int j = counter1; j > i + 1; j--){
	          num *= 10;
	        }
	        result += num;
	
	      }
	      int a = 1;
	
	      for(int i = counter1 + 1; i < counter2 + counter1 + 1; i++){
	
	        curr = val1.charAt(i);
	        num = curr - 48;
	
	        for(int j = 0; j < a; j++){
	          num /= 10;
	        }
	        result += num;
	        a++;
	      }
	      double flt1 = result;
				
	      counter1 = 0;
	      counter2 = 0;
	      dotFlag = false;
	      for(int i = 0; i < val2.length(); i++){
	        if(dotFlag){
	          counter2++;
	          continue;
	        }
	        if(val2.charAt(i) == '.'){
	          dotFlag = true;
	          continue;
	        }
	        counter1++;
	      }
	      
	
	      num = 0;
	      curr = 0;
	      result = 0;
	      for(int i = 0; i < counter1; i++){
	        
	
	        curr = val2.charAt(i);
	        num = curr - 48;          
	        for(int j = counter1; j > i + 1; j--){
	          num *= 10;
	        }
	        result += num;
	
	      }
	      a = 1;

      for(int i = counter1 + 1; i < counter2 + counter1 + 1; i++){

        curr = val2.charAt(i);
        num = curr - 48;

        for(int j = 0; j < a; j++){
          num /= 10;
        }
        result += num;
        a++;
      }
      double flt2 = result;
			
			addStuff(flt1,flt2);
		}
		else {
			addStuff(val1,val2);		
		}
		
		
	}


	public static void addStuff(int num1, int num2) {
		
		System.out.println("The sum is: " + (num1 + num2));
		
	}
	
	public static void addStuff(double num1, double num2) {
		
		System.out.println("The sum is: " + (num1 + num2));
		
	}
	
	public static void addStuff(String str1, String str2) {
		
		System.out.println("The sum is: " + (str1 + str2));
		
	}
}
