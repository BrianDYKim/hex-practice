package team.me.common.result

/**
 * @author Doyeop Kim
 * @since 2024/01/14
 */
object ResultFactory {
    fun <T> generateSingleSuccess(data: T): Results.Single<T> {
        return Results.Single(data)
    }

    fun <T> generateSingleFailWithNullable(data: T?): Results.Single<T> {
        return Results.Single(data, false)
    }
}