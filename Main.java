@FunctionalInterface
interface MyFunction{
    void run();
}

public class Main {
    static void execute(MyFunction f){
        f.run();
    }
    static MyFunction getMyFunction(){ //반환타입이 함수형 인터페이스(MyFunction)인 메서드
        /*
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
        */ //한 줄로 줄이기
        return () -> System.out.println("f3.run()");
    }

    public static void main(String[] args) {
        //람다식으로 MyFunction의 run()을 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() { //익명클래스로 run()을 구현
            @Override
            public void run() { //public을 반드시 붙여야함
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute( () -> System.out.println("run()"));
    }
}