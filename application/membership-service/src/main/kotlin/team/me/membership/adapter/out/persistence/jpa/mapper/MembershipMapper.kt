package team.me.membership.adapter.out.persistence.jpa.mapper

import org.springframework.stereotype.Component
import team.me.membership.adapter.out.persistence.jpa.entity.MembershipJpaEntity
import team.me.membership.domain.Membership

/**
 * @author Doyeop Kim
 * @since 2024/01/07
 */
@Component
class MembershipMapper {
    fun mapToDomainEntity(membershipJpaEntity: MembershipJpaEntity): Membership {
        return Membership.generateMember(
            Membership.Companion.MembershipId("${membershipJpaEntity.id}"),
            Membership.Companion.MembershipName(membershipJpaEntity.name),
            Membership.Companion.MembershipEmail(membershipJpaEntity.email),
            Membership.Companion.MembershipAddress(membershipJpaEntity.address),
            Membership.Companion.MembershipIsValid(membershipJpaEntity.isValid),
            Membership.Companion.MembershipIsCorp(membershipJpaEntity.isCorp)
        )
    }
}