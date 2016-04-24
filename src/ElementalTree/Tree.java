package ElementalTree;

public class Tree<E> {

	private TreeNode<E> root;
	
	/**
	 * Constructor for a Tree, makes the root Null
	 */
	public Tree() {
	}
	
	/**
	 * Constructor for a Tree 
	 * @param root
	 */
	public Tree (TreeNode<E> root) {
		this.root = root;
	}
	
	/**
	 * Sets the root of this Tree to a new given Node
	 * @param root
	 */
	public void setRoot (TreeNode<E> root) {
		this.root = root;
	}
	
	/**
	 * 
	 * @return The root Node of this Tree
	 */
	public TreeNode<E> getRoot() {
		return root;
	}
	
	
	
	/**
	 * 
	 * @return the size of the Tree
	 */
	public int sizeOfTree() {
		int size = root.amountOfChildren();
			for (int i=0; i<size; i++){
				size += root.getChildren().get(i).sizeOfSubTree();
			}
		return size;
	}
}
