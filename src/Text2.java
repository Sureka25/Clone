import java.util.ArrayList;
import java.util.List;

public class Text2 {
public static void main(String[] arg) {
	List<Integer> li=new ArrayList();
	li.add(123);
	li.add(12);
	li.add(56);
	System.out.println(li);
	
	int in=li.indexOf(12);
	System.out.println(in);
	
int la=	li.lastIndexOf(56);
System.out.println(la);

int pick=li.get(2);
System.out.println(pick);

li.add(1,100);

System.out.println(li);

li.set(2,200);
System.out.println(li);

li.remove(1);
System.out.println(li);

boolean con=li.contains(200);
System.out.println(con);


}
}
