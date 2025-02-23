package RecursiveCall.Factorial;

import java.util.ArrayList;

public class Factorial {
    public int factorial(int n){
        if(n>1){
            return n * factorial(n-1);
        }else{
            return 1;
        }
    }

    public int factorial2(int n){
        if(n == 1){
            return 1;
        }else{
            return n * factorial2(n-1);
        }
    }

    // 서브 리스트
    // public List<E> subList(int fromIndex, int toIndex)
    // toIndex의 값은 인덱스 -1의 인덱스가 입력된다.


    // 배열을 이용한 팩토리얼
    public int factorial3(ArrayList<Integer> dataList){
        if(dataList.size()<=0){
            return 0;
        }
        return dataList.get(0) + this.factorial3(new ArrayList<Integer>(dataList.subList(1,dataList.size())));

    }


    public static void main(String[] args) {
        Factorial fact = new Factorial();
        int result = fact.factorial(5);
        System.out.println(result);

        int result2 = fact.factorial2(3);
        System.out.println(result2);

        ArrayList<Integer> testData = new ArrayList();
        for(int i=1; i<=3; i++){
            testData.add(i);
        }
        int result3 = fact.factorial3(testData);
        System.out.println(result3);
    }
}
