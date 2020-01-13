package ro.upt.ac.chiuitter.data.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\f\u0010\f\u001a\u00020\r*\u00020\bH\u0002J\f\u0010\u000e\u001a\u00020\b*\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lro/upt/ac/chiuitter/data/database/ChiuitDbStore;", "Lro/upt/ac/chiuitter/domain/ChiuitRepository;", "appDatabase", "Lro/upt/ac/chiuitter/data/database/AppDatabase;", "(Lro/upt/ac/chiuitter/data/database/AppDatabase;)V", "addChiuit", "", "chiuit", "Lro/upt/ac/chiuitter/domain/Chiuit;", "getAll", "", "removeChiuit", "toDbModel", "Lro/upt/ac/chiuitter/data/database/ChiuitEntity;", "toDomainModel", "app_debug"})
public final class ChiuitDbStore implements ro.upt.ac.chiuitter.domain.ChiuitRepository {
    private final ro.upt.ac.chiuitter.data.database.AppDatabase appDatabase = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<ro.upt.ac.chiuitter.domain.Chiuit> getAll() {
        return null;
    }
    
    @java.lang.Override()
    public void addChiuit(@org.jetbrains.annotations.NotNull()
    ro.upt.ac.chiuitter.domain.Chiuit chiuit) {
    }
    
    @java.lang.Override()
    public void removeChiuit(@org.jetbrains.annotations.NotNull()
    ro.upt.ac.chiuitter.domain.Chiuit chiuit) {
    }
    
    private final ro.upt.ac.chiuitter.data.database.ChiuitEntity toDbModel(@org.jetbrains.annotations.NotNull()
    ro.upt.ac.chiuitter.domain.Chiuit $this$toDbModel) {
        return null;
    }
    
    private final ro.upt.ac.chiuitter.domain.Chiuit toDomainModel(@org.jetbrains.annotations.NotNull()
    ro.upt.ac.chiuitter.data.database.ChiuitEntity $this$toDomainModel) {
        return null;
    }
    
    public ChiuitDbStore(@org.jetbrains.annotations.NotNull()
    ro.upt.ac.chiuitter.data.database.AppDatabase appDatabase) {
        super();
    }
}