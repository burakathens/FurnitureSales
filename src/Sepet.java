import java.util.ArrayList;


public class Sepet {

    public ArrayList<Urun> sepetList=new ArrayList<>();





    Sepet(){

    }

    public Sepet(ArrayList<Urun> sepetList) {
        this.sepetList = sepetList;
    }

    public ArrayList<Urun> getSepetList() {
        return sepetList;
    }

    public void setSepetList(ArrayList<Urun> sepetList) {
        this.sepetList = sepetList;
    }


    @Override
    public String toString() {
        return "Sepet{" +
                "sepetList=" + sepetList +
                '}';
    }
}
