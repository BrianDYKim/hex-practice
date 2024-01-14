package team.me.membership.application.port.`in`.command

import team.me.membership.domain.Membership

/**
 * @author Doyeop Kim
 * @since 2023/12/03
 */
interface RegisterMembershipUseCase {
    fun registerMembership(command: RegisterMembershipCommand): Membership
}