package ElementalTree;

import java.util.ArrayList;

public class TreeNode<E> implements TreeNodeInterface<E> {
	
	private TreeNode<E> parent;
	private E element;
	private ArrayList<TreeNode<E>> children = new ArrayList<TreeNode<E>>();
	
	public TreeNode(){}
	public TreeNode(E element){this.element = element;}
	
	public void setParent(TreeNode<E> parent) {this.parent = parent;}
	public TreeNode<E> getParent() {return parent;}
	public int getIndex() {return parent.getChildren().indexOf(this);}
	
	public void setElement(E element) {this.element = element;}
	public E getElement() {return element;}

	public boolean isRoot() {return (parent == null);}
	public boolean isLeaf() {return children.isEmpty();}
	public boolean isLastChild() {return parent.getChildren().indexOf(this) == parent.getChildren().size()-1;}

	public void addChild(E element) {
		children.add(new TreeNode<E>(element));
	}

	public void addChild(TreeNode<E> child) {
		children.add(child);
	}
	
	public void addChildren(ArrayList<E> list) {
		for(int i = 0; i<list.size(); i++){
			addChild(list.get(i));
		}
	}
	
	public void fillAll(ArrayList<E> list) {
		addChildren(list);
		if(list.size()>1) {
			for(int i=0; i<list.size(); i++){
				ArrayList<E> templist = new ArrayList<E>(list);
				templist.remove(i);
				children.get(i).fillAll(templist);
			}
		}
	}
	
	public ArrayList<TreeNode<E>> getChildren() {
		return children;
	}
	
	public int amountOfChildren() {
		return children.size();
	}
	
	public int sizeOfSubTree() {
		int size = amountOfChildren();
		for (int i=0; i<amountOfChildren(); i++) {
			size += children.get(i).sizeOfSubTree();
		}
		return size;
	}
	
	public void printPath(String pathToThis) {
		pathToThis = pathToThis + element;
		if(isLeaf()) {
			System.out.println(pathToThis);
		} else {
			for(int i=0; i<children.size(); i++) {
				children.get(i).printPath(pathToThis);
			}
		}
	}
	
	public void printPathToN(String pathToThis, int n) {
		pathToThis = pathToThis + element;
		if(isLeaf()||pathToThis.length()>=n) {
			System.out.println(pathToThis);
		} else {
			for(int i=0; i<children.size(); i++) {
				children.get(i).printPathToN(pathToThis, n);
			}
		}
	}
}
