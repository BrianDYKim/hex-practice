package team.me.membership.application.port.out

import team.me.membership.adapter.out.persistence.MembershipJpaEntity
import team.me.membership.domain.Membership

/**
 * @author Doyeop Kim
 * @since 2024/01/07
 */
interface RegisterMembershipPort {
    fun createMembership(
        membershipName: Membership.Companion.MembershipName,
        membershipEmail: Membership.Companion.MembershipEmail,
        membershipAddress: Membership.Companion.MembershipAddress,
        membershipIsValid: Membership.Companion.MembershipIsValid,
        membershipIsCorp: Membership.Companion.MembershipIsCorp
    ): MembershipJpaEntity
}