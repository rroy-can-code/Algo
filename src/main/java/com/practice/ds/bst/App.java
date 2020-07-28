package com.practice.ds.bst;

public class App {

	public static void main(String[] args) {
		Tree<Integer> tree = new BinarySearchTree<Integer>();
		tree.insert(10);
		tree.insert(-1);
		tree.insert(1);
		tree.insert(0);
		tree.insert(100);
		tree.insert(-22);
		
		Tree<Integer> tree1 = new BinarySearchTree<Integer>();
		tree1.insert(10);
		tree1.insert(-1);
		tree1.insert(1);
		tree1.insert(0);
		tree1.insert(100);
		tree1.insert(22);
		System.out.println(tree1.getKSmallest(tree1.getRoot(), 6));
		
		/*TreeComparator<Integer> comp=new TreeComparator<Integer>();
		System.out.println(comp.compareTrees(tree.getRoot(), tree1.getRoot()));
		*/
		/*Tree<String> treeStr = new BinarySearchTree<String>();
		treeStr.insert("Adam");
		treeStr.insert("Alex");
		treeStr.insert("Bill");
		treeStr.insert("Vignesh");
		treeStr.insert("Ganesh");
		treeStr.traverse();
		System.out.println(treeStr.getMax());*/
		
		Tree<Person> treeStr = new BinarySearchTree<Person>();
		treeStr.insert(new Person("Adam",15));
		treeStr.insert(new Person("Alex",12));
		treeStr.insert(new Person("Bill",36));
		treeStr.insert(new Person("Vignesh",28));
		treeStr.insert(new Person("Ganesh",27));
		//treeStr.traverse();
		System.out.println(treeStr.getAgeSum());
		
	}
}

