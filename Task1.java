class TreeNode{
    int value;
    TreeNode left, right;
    TreeNode(int value){
        this.value=value;
        left=right=null;
    }
}
public class Task1{
    public void preorder(TreeNode root){
        if(root==null)
            return;
        System.out.print(root.value+" ");
        preorder(root.left);
        preorder(root.right);
        
    }
    public void Inorder(TreeNode root){
        if(root==null)
            return;
        Inorder(root.left);
        System.out.print(root.value+" ");
        Inorder(root.right);
        
    }
    public void postorder(TreeNode root){
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value+" ");
    }
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.left.right.left = new TreeNode(8);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(7);
        node.right.right.left = new TreeNode(9);
        node.right.right.right = new TreeNode(10);
        Task1 tree = new Task1();
        System.out.println("Preorder Traversal");
        tree.preorder(node);
        System.out.println("Inorder Traversal");
        tree.Inorder(node);
        System.out.println("Postorder Traversal");
        tree.postorder(node);
    }
}