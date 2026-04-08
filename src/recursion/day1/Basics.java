package recursion.day1;

public class Basics {
    public static void main(String[] args) {
        // Important notes
        // 1. When a function is called or starts executing until it is finished it goes into stack.
        // 2. When a function stops executing or completed it removed from stack and restored to the point where it is called.
        // 3. Recursion means a function that calls itself.
        // 4. Base Condition in recursion : condition where our recursion will stop making new calls.
        // ---- Important to prevent infinite calling and memory of system will exceed the limit.
        // 5. Why : It helps us in solving bigger complex problems in simple ways / by breaking down bigger problems into smaller problems. You can convert recursion solutions into iteration and vice versa.
        // 6. Space complexity is not constant because of recursive calls.
        // 7. when you write the recursion in form of formula it is called recursion relation.
        // 8. There are two types of recursion : Linear (fibonacci) and Divide & Conquer (binary search).
        // ---- In divide and conquer means divide by some factor and reduce the  search space and in linear there is no reduction.

        print(1);
    }

    static void print(int n){

        if(n == 5){ //this is the base condition.
            System.out.println(n);
            return; //to break the function
        }
        System.out.println(n);
        print(n + 1);  //as many times you call the function it will take some memory and placed in stack doesn't matter if it is the same.
    }

}
