import java.util.List;

public class MyPen implements IPen{
    public int getChar(String str){
        int count = 0;
        for(int i=0; i < str.length();i++){
            if(str.charAt(i) == 'A'){
                count++;
            }
        }
        return count;
    }

    @Override
    public int f1(List<Pen> t) {
        int count =0;
        for(Pen p: t){ //for(int i=0; i < t.size(); i++)
            if(getChar(p.getName()) >= 2){
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Pen> t) {
        int indexMin = 0;
        int min = t.get(0).getPrice();
        for(int i= 0; i < t.size(); i++){
            if(min > t.get(i).getPrice() && t.get(i).getPrice() % 2 != 0){
                min = t.get(i).getPrice();
                indexMin = i;
            }
        }
        t.remove(indexMin);
    }

    @Override
    public void f3(List<Pen> t) {
        for(int i=2; i<=6; i++){
            for(int j=i +1; j <=6;j++){
                if(t.get(i).getName().compareTo(t.get(j).getName()) > 0){
                    Pen p = t.get(i);
                    t.set(i, t.get(j));
                    t.set(j, p);
                }
                else if(t.get(i).getName().compareTo(t.get(j).getName()) == 0){
                    if(t.get(i).getPrice() < t.get(j).getPrice()){
                        Pen p = t.get(i);
                    t.set(i, t.get(j));
                    t.set(j, p);
                        
                    }
                }
            }
        }
    }
    
}
