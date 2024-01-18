// 18-01-24
// BFS in tree : Breadth first search
// level
//  level 1: which element
// level 2 : which element
//____________________________________
// koi bhi element vo konse level pr hey
//import java.util.*;
//
//class Node{
//    Node left ,right;
//    int data;
//
//
// public  Node(int data)
// {
//     this.data =data;
// }
//}
//
//  public class Tree_ {
//    static Scanner sc = new Scanner(System.in);
//
//    static Node createTree()
//    {
//        Node root = null;
//        System.out.println("enter data");
//        int data = sc.nextInt();
//
//        if(data==-1)
//        {
//            return null;
//        }
//        root = new Node(data);
//        System.out.println("enter left data "+data);
//        root = createTree();
//
//        System.out.println("enter the right data "+data);
//        root.right =createTree();
//        return root;
//    }
//    int maximum(Node root)
//    {
//        if(root==null)
//        {
//            return Integer.MIN_VALUE;
//        }
//        int leftMax = maximum(root.left);
//        int rightmax = maximum(root.right);
//
//        return Math.max(root.data ,Math.max(leftMax,rightmax));
//    }
//
//    void printcurrentlevel(Node root,int level)
//    {
//        if(root==null)
//        {
//            return;
//        }
//        if(level==1)
//        {
//            System.out.println(root.data+" ");
//        }
//        else if(level>1)
//        {
//            printcurrentlevel(root.left,level-1);
//            printcurrentlevel(root.left,level-1);
//        }
//    }
//
//      public static void main(String[] args) {
//
//         Tree_ = new Tree_();
//        Node root = createTree();
//          System.out.println("enter level");
//          int level = sc.nextInt();
//          System.out.println("node at level "+level);
//          tree.printcurrentlevel(root,level);
//          int result = tree.maximum(root);
//          System.out.println("maximum in the tree "+result);
//      }
//}


//_________________________________________________________***********************************************************

//print all the element of a tree at all level


import java.util.*;

class Node{

    Node left ,right;
    int data;

    public Node(int data)
    {
        this.data =data;
    }
}

 public class Tree_ {
    static Scanner sc = new Scanner(System.in);

    static Node createTree()
    {
        Node root =null;
        System.out.println("enter data");
        int data = sc.nextInt();

        if(data==-1)
        {
            return null;
        }
        root = new Node(data);
        System.out.println("enter the left data "+data);
        root.left = createTree();

        System.out.println("enter the right data "+data);
        root.right = createTree();
        return root;
    }
    void printAllevels(Node root)
    {
        int height = getHeight(root);
        for(int i=0; i<=height; i++)
        {
            System.out.println("node at level "+i+" ");
            printcurrentlevel(root,i);
            System.out.println();
        }
    }
    int getHeight(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        else
        {
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.left);
            return Math.max(leftHeight,rightHeight)+1;
        }
    }
    void printcurrentlevel(Node root ,int level)
    {
        if(root==null)
        {
            return;
        }
        if(level==1)
        {
            System.out.println(root.data+" ");
        } else if (level>1)
        {
            printcurrentlevel(root.left ,level-1);
            printcurrentlevel(root.right,level-1);
        }
    }

     public static void main(String[] args) {

        Tree_ tree= new Tree_();
        Node root = createTree();
        tree.printAllevels(root);
     }
}
