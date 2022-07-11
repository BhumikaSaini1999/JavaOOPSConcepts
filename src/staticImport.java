

//For static import Precedence order is 1)current class static members, 2)explicit static import, 3)implicit static import
import static java.lang.Math.*;
import static java.lang.System.*;
public class staticImport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//        System.out.println(Math.sqrt(4));
//        System.out.println(Math.max(89, 12));
//        System.out.println(Math.min(2, 15));
		
		out.println(sqrt(4));
		out.println(max(67,34));
		out.println(min(2, 15));
	}

}
