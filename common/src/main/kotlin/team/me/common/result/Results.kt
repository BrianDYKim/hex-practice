package team.me.common.result

/**
 * @author Doyeop Kim
 * @since 2024/01/14
 */
sealed class Results {
    data class Single<T>(
        val data: T?,
        val isSuccess: Boolean = true,
    )
}