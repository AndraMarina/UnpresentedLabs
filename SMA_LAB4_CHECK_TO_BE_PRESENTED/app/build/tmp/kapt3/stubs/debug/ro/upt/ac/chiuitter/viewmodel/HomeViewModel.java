package ro.upt.ac.chiuitter.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lro/upt/ac/chiuitter/viewmodel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "chiuitRepository", "Lro/upt/ac/chiuitter/data/ChiuitRepository;", "(Lro/upt/ac/chiuitter/data/ChiuitRepository;)V", "chiuitsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lro/upt/ac/chiuitter/domain/Chiuit;", "getChiuitsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "addChiuit", "", "description", "", "fetchChiuits", "removeChiuit", "chiuit", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<ro.upt.ac.chiuitter.domain.Chiuit>> chiuitsLiveData = null;
    private final ro.upt.ac.chiuitter.data.ChiuitRepository chiuitRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<ro.upt.ac.chiuitter.domain.Chiuit>> getChiuitsLiveData() {
        return null;
    }
    
    public final void fetchChiuits() {
    }
    
    public final void addChiuit(@org.jetbrains.annotations.NotNull()
    java.lang.String description) {
    }
    
    public final void removeChiuit(@org.jetbrains.annotations.NotNull()
    ro.upt.ac.chiuitter.domain.Chiuit chiuit) {
    }
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    ro.upt.ac.chiuitter.data.ChiuitRepository chiuitRepository) {
        super();
    }
}