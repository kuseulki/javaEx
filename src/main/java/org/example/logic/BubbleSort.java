package org.example.logic;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort <T extends Comparable<T>>{

    public List<T> sort(List<T> list) {

        List<T> output = new ArrayList<>(list);

        for (int i = output.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (output.get(j).compareTo(output.get(j + 1)) > 0) {
                    T temp = output.get(j);
                    output.set(j, output.get(j + 1));
                    output.set(j + 1, temp);
                }
            }
        }

        return output;
    }

}


/** 입력 리스트를 받아서 출력으로 정렬된 리스트를 반환함.
 *
 *  입력 인자로 리스트를 받아서 그걸로 새 ArrayList를 만들어서 Output으로 넣음.
 *   - 입력과 출력을 일단 메모리를 구분시켜 놓음. - 출력에 변화를 줘도 입력에 영향이 가지 않게 끔.
 *
 *
 * */
