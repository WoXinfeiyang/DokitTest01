package com.fxj.dokittest01;

import android.app.Activity;
import android.content.Context;

public class MemoryLeakTestUtil {

    private static Activity mActivity;
    
    public static void memoryLeakTest(Activity activity){
        mActivity=activity;
        try {
            Thread.sleep(2000);
            mActivity.onPostCreate(null,null);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
