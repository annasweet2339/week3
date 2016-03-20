import java.util.*;
public class StudentName{

	public static void main(String arg[])
	{
		String student,check;
		HashMap transcript = new HashMap();
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.print("輸入學生名子:(-1結束)");
			student = in.next();
			if(student.equals("-1"))
				break;
			System.out.print("輸入學生成績:");
			float grade = in.nextFloat();
			transcript.put(student, grade);
		}
		
		while(true)
 		{
 			System.out.print("學生姓名(-1:out) : ");
 			check=in.nextLine();
 			if(check.equals("-1"))
				break;
			else
 			{
 				if(transcript.get(check)==null)
 				{
 					System.out.println("No Found");
 				}
 				else
 				{
					student = check;
 					System.out.println("學生成績: "+transcript.get(student));
 				}
 			}
 		}
	
	
	}




}