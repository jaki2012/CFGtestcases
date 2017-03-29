# CFGtestcases

- TestCase1 TestCase2 TestCase3 in `src/main/java/org/labsse/Supplement.java`
- TestCase4 in `src/main/java/org/labsse/QuickSort.java`
- TestCase5 in `src/main/java/org/labsse/HeapSort.java`


## Appendix of LOC Metrics
##### 说明文档正在努力编写中，请见谅  

##### 详尽维度说明会在 `2017.04.03` `00:00`前发布  

##### 请先参考`doc`文件夹下目录提供的资料学习相关维度的定义    

以下为39维度当中的部分维度定义:
- NUMBER_OF_LINES 方法的总行数
- LOC_BLANK 空行数
- LOC_COMMENTS 纯注释的行数
- LOC_EXECUTABLE 纯代码行数
- LOC_CODE_AND_COMMENT 同时有代码和注释的行数
- LOC_TOTAL =  LOC_EXECUTABLE + LOC_CODE_AND_COMMENT
- PERCENT_COMMENTS = (LOC_COMMENTS + LOC_CODE_AND_COMMENT) / (LOC_COMMENTS + LOC_CODE_AND_COMMENT + LOC_EXECUTABLE)

e.g.
```
    /**
     * This is an example function.
     */
    public int subStrCount(String parentStr, String subStr){
        //count
        int count = 0;
        //int
        int index = 0;
        while (true) {
            index = parentStr.indexOf(subStr, index + 1);
            if (index > 0) {
                count++;
            } else {
                break;
            }
        }

        return count; //I am comment 1;
    }
```

- NUMBER_OF_LINES = 19;
- LOC_BLANK = 1;
- LOC_COMMENTS = 5;
- LOC_CODE_AND_COMMENT = 1;
- LOC_EXECUTABLE = 12;
- LOC_TOTAL = 13;
- PERCENT_COMMENTS = 6 / 18 = 33.33333333333333
