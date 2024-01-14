package team.me.membership.adapter.out.persistence.jpa

import org.springframework.data.repository.findByIdOrNull
import team.me.common.annotations.PersistenceAdapter
import team.me.membership.adapter.out.persistence.jpa.entity.MembershipJpaEntity
import team.me.membership.adapter.out.persistence.jpa.repository.SpringDataMembershipRepository
import team.me.membership.application.port.out.FindMembershipPort
import team.me.membership.application.port.out.RegisterMembershipPort
import team.me.membership.domain.Membership

/**
 * @author Doyeop Kim
 * @since 2024/01/07
 */
@PersistenceAdapter
class MembershipJpaPersistenceAdapter(private val membershipRepository: SpringDataMembershipRepository) :
    RegisterMembershipPort, FindMembershipPort {
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

    override fun findMembership(membershipId: Membership.Companion.MembershipId): MembershipJpaEntity? {
        return membershipRepository.findByIdOrNull(membershipId.value.toLong())
    }
}