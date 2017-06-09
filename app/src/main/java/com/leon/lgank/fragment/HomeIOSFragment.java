package com.leon.lgank.fragment;

import android.view.View;

import com.leon.lgank.common.Constant;

/**
 * 作者：Leon
 * 时间：2017/6/6
 */
public class HomeIOSFragment extends BaseHomeFragment {
    public View mView;

    @Override
    public String getApiCategory() {
        return "iOS";
    }

    @Override
    protected int getItemType() {
        return Constant.ITEM_TYPE_TEXT;
    }
}
