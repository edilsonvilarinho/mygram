package br.com.edilsonvilarinho.mygram.data.local.datasource.post

import br.com.edilsonvilarinho.mygram.TestDataFactory
import br.com.edilsonvilarinho.mygram.data.local.db.PostDao
import br.com.edilsonvilarinho.mygram.data.local.db.entity.PostEntity
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Test

@ExperimentalCoroutinesApi
class PostLocalDataSourceImplTest {

    private fun localDataSource(
        dao: PostDao = mock()
    ) = PostLocalDataSourceImpl(dao)

    @Test
    fun `test insert`() = runBlockingTest {
        val postEntityList: List<PostEntity> = TestDataFactory.postEntityList()
        val dao = mock<PostDao>()
        val localDataSource = localDataSource(
            dao = dao
        )
        localDataSource.insert(postEntityList)
        verify(dao).insert(any())
    }

    @Test
    fun `test getAll`() = runBlockingTest {
        val dao = mock<PostDao>()

        val localDataSource = localDataSource(
            dao = dao
        )

        localDataSource.getAll()

        verify(dao).getAll()
    }
}