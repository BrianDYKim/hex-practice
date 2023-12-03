package team.me.membership.adapter.`in`.web.dto

/**
 * @author Doyeop Kim
 * @since 2023/12/03
 */
sealed class RegisterMembership {
    data class Request(
        var name: String,
        var address: String,
        var email: String,
        var isCorp: Boolean,
    )

    data class Response(
        var id: String,
    )
}