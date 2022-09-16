package testing.DemoJunit;

public class Calculator
{
	CalculatorService service;
	
	public int Add(int i, int j)
	{
		return service.add(i, j);
	}

}

