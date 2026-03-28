package mar28.collectiondemo;

public class Container<T,R> {
    T item1;
    R item2;

    public Container(T item1, R item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public T getItem1() {
        return item1;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public R getItem2() {
        return item2;
    }

    public void setItem2(R item2) {
        this.item2 = item2;
    }
}
