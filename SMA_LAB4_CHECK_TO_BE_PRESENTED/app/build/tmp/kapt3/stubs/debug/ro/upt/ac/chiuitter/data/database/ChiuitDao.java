package ro.upt.ac.chiuitter.data.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lro/upt/ac/chiuitter/data/database/ChiuitDao;", "", "getAll", "", "Lro/upt/ac/chiuitter/data/database/ChiuitEntity;", "app_debug"})
public abstract interface ChiuitDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM chiuits")
    public abstract java.util.List<ro.upt.ac.chiuitter.data.database.ChiuitEntity> getAll();
}