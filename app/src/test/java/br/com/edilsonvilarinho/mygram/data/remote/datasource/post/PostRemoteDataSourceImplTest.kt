package br.com.edilsonvilarinho.mygram.data.remote.datasource.post

import br.com.edilsonvilarinho.mygram.TestDataFactory
import br.com.edilsonvilarinho.mygram.data.api.post.PostService
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Test

@ExperimentalCoroutinesApi
class PostRemoteDataSourceImplTest {

    private fun remoteDataSource(
        api: PostService = mock(),
    ) = PostRemoteDataSourceImpl(api)

    @Test
    fun `get post`() = runBlockingTest {
        val postResponseList = TestDataFactory.postResponseList()
        val api = mock<PostService>()
        whenever(api.getPosts()).thenReturn(postResponseList)
        val remoteDataSource = remoteDataSource(
            api = api
        )
        remoteDataSource.getPosts()
        verify(api).getPosts()
    }
}