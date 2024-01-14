package team.me.membership.application.port.`in`

import team.me.common.validate.SelfValidating

/**
 * @author Doyeop Kim
 * @since 2024/01/14
 */
data class FindMembershipQuery(
    val id: String,
): SelfValidating<FindMembershipQuery>() {

}