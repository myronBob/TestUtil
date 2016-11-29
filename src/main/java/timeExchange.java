import java.io.InputStream;
import java.sql.Timestamp;
import java.util.Scanner;

public class timeExchange {

	public static void main(String args[]){
		Scanner sc = null;
		try{
			String line;
			do{
				InputStream in = System.in;
				sc = new Scanner(in);
				System.out.println("please select the method to run(1 is string to long ,and 2 is long to string):");
				line = sc.nextLine().trim();
				if(Integer.parseInt(line) == 1){
					System.out.println("please input the time to exchange:");
					line = sc.nextLine();
					System.out.println("after exchange:");
					System.out.println(Timestamp.valueOf(line).getTime());
				}else if(Integer.parseInt(line) == 2){
					System.out.println("please input the time to exchange:");
					line = sc.nextLine();
					System.out.println("after exchange:");
					System.out.println(new Timestamp(Long.parseLong(line)));
				}else{
					System.out.println("sorry,this method is undefined yet!");
				}
				System.out.println();
			}while(!"exit".equals(line));
			
			System.exit(0);
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(sc!=null)
				sc.close();
		}
	}
}
