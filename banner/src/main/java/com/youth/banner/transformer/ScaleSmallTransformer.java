package com.youth.banner.transformer;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * @Author: LZQ
 * @CreateDate: 2019/6/28 15:21
 */
public class ScaleSmallTransformer   implements ViewPager.PageTransformer {
    private static final float MIN_SCALE = 0.8F;


    @Override
    public void transformPage(@NonNull View page, float position) {
        float scale = MIN_SCALE + (1 - Math.abs(position)) * (1 - MIN_SCALE) - 0.05F;
//        page.setScaleX(scale);
        page.setScaleY(scale);
    }
}
