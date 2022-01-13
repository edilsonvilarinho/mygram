package br.com.edilsonvilarinho.mygram.data.local.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import br.com.edilsonvilarinho.mygram.data.local.db.entity.StoryEntity

@Dao
interface StoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(storyEntityList: List<StoryEntity>)

    @Query("SELECT * FROM story")
    suspend fun getAll(): List<StoryEntity>

}