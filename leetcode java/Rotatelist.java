//class  Node {
//    int data;
//    Node next;
//    Node(){};
//    Node(int val) {this.data = data;}
//    Node(int val,Node next){
//         this.data=data;
//         this.next=next;
//
//    }
//}
//
//
//
//    public class Rotatelist {
//
//        public static void main(String[] args) {
//                Node head = new Node(1);
//                head.next=new Node(2);
//                head.next.next=new Node(3);
//                rotateRight(head,2);
//                printnodes(head);
//
//
//
//        }
//
//        private static void printnodes(Node head) {
//
//        }
//
//        public static Node rotateRight(Node head, int k) {
//          Node temp = head;
//            if(head==null || k==0){
//                return head;
//            }
//            int length = 1;
//            while(temp.next!=null){
//
//                temp=temp.next;
//                length++;
//            }
//            temp.next = head;
//
//            k = k % length;
//            for(int i = 0;i<length-k;i++){
//                temp=temp.next;
//
//            }
//            head=temp.next;
//            temp.next=null;
//            return head;
//
//        }
//
//        }
//
//
//}
