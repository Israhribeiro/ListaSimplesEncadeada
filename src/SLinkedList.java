public class SLinkedList<head> {
        protected Node head;
        protected Node tail;

        protected long size;

        public SLinkedList() {
            head = tail = null;
            size = 0;
        }

    public String toString() {
        String s;
        Node p = head;

        s = "[";
        while (p != null) {
            s += p.getElement();
            s += ", ";
            p = p.getNext();
        }
        if (s.length() > 1)
            s = s.substring(0, s.length() - 2);
        return s + "]";
    }

        public void addHead(String elem){
            Node v = new Node(elem,head);
            head = v;
            size += 1;
        }

        public void addTail(String elem){
            Node v = new Node(elem,null);
            if(tail != null) {
                tail.setNext(v);
                tail = v;
            }else{
                tail = head = v;
            }
            size += 1;
        }

        public void removeFirst() {
            Node v = head;
            head = v.getNext();
     }
}

