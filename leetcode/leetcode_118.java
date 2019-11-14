package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_118 {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            //创建外部大的数组
            List<List<Integer>> lists = new ArrayList<>();
            if (numRows==0){
                return lists;
            }
            //特殊处理numRow==1的情况
            List<Integer> firstList = new ArrayList<>();
            firstList.add(1);
            lists.add(firstList);

            //直接进入for循环
            for (int i = 1; i < numRows; i++) {
                //获取之前的数组
                List<Integer> preList = lists.get(i - 1);
                //创建小数组
                List<Integer> currentList = new ArrayList<>();
                //首先前后加一
                currentList.add(1);
                //中间步骤
                for (int j=0;j+1<preList.size();j++){
                    currentList.add(preList.get(j)+preList.get(j+1));
                }
                currentList.add(1);
                //加入大数组
                lists.add(currentList);
            }
            return lists;
        }
    }
}
