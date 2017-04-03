package org.labsse;

/**
 * @author lijiechu
 * @create on 17/3/20
 * @description 补充测试集
 */
public class Supplement {


    // TestCase 1
    void Sort ( int  iRecordNum, int iType)
    {
        int x=0;
        int y=0;
        while ( iRecordNum > 0 ) {
            if( iType==0 )
                x=y+2;
            //I am Comment 1
            else if ( iType==1 )
                x=y+10;  //I am Comment 2
            else         //I am Comment 3
                x=y+20;
        }
    }


    // TestCase 2
    void Do (int X,int A,int B) {
        if ( (A>1)&&(B==0) )
            X = X/A;

        if ( (A==2)||(X>1) )

            X = X+1;
    }


    // TestCase 3
    int countWithFlag (int count, int flag) {
        int temp = 0;

        while(count >0){
            if(flag == 0) {
                temp = count + 100;
                break;
            } else {
                if(flag == 1){
                    temp = temp + 10;
                } else {
                    temp = temp + 20;
                }
            }


            count--;
        }
        return temp;
    }
}