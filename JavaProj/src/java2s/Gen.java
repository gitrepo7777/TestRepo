package java2s;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Gen{
	public static void main(String[] args)
	{
		GenType<Integer> gInt = new GenType<Integer>(399);
		gInt.showType();
		int gi = gInt.getObj();
		System.out.println("gi is  "+ gi);
		
		GenType2<Integer, String> gObj2 = new GenType2<Integer, String>(499, "Vani");
		gObj2.show();
		
		if(gObj2 instanceof GenType2<?, ?>)
		{
			System.out.println("gObj2 is instance of GenType2");
		}
	}
}
class GenType<T> {
	T obj;
	
	GenType(T o)
	{
		obj = o;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	void showType()
	{
		System.out.println("Type T is of class : " + obj.getClass().getName());

	}
	
}

class GenType2<T, V> extends GenType<T>
{
	T tObj;
	V vObj;
	GenType2(T o)
	{
		super(o);
		tObj = o;
		
	}
	
	GenType2(T to, V vo)
	{
		super(to);
		
		tObj = to;
		vObj = vo;
		
	}
	public void show()
	{
		System.out.println("to = "+ tObj + " and vo = "+vObj);
	}
	
}