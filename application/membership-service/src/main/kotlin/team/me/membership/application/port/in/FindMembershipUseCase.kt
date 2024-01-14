package team.me.membership.application.port.`in`

import team.me.membership.domain.Membership

/**
 * @author Doyeop Kim
 * @since 2024/01/14
 */
interface FindMembershipUseCase {
    fun fineMembership(query: FindMembershipQuery): Membership?
}