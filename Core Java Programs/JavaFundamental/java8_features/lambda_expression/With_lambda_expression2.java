package java8_features.lambda_expression;

	interface Xyz
	{
	    void show();
	}
	public class With_lambda_expression2 {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	          //non-parameterized lambda expression
	        Xyz x1=  () -> System.out.println("Msg : hello everyone!!!!");
	        
	           x1.show();
	    }

	}