package Utils;

public class Functions {

	public static boolean stringIsNullOrEmpty(String s){
		if(s == null){
			return true;
		}else{
			if(s.equals("")){
				return true;
			}
		}
		return false;
	}
}
