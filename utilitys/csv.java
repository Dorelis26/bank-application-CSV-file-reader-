package utilitys;
import java.util.LinkedList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class csv {

	//read data from a csv file and return as a list
public static List<String[]> read(String file) {
	List<String[]>data = new LinkedList<String[]>();
	String dataRow;
	try {
	BufferedReader br = new BufferedReader(new FileReader(file));
	while((dataRow = br.readLine())!= null){
	String[] dataRecords =dataRow.split(",");
	data.add(dataRecords);
	}
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	return data;
}
}
