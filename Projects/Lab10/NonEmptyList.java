public class NonEmptyList implements LispList{
    Object head = head();
    LispList tail = tail();

    public NonEmptyList(Object obj, LispList tail){
        this.head = obj;
        this.tail = tail;
    }
    @Override
    public Object head() {
        return head;
    }

    @Override
    public LispList tail() {
        return tail;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public LispList cons(Object obj) {
        return new NonEmptyList(obj, new NonEmptyList(head(), tail));
    }

    @Override
    public int length() {
        return 1 + tail.length();
    }

    @Override
    public LispList merge(LispList other) {
        if (other.empty())
            return this;
        return new NonEmptyList(other.head(), other.tail().merge(this));
    }

    @Override
    public boolean contains(Object obj) {
        if (obj == head)
            return true;
        else
            return tail.contains(obj);
    }

    public String toString(){
        return head() + " " + tail().toString();
    }
}
