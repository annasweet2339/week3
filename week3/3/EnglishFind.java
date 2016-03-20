import java.util.*;
class EnglishFind{
	int c=0;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		HashMap transcript = new HashMap();
		
		System.out.println("檔案:");
		String file=in.nextLine();
		FileInputStream f = new FileInputStream(file);  
		ObjectInputStream s = new ObjectInputStream(f);  
		transcript = (HashMap<String,Object>)s.readObject();         
		s.close();
		
		
		while(true){
				System.out.print("1)輸入 2)查詢 3)寫檔:");
				int opt=in.nextInt();
				if(opt==1){
					System.out.print("(-1)結束:");
					String str=in.nextLine();
					str=str.toLowerCase();
					String[] tokens=str.split(" ");
					for(String token:tokens){
							if(transcript.containsKey(token)){//containsKey(Object key) 方法是用來測試指定的對象引用是否為此標識哈希映射中的鍵。
								String m=transcript.get(token);
								int n=Integer.parseInt(m);
								n++;
								transcript.put(token,n);
							}else{
								transcript.put(token,1);
							}
						}
				}else if(opt==2){
					in.nextLine();
					System.out.print("查詢字: ");
					String str=in.nextLine();
					str=str.toLowerCase();
					if(transcript.containsKey(str)){
						System.out.println(str+" Total:"+transcript.get(str));
					}else{
						System.out.println("No found");
					}					
					
				}else if(opt==3){
					
					System.out.println("檔案:");
					String file=in.nextLine();
					FileOutputStream f = new FileOutputStream(file);  
					ObjectOutputStream s = new ObjectOutputStream(f);          
					s.writeObject(transcript);
					s.flush();
				}else{
					System.out.println("輸入錯誤!");
				}
			
		}
	}
}