package ro.upt.ac.chiuitter.data.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\f\u0010\u000e\u001a\u00020\u000f*\u00020\bH\u0002J\f\u0010\u0010\u001a\u00020\b*\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lro/upt/ac/chiuitter/data/database/DbChiuitStore;", "Lro/upt/ac/chiuitter/data/ChiuitRepository;", "appDatabase", "Lro/upt/ac/chiuitter/data/database/AppDatabase;", "(Lro/upt/ac/chiuitter/data/database/AppDatabase;)V", "addChiuit", "", "chiuit", "Lro/upt/ac/chiuitter/domain/Chiuit;", "(Lro/upt/ac/chiuitter/domain/Chiuit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeChiuit", "toDbModel", "Lro/upt/ac/chiuitter/data/database/ChiuitEntity;", "toDomainModel", "app_debug"})
public final class DbChiuitStore implements ro.upt.ac.chiuitter.data.ChiuitRepository {
    private final ro.upt.ac.chiuitter.data.database.AppDatabase appDatabase = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ro.upt.ac.chiuitter.domain.Chiuit>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addChiuit(@org.jetbrains.annotations.NotNull()
    ro.upt.ac.chiuitter.domain.Chiuit chiuit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeChiuit(@org.jetbrains.annotations.NotNull()
    ro.upt.ac.chiuitter.domain.Chiuit chiuit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    private final ro.upt.ac.chiuitter.data.database.ChiuitEntity toDbModel(@org.jetbrains.annotations.NotNull()
    ro.upt.ac.chiuitter.domain.Chiuit $this$toDbModel) {
        return null;
    }
    
    private final ro.upt.ac.chiuitter.domain.Chiuit toDomainModel(@org.jetbrains.annotations.NotNull()
    ro.upt.ac.chiuitter.data.database.ChiuitEntity $this$toDomainModel) {
        return null;
    }
    
    public DbChiuitStore(@org.jetbrains.annotations.NotNull()
    ro.upt.ac.chiuitter.data.database.AppDatabase appDatabase) {
        super();
    }
}