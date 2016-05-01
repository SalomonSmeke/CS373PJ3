package builder;

public class Converter {
	public static String[] getAvailable(){
		return new String[]{"CSV","TSV"};
	}
	public static String convertInto(String choice, String[][] values){
		String out = "";
		if (choice.equals("CSV")){
			out = CSVConverter.parseInto(values);
		} else {
			out = TSVConverter.parseInto(values);
		}
		return out;
	}
}
