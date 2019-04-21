package algoProgrm;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

/**
 * @author Tanmoy Dasgupta
 */
public class CustomJsonParser {

	public static void main(String[] args) {

		writeObjToJson();
	}

	private static void writeObjToJson() {
		ObjectMapper objMapper = new ObjectMapper();
		Map<String, Object> objMap = new HashMap<>();

		objMap.put("name", "Tanmoy Dasgupta");
		objMap.put("address", "Bangalore");
		objMap.put("skillset", Arrays.asList("java","Reactive spring","miroservice", "DevOps stack","apache camel"));
		objMap.put("company", Arrays.asList("TCS","AccionLabs","Standard chartered bank", "GE Transportation","LinkedIn"));

		try {
			Map<String, Object> dataValue = new HashMap<>();

			System.out.println(objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(objMap)); // write map data in console as json
			objMapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/algoProgrm/file.txt"), objMap); //// write map data in file as json

			dataValue = objMapper.readValue(new File("src/algoProgrm/file1.txt"), new TypeReference<HashMap<String,Object>>(){

			});
			dataValue.entrySet().forEach(e -> System.out.println(e.getKey()+"------>"+e.getValue())); //read from any json file, 
			//convert it map and write in consol

			Map<String, Integer> myMap = new HashMap<>();
			int val = 20;
			for(int i = 0; i<10; i++) {
				myMap.put("mapKey"+i, val);
				val = val*2;
			}

			System.out.println(myMap.entrySet().stream().sorted((m,n) -> n.getValue().compareTo(m.getValue()))
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldval, newval) -> oldval,LinkedHashMap::new)));

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
