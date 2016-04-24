package ElementalTree;

public class TreeIterator<E> {

	private TreeNode<E> next;
	
	public TreeIterator(TreeNode<E> root) throws Exception {
		next = root;
	}
	
	public boolean hasNext() {
		return next != null;
	}
	
	public E next() {
		if(next.isLeaf()) { 					//If cursor is a leaf
			if(next.isLastChild()) {			//And cursor is the last child
				while(next.isLastChild()) {
					next = next.getParent(); 	//Find a parent thats not the last child then proceed
				}
			next = next.getParent().getChildren().get(next.getIndex()); //Set cursor to the next index
			}
		} else {
			next = next.getChildren().get(0);	//Get the first child of the cursor
		}
		return next.getElement();
	}
}
