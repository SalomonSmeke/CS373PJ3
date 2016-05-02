package builder;

public class CSVConverter{

	public static String parseInto(String[][] values, String term) {
		String EOL = term;
		String out = "";
		for (int y = 0; y < values.length; y++){
			for (int x = 0; x < values[y].length; x++){
				out = out+values[y][x]+",";
			}
			out = out + EOL;
		}
		return out;
	}
	
}
