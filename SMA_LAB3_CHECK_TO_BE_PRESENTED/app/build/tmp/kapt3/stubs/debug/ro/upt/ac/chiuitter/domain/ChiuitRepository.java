package ro.upt.ac.chiuitter.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lro/upt/ac/chiuitter/domain/ChiuitRepository;", "", "addChiuit", "", "chiuit", "Lro/upt/ac/chiuitter/domain/Chiuit;", "getAll", "", "removeChiuit", "app_debug"})
public abstract interface ChiuitRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ro.upt.ac.chiuitter.domain.Chiuit> getAll();
    
    public abstract void addChiuit(@org.jetbrains.annotations.NotNull()
    ro.upt.ac.chiuitter.domain.Chiuit chiuit);
    
    public abstract void removeChiuit(@org.jetbrains.annotations.NotNull()
    ro.upt.ac.chiuitter.domain.Chiuit chiuit);
}