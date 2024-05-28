package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	
	static String path = "C:\\Users\\Abhay\\Desktop\\abhay.txt";
	static String path2 = "C:\\Users\\Abhay\\Desktop\\abhay1.txt";
	static File f;

	public static void main(String[] args) throws IOException {

		getFileCreate();
		getWriteInfile();
		getRenameFile();
		getReadFile();
	}

	public static void getFileCreate() throws IOException {	
		
		f = new File(path);		
		if (f.createNewFile() == false) {
			System.out.println("File is created");
			System.out.println(f.canRead());
			System.out.println(f.getAbsoluteFile());
			System.out.println(f.getName());
			System.out.println(f.length());
			System.out.println(f.canWrite());
						
		} else {
			System.out.println("File alredy exists ");
		}
	}
	
	public static void getWriteInfile(){
					
			try {
				FileWriter fr = new FileWriter(path);
			 try{
				fr.write("my name is Abhay and looking for new TM job \n");
				System.out.println("data has writen in the file");
			}
			 finally 
			 {
				fr.close();				
			}
		}catch(IOException e) {				
				System.out.println(e);
			}
	}
	
	public static void getRenameFile() {
		File r = new File(path2);
		if(f.exists()) {
			f.renameTo(r);
		}else {
			System.out.println("File Not exists");
		}		
	}
	
	public static void getReadFile() {
		int i;
		FileReader fr = new FileReader(path);
		while((i=fr.read())!=-1) {
			
			System.out.println(i);
		}		
	}
}


