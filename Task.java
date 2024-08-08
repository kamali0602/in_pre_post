class TreeNode{
    int value;
    TreeNode left, right;
    TreeNode(int value){
        this.value=value;
        left=right=null;
    }
}
public class Task{
    public void preorder(TreeNode root){
        if(root==null)
            return;
        System.out.print(root.value+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    public void postorder(TreeNode root){
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value+" ");
    }
    public static void main(String[] args) {
        TreeNode node = new TreeNode(4);
        node.left = new TreeNode(2);
        node.right = new TreeNode(5);
        node.left.left = new TreeNode(3);
        node.left.left.right = new TreeNode(9);
        node.left.left.right.left = new TreeNode(1);
        node.right.right = new TreeNode(6);
        node.right.left = new TreeNode(7);
        node.right.right.left = new TreeNode(8);
        Task tree = new Task();
        System.out.println("Preorder Traversal ");
        tree.preorder(node);
        System.out.println("Inorder Traversal ");
        tree.inorder(node);
        System.out.println("Postorder Traversal ");
        tree.postorder(node);
    }
}
