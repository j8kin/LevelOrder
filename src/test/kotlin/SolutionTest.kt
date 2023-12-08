import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {
    private val solution = Solution()

    @Test
    fun levelOrder1() {
        assertEquals(emptyList<List<Int>>(), solution.levelOrder(null))
    }
    @Test
    fun levelOrder2() {
        val root = TreeNode(3)
        root.left = TreeNode(9)
        root.right = TreeNode(20)
        root.right!!.left = TreeNode(15)
        root.right!!.right = TreeNode(7)

        val expected = listOf(listOf(3), listOf(9,20), listOf(15,7))
        val result = solution.levelOrder(root)

        for (i in expected.indices) {
            assertEquals(expected[i].size, result[i].size)
            for (j in expected[i].indices) {
                assertEquals(expected[i][j],result[i][j])
            }
        }
    }
}