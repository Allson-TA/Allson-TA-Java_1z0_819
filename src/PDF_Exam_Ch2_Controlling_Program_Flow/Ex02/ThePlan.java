package PDF_Exam_Ch2_Controlling_Program_Flow.Ex02;

public class ThePlan {
	
        var plan=1;
        
        plan=plan++ + --plan;
        
        if(plan==1){
        	
            System.out.print("Plan A");
            
        }else{ if(plan==2) System.out.print("Plan B");
        
        }else System.out.print("Plan C");}
    }
}



/*
What is the output of the following application?
以下應用程序的輸出是什麼？


A. Plan A
B. Plan B
C. Plan C
D. The class does not compile
E. None of the above
*/
