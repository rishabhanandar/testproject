
package com.bajra.prodconsumer;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestGyanesh {

		public void showSize(List<?> list) {
			System.out.println(list.size());
			} 
		
		public static void main(String[] args) {
			TestGyanesh testGyanesh =  new TestGyanesh();
			List list = new LinkedList();
			Vector<? extends Number> list1 = new Vector();
			ArrayList<? super Date> lis2 = new ArrayList();
			testGyanesh.showSize(lis2);
		}
		
}
