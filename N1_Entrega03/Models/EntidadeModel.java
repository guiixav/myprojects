package Models;

public class EntidadeModel {
    private int Id;

    public EntidadeModel(){

    }

    public EntidadeModel(int Id){ this.Id = Id; }

    //get set
    public int getId() { return Id; }

    public void setId(int Id) {
        if (Id >= 0) {
            this.Id = Id;
        }
    }
}