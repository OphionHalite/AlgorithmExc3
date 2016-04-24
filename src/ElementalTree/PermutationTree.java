package ElementalTree;

import java.util.ArrayList;

public class PermutationTree extends Tree<String>{
	
	/**
	 * Constructor for a ProbabilityTree (inherits from Tree)
	 */
	public PermutationTree() {
		super(new TreeNode<String>());		
	}
	
	/**
	 * Fills the ProbabiltyTree, each path from root to leaf contains a permutation of the given elements
	 * @param String[] The elements to make a ProbabilityTree of.
	 */
	public void make(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i=0; i<args.length; i++) {
			list.add(args[i]);
		}
		getRoot().fillAll(list);
	}
	
	/**
	 * Returns all possible permutations the tree contains
	 * @return an ArrayList of Strings containing all permutations
	 */
	public void permutations() {
		for(int i=0; i<getRoot().getChildren().size(); i++) {
			getRoot().getChildren().get(i).printPath("");
		}
	}
	
	/**
	 * Return all combinations up to the given number of elements
	 * @param int amount of elements requested
	 * @return ArrayList<String>
	 */
	public void combinations(int n) {
		for(int i=0; i<getRoot().getChildren().size(); i++) {
			getRoot().getChildren().get(i).printPathToN("",n);
		}
	}
}
