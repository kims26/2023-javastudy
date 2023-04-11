package myutil;

public class MyLine {
	
	public static void draw_line() {
		System.out.println("-------------------------");
		
	}
	//over load (중복선언)
	public static void draw_line(int len) {
		
		for(int i=0; i<len; i++) {
			System.out.print('-');
		}
		System.out.println();
	
		
	}
	//over load (중복선언)
		public static void draw_line(char style,int len) {
			
			for(int i=0; i<len; i++) {
				System.out.print(style);
			}
			System.out.println();
		
			
		}
		    //Over load(중복선언) :call by Reference
			public static void draw_line(String pattern,int len) {
			
			for(int i=0; i<len; i++) {
				System.out.print(pattern);
			}
			System.out.println();
		
			
		}
			//*---*---*---*---*---*---*---*
			//MyLine.draw_line('*',1,'-',3,42)
			//**--**--**--**--**--**--**--**
			//MyLine.draw_line('*',2,'-',2,42)
			//***-***-***-***-***-***-***-***-
			//MyLine.draw_line('*',3,'-',1,42)
			
			public static void draw_line(char style1 , int  style_len1, 
										char style2 ,  int  style_len2,
										int total_len) {
				
				 for (int i = 0; i < style_len1; i++) { 
			            System.out.print(style1);
			        }
			        for (int i = 0; i < total_len - (style_len1 + style_len2); 
			        		i += (style_len1 + style_len2)) { 
			        	
			            for (int j = 0; j < style_len2; j++) { 
			                System.out.print(style2);
			                
			            }
			            for (int j = 0; j < style_len1; j++) { 
			                System.out.print(style1);
			            }
			        }
			        System.out.println(); 
			    }

			
			    
			}

			
				


