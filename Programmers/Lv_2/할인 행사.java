
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,Integer> need = new HashMap<>();

        for(int i = 0 ; i < want.length; i++){
            map.put(want[i], 0);
        }

        //10일까지 삽입하기
        for(int i = 0 ; i < 10; i++){
            if(map.get(discount[i])!=null){
                int num = map.get(discount[i]);
                map.put(discount[i],num+1);
            }
        }

        boolean flag = false;

        for(int i = 0 ; i < want.length; i++){
            if(map.get(want[i]) < number[i]){
                flag = true;
                break;
            }
        }

        if(!flag){
            answer++;
        }

        if(discount.length > 10){
            for(int i = 10 ; i < discount.length; i++){

                if(map.get(discount[i-10])!=null){
                    int minus = map.get(discount[i-10]);
                    map.put(discount[i-10], minus-1);
                }
                if(map.get(discount[i])!=null){
                    int plus = map.get(discount[i]);
                    map.put(discount[i],plus+1);
                }

                flag = false;

                for(int j = 0 ; j < want.length; j++){
                    if(map.get(want[j]) < number[j]){
                        flag = true;
                        break;
                    }
                }

                if(!flag){
                    answer++;
                }
            }
        }

        return answer;
    }
}
