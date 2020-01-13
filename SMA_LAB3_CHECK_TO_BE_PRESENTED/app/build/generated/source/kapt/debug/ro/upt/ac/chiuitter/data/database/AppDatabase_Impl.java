package ro.upt.ac.chiuitter.data.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class AppDatabase_Impl extends AppDatabase {
  private volatile ChiuitDao _chiuitDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `chiuits` (`timestamp` INTEGER NOT NULL, `description` TEXT NOT NULL, PRIMARY KEY(`timestamp`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"d31f5241faff91ae5a27f744c5a338db\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `chiuits`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsChiuits = new HashMap<String, TableInfo.Column>(2);
        _columnsChiuits.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 1));
        _columnsChiuits.put("description", new TableInfo.Column("description", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysChiuits = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesChiuits = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoChiuits = new TableInfo("chiuits", _columnsChiuits, _foreignKeysChiuits, _indicesChiuits);
        final TableInfo _existingChiuits = TableInfo.read(_db, "chiuits");
        if (! _infoChiuits.equals(_existingChiuits)) {
          throw new IllegalStateException("Migration didn't properly handle chiuits(ro.upt.ac.chiuitter.data.database.ChiuitEntity).\n"
                  + " Expected:\n" + _infoChiuits + "\n"
                  + " Found:\n" + _existingChiuits);
        }
      }
    }, "d31f5241faff91ae5a27f744c5a338db", "4ed2fc9a3c257eec555f6c4cbfbf38ea");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "chiuits");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `chiuits`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public ChiuitDao chiuitDao() {
    if (_chiuitDao != null) {
      return _chiuitDao;
    } else {
      synchronized(this) {
        if(_chiuitDao == null) {
          _chiuitDao = new ChiuitDao_Impl(this);
        }
        return _chiuitDao;
      }
    }
  }
}
