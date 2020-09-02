package ObjectOriented.CollectionDemo;

public class MyGenericClass<MVP> {
    private MVP mvp;

    public void setMvp(MVP mvp){
        this.mvp=mvp;
    }

    public MVP getMvp(){
        return mvp;
    }
}
