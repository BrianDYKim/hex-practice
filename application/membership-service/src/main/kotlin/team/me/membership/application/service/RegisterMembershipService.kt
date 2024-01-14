package team.me.membership.application.service

import org.springframework.transaction.annotation.Transactional
import team.me.common.annotations.UseCase
import team.me.membership.adapter.out.persistence.jpa.mapper.MembershipMapper
import team.me.membership.application.port.`in`.command.RegisterMembershipCommand
import team.me.membership.application.port.`in`.command.RegisterMembershipUseCase
import team.me.membership.application.port.out.RegisterMembershipPort
import team.me.membership.domain.Membership

/**
 * @author Doyeop Kim
 * @since 2024/01/07
 */
@UseCase
@Transactional(readOnly = false)
class RegisterMembershipService(
    private val registerMembershipPort: RegisterMembershipPort,
    private val membershipMapper: MembershipMapper,
) : RegisterMembershipUseCase {
    override fun registerMembership(command: RegisterMembershipCommand): Membership {
        val createdMembershipEntity = registerMembershipPort.createMembership(
            Membership.Companion.MembershipName(command.name),
            Membership.Companion.MembershipEmail(command.email),
            Membership.Companion.MembershipAddress(command.address),
            Membership.Companion.MembershipIsValid(command.isValid),
            Membership.Companion.MembershipIsCorp(command.isCorp)
        )

        // entity -> Membership
        return membershipMapper.mapToDomainEntity(createdMembershipEntity)
    }
}