
	static void levelOrder(Node root){
      //Write your code here
      Node crr = root;
      Queue<Node> q = new LinkedList<>();
      while(crr!=null){
          System.out.print(crr.data+" ");
          if(crr.left!=null){
              q.add(crr.left);
          }
          if(crr.right!=null){
              q.add(crr.right);
          }
          crr = q.peek();
          q.poll();
      }
      
    }
