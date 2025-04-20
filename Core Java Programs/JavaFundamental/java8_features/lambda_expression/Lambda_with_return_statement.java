package java8_features.lambda_expression;

@FunctionalInterface
interface Pqr
{
     public abstract int cube(int x);    
}

public class Lambda_with_return_statement {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        Pqr p1  = (x) -> x*x*x;
        
        
        System.out.println("cube of given number  ="+p1.cube(5) );
    }

}
/*
 int operation(int x,int y)
 {
    return x+y;
 }
 * */