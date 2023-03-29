package L_28DivideAndConqure;

public class AxisOrbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "NITIN";
		System.out.println(Count(s));
	}
	public static int Count(String str) {
		int count =0;
		for(int axis =0;axis<str.length();axis++) {
			for(int orbit =0;orbit<str.length() && axis-orbit>=0 && axis+orbit< str.length();orbit++) {
				if(str.charAt(axis-orbit)!=str.charAt(axis+orbit)) {
					break;
				}
				count++;
			}
		}
		for(double axis =0.5;axis<str.length();axis++) {
			for(double orbit =0.5;orbit<str.length() && axis-orbit>=0 && axis+orbit<str.length();orbit++) {
				if(str.charAt((int)(axis-orbit))!=str.charAt((int)(axis+orbit))) {
					break;
				}
				count++;
			}
		}
		return count;
	}
}