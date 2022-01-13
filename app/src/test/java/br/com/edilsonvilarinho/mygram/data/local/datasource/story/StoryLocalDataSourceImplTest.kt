package br.com.edilsonvilarinho.mygram.data.local.datasource.story

import br.com.edilsonvilarinho.mygram.TestDataFactory
import br.com.edilsonvilarinho.mygram.data.local.db.StoryDao
import br.com.edilsonvilarinho.mygram.data.local.db.entity.StoryEntity
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Test

@ExperimentalCoroutinesApi
class StoryLocalDataSourceImplTest {

    private fun localDataSource(
        dao: StoryDao = mock()
    ) = StoryLocalDataSourceImpl(dao)

    @Test
    fun `test insert`() = runBlockingTest {
        val storyEntityList: List<StoryEntity> = TestDataFactory.storyEntityList()
        val dao = mock<StoryDao>()
        val localDataSource = localDataSource(
            dao = dao
        )
        localDataSource.insert(storyEntityList)
        verify(dao).insert(any())
    }

    @Test
    fun `test getAll`() = runBlockingTest {
        val dao = mock<StoryDao>()
        val localDataSource = localDataSource(
            dao = dao
        )
        localDataSource.getAll()
        verify(dao).getAll()
    }
}