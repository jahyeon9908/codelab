import java.util.*;

class Computer implements Comparable{
    int serial;
    String owner;
    Computer(int serial, String owner){
        this.serial = serial;
        this.owner = owner;
    }
    public int compareTo(Object o){
        return this.serial - ((Computer)o).serial;
    }
    public String toString(){
        return serial + " "+owner;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<Computer>();
        computers.add(new Computer(500, "egoing"));
        computers.add(new Computer(200, "leezche"));
        computers.add(new Computer(3233, "graphttie"));
        Iterator i = computers.iterator();
        System.out.println("before");
        while(i.hasNext()){
            System.out.println(i.next());
        }
        Collections.sort(computers); //Collections 클래스는 데이터와 관련된 작업들을 처리할 수 있게 도와주는 클래스
                                     //Collections 안의 메소드들은 전부 static이라 인스턴스로 만들 필요없이 바로 사용 가능
                                     //sort는 인자로 list데이터타입 받고 집어넣으면 정렬해준다
        System.out.println("\nafter");
        i = computers.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


    }
}