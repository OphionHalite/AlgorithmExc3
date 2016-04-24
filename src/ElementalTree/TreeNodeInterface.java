package ElementalTree;

public interface TreeNodeInterface<E> {

	/**
	 * Sets the given node as the parent of this node. 
	 * @param parent
	 */
	public void setParent(TreeNode<E> parent);
	
	/**
	 * Makes a new node with the given element and
	 * adds the node to the array of children.
	 * @param element
	 */
	public void addChild(E element);
	
	/**
	 * 
	 * @param child
	 */
	public void addChild(TreeNode<E> child);
	
	/**
	 * Returns the element of this node.
	 * @return element
	 */
	public E getElement();
	
	/**
	 * Sets the element in this node to the given
	 * @param element 
	 */
	public void setElement(E element);
	
	/**
	 * 
	 * @return true if node has no parent
	 */
	public boolean isRoot();
	
	/**
	 * 
	 * @return true if node has no children
	 */
	public boolean isLeaf();
	
}
