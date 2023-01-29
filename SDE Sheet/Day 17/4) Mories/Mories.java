
// //
// class Node {
//     int data;
//     Node left, right;
//     Node(int data) {
//         this.data = data;
//         left = null;
//         right = null;
//     }
    
// class Mories {
//     public List<Integer> inorderTraversal(Node root) {
//         List<Integer> inorder = new ArrayList<Integer>(); 
        
//         Node cur = root; 
//         while(cur != null) {
//             if(cur.left == null) {
//                 inorder.add(cur.val); 
//                 cur = cur.right; 
//             }
//             else {
//                 Node prev = cur.left; 
//                 while(prev.right != null && prev.right != cur) {
//                     prev = prev.right; 
//                 }
                
//                 if(prev.right == null) {
//                     prev.right = cur;
//                     cur = cur.left; 
//                 }
//                 else {
//                     prev.right = null; 
//                     inorder.add(cur.val); 
//                     cur = cur.right; 
//                 }
//             }
//         }
//         return inorder; 
//     }

//     public static void main(String args[]) {

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.left.right.left = new Node(8);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);
//         root.right.right.left = new Node(9);
//         root.right.right.right = new Node(10);

//         List < Integer > postOrder = new List < > ();
//         postOrderTrav(root, postOrder);

//         System.out.println("The postOrder Traversal is : ");
//         for (int i = 0; i < postOrder.size(); i++) {
//             System.out.print(postOrder.get(i) + " ");
//         }
//     }
// }



