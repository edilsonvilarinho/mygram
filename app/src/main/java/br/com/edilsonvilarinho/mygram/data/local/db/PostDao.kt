package br.com.edilsonvilarinho.mygram.data.local.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import br.com.edilsonvilarinho.mygram.data.local.db.entity.PostEntity

@Dao
interface PostDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(postEntityList: List<PostEntity>)

    @Query("SELECT * FROM post")
    suspend fun getAll(): List<PostEntity>

}