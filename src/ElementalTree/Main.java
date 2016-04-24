package ElementalTree;

	/*
	Description:
	Build a tree, which represents all permutations of a set of elements. 
	Provide a method, which returns all permutations. 
	Also, provide a method combinations(n) which returns all combinations consisting of n elements. 
	You can find an example of a tree attached.
	
	Make your own Tree class. You may use java.util.ArrayList.
	
	Extra
	What is the minimal set of permutations which covers all combinations consisting of n elements? Provide an implementation.
	
	Submission
	Submit the link to your Github project
	TreePermutationsAndCombinations.pdf
	*/

public class Main {
	
	public static void main (String args[]) {
		PermutationTree tree = new PermutationTree();
		tree.make(args);
		System.out.println("Permutations:");
		tree.permutations();
		int n = 3;
		System.out.println("Combinations to "+n+":");
		tree.combinations(n);
	}
}
