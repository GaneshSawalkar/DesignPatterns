package com.bridgelabz.felloship.factory;

import com.bridgelabz.felloship.model.add;
import com.bridgelabz.felloship.model.calculation;
import com.bridgelabz.felloship.model.div;
import com.bridgelabz.felloship.model.mul;
import com.bridgelabz.felloship.model.sub;

public class calculatorfactory {
	public static calculation getcalculation(String operationtype, int fnum, int snum) {
		if (operationtype.equalsIgnoreCase("add")) {
			System.out.println("addition: ");
			return new add(fnum, snum);
		}
		if (operationtype.equalsIgnoreCase("sub")) {
			System.out.println("Subtraction: ");
			return new sub(fnum, snum);
		}
		if (operationtype.equalsIgnoreCase("mul")) {
			System.out.println("multiplication: ");
			return new mul(fnum, snum);
		}
		if (operationtype.equalsIgnoreCase("div")) {
			System.out.println("division: ");
			return new div(fnum, snum);
		}
		return null;
	}
}
