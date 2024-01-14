package team.me.membership.application.port.out

import team.me.membership.adapter.out.persistence.jpa.entity.MembershipJpaEntity
import team.me.membership.domain.Membership

/**
 * @author Doyeop Kim
 * @since 2024/01/14
 */
interface FindMembershipPort {
    fun findMembership(membershipId: Membership.Companion.MembershipId): MembershipJpaEntity?
}