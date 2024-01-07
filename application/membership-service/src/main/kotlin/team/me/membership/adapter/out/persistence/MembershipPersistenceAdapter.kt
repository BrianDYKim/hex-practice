package team.me.membership.adapter.out.persistence

import team.me.common.annotations.PersistenceAdapter
import team.me.membership.application.port.out.RegisterMembershipPort
import team.me.membership.domain.Membership

/**
 * @author Doyeop Kim
 * @since 2024/01/07
 */
@PersistenceAdapter
class MembershipPersistenceAdapter(private val membershipRepository: SpringDataMembershipRepository) :
    RegisterMembershipPort {
    override fun createMembership(
        membershipName: Membership.Companion.MembershipName,
        membershipEmail: Membership.Companion.MembershipEmail,
        membershipAddress: Membership.Companion.MembershipAddress,
        membershipIsValid: Membership.Companion.MembershipIsValid,
        membershipIsCorp: Membership.Companion.MembershipIsCorp
    ): MembershipJpaEntity {
        val membershipJpaEntity = MembershipJpaEntity(
            name = membershipName.value,
            email = membershipEmail.value,
            address = membershipAddress.value,
            isValid = membershipIsValid.value,
            isCorp = membershipIsCorp.value
        )

        return membershipRepository.save(membershipJpaEntity)
    }
}