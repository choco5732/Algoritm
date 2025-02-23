package Sort.SelectionSort;

// 선택 정렬 :전체 데이터를 순회하면서 가장 작은값을 선택해서 앞으로 두는걸 여러번 반복하는 정렬법

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {

    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        int lowest;
        for (int stand = 0; stand < dataList.size() - 1; stand++) {
            lowest = stand;
            for (int index = stand + 1; index < dataList.size(); index++) {
                if (dataList.get(lowest) > dataList.get(index)) {
                    lowest = index;
                }
            }
            Collections.swap(dataList, lowest, stand);
        }
        return dataList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();

        for(int i = 0; i < 100; i++){
            testData.add((int)(Math.random() * 100));
        }
        SelectionSort sSort = new SelectionSort();
        sSort.sort(testData);
        System.out.println(testData);
    }

}

