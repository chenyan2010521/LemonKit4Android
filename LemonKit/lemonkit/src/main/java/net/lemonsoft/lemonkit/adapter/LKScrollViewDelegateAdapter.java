package net.lemonsoft.lemonkit.adapter;


import net.lemonsoft.lemonkit.core.graphics.CGPoint;
import net.lemonsoft.lemonkit.interfaces.ui.LKScrollViewDelegate;
import net.lemonsoft.lemonkit.ui.view.LKScrollView;

/**
 * Created by LiuRi on 2017/1/9.
 */

public abstract class LKScrollViewDelegateAdapter implements LKScrollViewDelegate {

    @Override
    public void scrollViewDidScroll(LKScrollView scrollView) {

    }

    @Override
    public void scrollViewWillBeginDragging(LKScrollView scrollView) {

    }

    @Override
    public void scrollViewWillEndDragging(LKScrollView scrollView, CGPoint velocity, CGPoint targetContentOffset) {

    }

    @Override
    public void scrollViewDidEndDragging(LKScrollView scrollView, boolean decelerate) {

    }

    @Override
    public void scrollViewWillBeginDecelerating(LKScrollView scrollView) {

    }

    @Override
    public void scrollViewDidEndDecelerating(LKScrollView scrollView) {

    }

    @Override
    public void scrollViewDidEndScrollingAnimation(LKScrollView scrollView) {

    }

}
