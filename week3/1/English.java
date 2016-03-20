	import java.util.*;
class English {
	public static void main(String[] args) {
		/*String str = "aaa-bbb-ccc.ddd";
		String[] tokens = str.split("-|\\.");
		for (String token:tokens) {
			System.out.println(token);
		}*/
		int count=0 ;
		
		Scanner op = new Scanner(System.in);
		
		System.out.print("輸入一行英文句子，請以英文的標點符號、空白字元等為分界");
		String s1=op.next();
		s1=s1.toLowerCase();
		String [] tokens = s1.split("\\,|!|\\.|?|-|_|~|;|:|\\s");
		for(String token:tokens)
		{
			
			count=0;
			char[] cArray = new char[token.length()];
			for(int i=0;i<token.length();i++)
				{
					cArray[i] = token.charAt(i);
					//System.out.println("0cArray[i] "+ i +" "+cArray[i]);
				}
			
				for(int i=0;i<token.length();i++)
				{

					
					//System.out.println("1"+token);
					//System.out.println("1cArray[i] "+ i +cArray[i]);
					//	System.out.println("count"+count);
					if(((cArray[i]-'0' )<=9 )&& ((cArray[i]-'0') >=0))
					{
						//System.out.println("2cArray[i]"+ i  +" "+cArray[i]);
						//System.out.println("count"+count);
						count +=( cArray[i]-'0');
					}
					else
					{
						count =-1;
						break;
					}
				}
			if(count ==-1)
				System.out.println(token);
			else
				System.out.println(count);
		}
	}
}