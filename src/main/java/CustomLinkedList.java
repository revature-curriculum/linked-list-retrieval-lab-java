

public class CustomLinkedList<T> {

    private int size;
    private Node<T> first;
    private Node<T> last;

    public CustomLinkedList(){
        this.size = 0;
        first = null;
        last = null;
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = null;

        if(size == 0){
            first = newNode;
            last = newNode;
            size++;
            return;
        }

        last.next = newNode;
        last = newNode;
        size++;
    }

    /** Lab Instructions:
     *      Implement the get() method such that an element within the list can
     *      be retrieved by its index. The list itself should not be modified
     *      by this operation.
     *      Be sure to account for invalid indices which should throw an
     *      IndexOutOfBoundsException
     * @param index
     */
    public T get(int index){
        // TODO: Complete me
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return this.size;
    }

    private class Node<T>{
        T item;
        Node<T> next;
        Node(T item){
            this.item = item;
        }
    }
}