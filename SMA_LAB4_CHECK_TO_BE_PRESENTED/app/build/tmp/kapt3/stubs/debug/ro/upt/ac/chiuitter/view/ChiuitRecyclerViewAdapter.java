package ro.upt.ac.chiuitter.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B;\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\b2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lro/upt/ac/chiuitter/view/ChiuitRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lro/upt/ac/chiuitter/view/ChiuitRecyclerViewAdapter$ChiuitViewHolder;", "chiuitList", "", "Lro/upt/ac/chiuitter/domain/Chiuit;", "onShareClick", "Lkotlin/Function1;", "", "onDeleteClick", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ChiuitViewHolder", "app_debug"})
public final class ChiuitRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ro.upt.ac.chiuitter.view.ChiuitRecyclerViewAdapter.ChiuitViewHolder> {
    private final java.util.List<ro.upt.ac.chiuitter.domain.Chiuit> chiuitList = null;
    private final kotlin.jvm.functions.Function1<ro.upt.ac.chiuitter.domain.Chiuit, kotlin.Unit> onShareClick = null;
    private final kotlin.jvm.functions.Function1<ro.upt.ac.chiuitter.domain.Chiuit, kotlin.Unit> onDeleteClick = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ro.upt.ac.chiuitter.view.ChiuitRecyclerViewAdapter.ChiuitViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ro.upt.ac.chiuitter.view.ChiuitRecyclerViewAdapter.ChiuitViewHolder holder, int position) {
    }
    
    public ChiuitRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<ro.upt.ac.chiuitter.domain.Chiuit> chiuitList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ro.upt.ac.chiuitter.domain.Chiuit, kotlin.Unit> onShareClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ro.upt.ac.chiuitter.domain.Chiuit, kotlin.Unit> onDeleteClick) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lro/upt/ac/chiuitter/view/ChiuitRecyclerViewAdapter$ChiuitViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lro/upt/ac/chiuitter/view/ChiuitRecyclerViewAdapter;Landroid/view/View;)V", "bind", "", "chiuit", "Lro/upt/ac/chiuitter/domain/Chiuit;", "app_debug"})
    public final class ChiuitViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        ro.upt.ac.chiuitter.domain.Chiuit chiuit) {
        }
        
        public ChiuitViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}