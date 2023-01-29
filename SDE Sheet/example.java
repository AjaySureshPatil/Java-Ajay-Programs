public class Node{
    int val;
    Node left;
    Node right;
    Node() {}
    
    Node(int val) {this.val = val;}
    Node(int val, Node left, Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
    }
    
    class example{
        public List<Integer> inorederTraversal(Node root){
            List<Integer> inOrder = new ArrayList <>();
            Stack<Integer> s = new Stack < > ();
            while(true){
                if(root != null){
                s.push(root);
                root = root.left;
                }
                else{
                    if(s.isEmpty())
                    break;
                    root = s.peek();
                    inOrder.add(root.val);
                    s.pop();
                    root = root.right;
                }
            }
            return inOrder;
    }
    }