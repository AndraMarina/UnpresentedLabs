package ro.upt.ac.chiuitter.data.database;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class ChiuitDao_Impl implements ChiuitDao {
  private final RoomDatabase __db;

  public ChiuitDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public List<ChiuitEntity> getAll() {
    final String _sql = "SELECT * FROM chiuits";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfTimestamp = _cursor.getColumnIndexOrThrow("timestamp");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final List<ChiuitEntity> _result = new ArrayList<ChiuitEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ChiuitEntity _item;
        final long _tmpTimestamp;
        _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _item = new ChiuitEntity(_tmpTimestamp,_tmpDescription);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
