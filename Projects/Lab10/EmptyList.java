public class EmptyList implements LispList{

    @Override
    public Object head() throws UnsupportedOperationException{
        return null;
    }

    @Override
    public LispList tail() throws UnsupportedOperationException{
        return null;
    }

    @Override
    public boolean empty() {
        return true;
    }

    @Override
    public LispList cons(Object obj) {
        return new NonEmptyList(obj, new EmptyList());
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public LispList merge(LispList other) {
        return other;
    }

    @Override
    public boolean contains(Object obj) {
        return false;
    }

    public String toString(){
        return "";
    }
}
