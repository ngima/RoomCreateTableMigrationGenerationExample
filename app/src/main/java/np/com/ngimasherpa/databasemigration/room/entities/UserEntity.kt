package np.com.ngimasherpa.databasemigration.room.entities
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "users"
)
data class UserEntity(
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "address") var address: String,
    @PrimaryKey val id: Int = 0
)