

    public static Node removeDuplicates(Node head) {
     //Write your code here
       Node crr = head;
       while(crr!=null && crr.next!=null)
           {
           Node node = crr;
           while(node.next!=null)
               {
               if(node.next.data==crr.data)
                   {
                   Node next = node.next.next;
                   Node temp= node.next;
                   node.next=next;
                   temp=null;

               }
               else{
               node=node.next;
               }
           }
           crr=crr.next;
       }
       return head;
   }
