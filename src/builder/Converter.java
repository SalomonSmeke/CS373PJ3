package builder;

public class Converter {
	public static String lineTerminator = "\n";
	public static String[] getAvailable(){
		return new String[]{"CSV","TSV"};
	}
	public static String convertInto(String choice, String[][] values){
		String out = "";
		if (choice.equals("CSV")){
			out = CSVConverter.parseInto(values, lineTerminator);
		} else {
			out = TSVConverter.parseInto(values, lineTerminator);
		}
		return out;
	}
	public static String convertInto(String choice, String[][] values, String lineTerminator){
		String out = "";
		if (choice.equals("CSV")){
			out = CSVConverter.parseInto(values, lineTerminator);
		} else {
			out = TSVConverter.parseInto(values, lineTerminator);
		}
		return out;
	}
}
