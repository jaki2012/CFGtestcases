package org.labsse;

public class Supplement {

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
}
