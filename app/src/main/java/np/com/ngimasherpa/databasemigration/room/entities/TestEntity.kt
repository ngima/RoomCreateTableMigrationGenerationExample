package np.com.ngimasherpa.databasemigration.room.entities
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "tests"
)
data class TestEntity(
    @ColumnInfo(name = "value") val value: String,
    @ColumnInfo(name = "key") var key: String,
    @PrimaryKey val id: Int = 0
)