package team.me.membership.domain

/**
 * @author Doyeop Kim
 * @since 2023/12/03
 */
class Membership private constructor(
    val membershipId: String,
    val name: String,
    val email: String,
    val address: String,
    val isValid: Boolean,
    val isCorp: Boolean,
) {
    companion object {
        // generateMember 를 거치지 않고는 도메인 생성이 불가능하도록 설정
        fun generateMember(
            id: MembershipId,
            name: MembershipName,
            email: MembershipEmail,
            address: MembershipAddress,
            isValid: MembershipIsValid,
            isCorp: MembershipIsCorp
        ): Membership {
            return Membership(id.value, name.value, email.value, address.value, isValid.value, isCorp.value)
        }

        data class MembershipId(val value: String)

        data class MembershipName(val value: String)

        data class MembershipEmail(val value: String)

        data class MembershipAddress(val value: String)

        data class MembershipIsValid(val value: Boolean)

        data class MembershipIsCorp(val value: Boolean)
    }
}