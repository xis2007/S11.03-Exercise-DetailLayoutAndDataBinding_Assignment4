package com.example.android.sunshine;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

class DragAndSwipeHelper extends ItemTouchHelper.Callback {

    DragAndSwipeHelperAdaptor mAdaptor;

    public interface DragAndSwipeHelperAdaptor {
        void onItemMove (int fromPosition, int toPosition);
        void onItemDismiss (int position);
    }

    public DragAndSwipeHelper (DragAndSwipeHelperAdaptor adaptor) {
        this.mAdaptor = adaptor;
    }

    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
//        if(viewHolder instanceof ) {
//
//        }
        int dragFlag = ItemTouchHelper.UP | ItemTouchHelper.DOWN;
        int swipeFlag = ItemTouchHelper.START | ItemTouchHelper.END;
        return makeMovementFlags(dragFlag, swipeFlag);
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        mAdaptor.onItemMove(viewHolder.getAdapterPosition(), target.getAdapterPosition());
        return true;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        mAdaptor.onItemDismiss(viewHolder.getAdapterPosition());
    }

    @Override
    public boolean isLongPressDragEnabled() {
        return true;
    }

    @Override
    public boolean isItemViewSwipeEnabled() {
        return true;
    }
}
