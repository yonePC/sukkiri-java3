package practice15;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++){
			sb.append(i+1).append(",");
		}
		String s = sb.toString();
		String[] a = s.split(",");
	}
	
	public String concatPath(String folder, String file) {
		if (!folder.endsWith("\\")) {
			folder += "\\";
		}
		return folder + file;
	}

}
