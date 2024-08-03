package com.indus.training.core.impl;

import com.indus.training.core.domain.CalciInput;
import com.indus.training.core.domain.CalciOutput;
import com.indus.training.core.svc.ICalci;

/**
 * Implements the ICalci interface for performing basic arithmetic operations
 */
public class Calci implements ICalci {

	/**
	 * Performs addition of two double values provided in the CalciInpObj
	 */
	@Override
	public CalciOutput addition(CalciInput calInpObj) {
		CalciOutput calOutObj = null;
		{
			Double param1 = calInpObj.getParam1();
			Double param2 = calInpObj.getParam2();
			Double result = param1 + param2;
			calOutObj = new CalciOutput();
			calOutObj.setParam1(param1);
			calOutObj.setParam2(param2);
			calOutObj.setResult(result);
			calOutObj.setOperation("Addition");

		}
		return calOutObj;
	}

	/**
	 * Performs addition of two double values provided in the CalciInpObj
	 */
	@Override
	public CalciOutput subtract(CalciInput calInpObj) {
		CalciOutput calOutObj = null;
		{
			Double param1 = calInpObj.getParam1();
			Double param2 = calInpObj.getParam2();
			Double result = param1 - param2;
			calOutObj = new CalciOutput();
			calOutObj.setParam1(param1);
			calOutObj.setParam2(param2);
			calOutObj.setResult(result);
			calOutObj.setOperation("Subtraction");
		}
		return calOutObj;
	}

	/**
	 * Performs multiplication of two double values provided in the CalciInpObj
	 */
	@Override
	public CalciOutput multiply(CalciInput calInpObj) {
		CalciOutput calOutObj = null;
		{
			Double param1 = calInpObj.getParam1();
			Double param2 = calInpObj.getParam2();
			Double result = param1 * param2;
			calOutObj = new CalciOutput();
			calOutObj.setParam1(param1);
			calOutObj.setParam2(param2);
			calOutObj.setResult(result);
			calOutObj.setOperation("Multiplication");
		}
		return calOutObj;
	}

	/**
	 * Performs division of two double values provided in the CalciInpObj
	 */
	@Override
	public CalciOutput division(CalciInput calInpObj) {
		CalciOutput calOutObj = null;
		{
			Double param1 = calInpObj.getParam1();
			Double param2 = calInpObj.getParam2();
			Double result = param1 / param2;
			calOutObj = new CalciOutput();
			calOutObj.setParam1(param1);
			calOutObj.setParam2(param2);
			calOutObj.setResult(result);
			calOutObj.setOperation("Division");
		}
		return calOutObj;
	}

}
