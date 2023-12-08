/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) return emptyList()
        val queue = ArrayDeque<Pair<Int,TreeNode>>()
        val result = mutableListOf<MutableList<Int>>()
        queue.addLast(Pair(0,root))
        while (!queue.isEmpty()) {
            val cNode = queue.removeFirst()
            if (cNode.first >= result.size) {
                result.add(mutableListOf())
            }
            result[cNode.first].add(cNode.second.`val`)
            if (cNode.second.left != null) {
                queue.addLast(Pair(cNode.first + 1, cNode.second.left!!))
            }
            if (cNode.second.right != null) {
                queue.addLast(Pair(cNode.first + 1, cNode.second.right!!))
            }
        }
        return result
    }
}