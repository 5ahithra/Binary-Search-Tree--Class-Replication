//Binary Search Int Tree
//Sahithra Kesavan
//This is the class of a binary search int tree with methods that access is


import java.util.Collection;
import java.util.List;
import java.util.Stack;

public class BinarySearchIntTree
{

    private IntTreeNode overallRoot;
    private int size;


    public BinarySearchIntTree() //Default Constructor, sets overallRoot to null.
    {
        overallRoot = null;
    }


    public BinarySearchIntTree(int value) //Constructor that sets overallRoot to a new node
   
    {
        overallRoot = new IntTreeNode(value);
    }

 
    
    public BinarySearchIntTree(Collection<Integer> list) //Constructor that sets the Constructor that sets the overallRoot and adds the listed Integers to the tree
    
    
    {
        overallRoot = null;
        for (int value : list) 
        {
            add(value);  
        }
    }

    
    public int getSize() //Returns the current size of the tree.
    {
            return size;
        }
        
    
    public void clear() //Empties the tree.
        {
            overallRoot = null;
        }
        
    
        public int smallest() //Returns the smallest value in the tree.
        {
            if (overallRoot == null)
            {
                throw new IllegalStateException("The tree is empty");
            }

            IntTreeNode current = overallRoot;
            
            while (current.left != null)
            {
                current = current.left;
            }

            return current.data;
        }
        
        
        public int largest() //Returns the largest value in the tree.
        {
            if (overallRoot == null)
            {
                throw new IllegalStateException("The tree is empty");
            }

            IntTreeNode current = overallRoot;
            while (current.right != null)
            {
                current = current.right;
            }

            return current.data;
        }
        
        
        int countLeaves(IntTreeNode root) //Returns the number of leave nodes in the tree. Return -1 if the tree is empty.
   
        {
            if (root == null) {
                return 0;
            }

            if (root.left == null && root.right == null) 
            {
               
                return 1;
            }

           
            return countLeaves(root.left) + countLeaves(root.right);
        }
        
        public boolean isEmpty() //Returns true if the list is empty and should return false if the list is not empty.
        {
            return overallRoot == null;
        }
        

        void add(int value)//Adds the given value to the appropriate place in the tree to maintain ordering;
        
        {
            overallRoot = add(overallRoot, value);
        }

        private IntTreeNode add(IntTreeNode root, int value)
        {
            if (root == null) 
            {
                size++;
                return new IntTreeNode(value);
            }

            if (value < root.data) 
            {
                root.left = add(root.left, value);
                
            } 
            else if (value > root.data)
            {
                root.right = add(root.right, value);
            }

            return root;
        }

       
        public boolean contains(int value)
        {
            return contains(overallRoot, value);
        }

        private boolean contains(IntTreeNode root, int value) 
        {
            if (root == null) 
            {
                return false;
            }

            if (value < root.data) 
            {
                return contains(root.left, value);
            } 
            else if (value > root.data) 
            {
                return contains(root.right, value);
            } else 
            {
                return true; 
            }
        }
        
        private static IntTreeNode minNode(IntTreeNode root) //Returns the node/memory address with the minimum value for the given tree.
        
        {
            if (root == null)
            {
                return null;
            }

            while (root.left != null) 
            {
                root = root.left;
            }

            return root;
        }
        
        public boolean remove(int value) //This one doesn't work.. I'm sorry idk how to do this one
        {
            IntTreeNode parent = null;
            IntTreeNode current = overallRoot;

           
            while (current != null && current.data != value) 
            {
                parent = current;
                if (value < current.data) 
                {
                    current = current.left;
                } 
                else 
                {
                    current = current.right;
                }
            }

          
            if (current == null) 
            {
                return false;
            }

            
            if (current.left == null && current.right == null)
            {
                if (parent == null) 
                {
                    overallRoot = null; 
                } 
                else if (parent.left == current) 
                {
                    parent.left = null;
                } 
                else
                {
                    parent.right = null;
                }
            }
            
            else if (current.left == null || current.right == null) 
            {
              
                }
            }
            
          
        
       
        
        public String toString() //Returns a String of the tree in-order with each number separated by a space
        {
            if (overallRoot == null)
            {
                return "";  //empty string for an empty tree
            }

            String result = "";
            
            Stack<IntTreeNode> stack = new Stack<>();
            IntTreeNode current = overallRoot;

            while (current != null || !stack.isEmpty())
            {
                while (current != null) 
                {
                    stack.push(current);
                    current = current.left;
                }

                current = stack.pop();
                result += current.data + " ";
                current = current.right;
            }

            return result;  
        }

        private void inOrder(IntTreeNode root, StringBuilder result) 
        {
            if (root != null)
            {
                inOrder(root.left, result);
                result.append(root.data).append(" ");
                inOrder(root.right, result);
            }
        }
        
     


      

        
        
        
        
        
        
        
 


}
