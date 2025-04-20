package file_handling;



	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;

	public class Writing_character_type_of_data_into_file1 {

	    public static void main(String[] args) throws IOException {
	        // TODO Auto-generated method stub

	        
	        //FileWriter performs create, open ,write,close operation on the file
	        //FileWriter class is having write() method which can write string data directly into the file
	           
	        FileWriter  fw= new FileWriter("C:\\Users\\Lenovo\\Documents\\JAVA\\demo1.txt");
	        
	        BufferedWriter  bw= new BufferedWriter(fw);
	        
	        //writing data into buffer(bw) and then buffer writes data into file(fw)
	        bw.write("java is an object oriented programming lang\nthabk u \nbye");
	        
	        bw.flush();
	        bw.close();
	        
	        System.out.println("success");
	    
	    }

	}
