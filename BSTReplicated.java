//BST Replicated
//Sahithra Kesavan
//The purpose of this file is to test the methods from the BST class
import java.util.List;

public class BSTReplicated 
{

    public static void main(String[] args) 
    {
      
        BinarySearchIntTree tree1 = new BinarySearchIntTree();  // Using default constructor
        BinarySearchIntTree tree2 = new BinarySearchIntTree(10);  // Using constructor with an initial value


        System.out.println("Tree 1:");
        testBinarySearchTree(tree1);

       
        System.out.println("\nTree 2:");
        testBinarySearchTree(tree2);
    }

    private static void testBinarySearchTree(BinarySearchIntTree tree) 
    {
        System.out.println("Size: " + tree.getSize());
        System.out.println(tree.isEmpty());

        
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);

        System.out.println("Tree in in-order traversal: " + tree.toString());

   
        System.out.println("Smallest value: " + tree.smallest());
        System.out.println("Largest value: " + tree.largest());
        System.out.println("Number of leaves: " + tree.countLeaves(tree.getOverallRoot()));

      
      //  System.out.println(tree.remove(3));
       // System.out.println(tree.toString());

       
      
        System.out.println(tree.contains(7));
        System.out.println(tree.contains(0));
    }
    }
}
