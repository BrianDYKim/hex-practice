package team.me.membership.adapter.out.persistence

import jakarta.persistence.*
import java.time.LocalDateTime

/**
 * @author Doyeop Kim
 * @since 2023/12/03
 */
@Entity
@Table(name = "memberships")
class MembershipJpaEntity(
    @get:Id
    @get:GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    @get:Column(name = "name", nullable = false)
    var name: String,
    @get:Column(name = "address", nullable = false)
    var address: String,
    @get:Column(name = "email", nullable = false)
    var email: String,
    @get:Column(name = "is_valid", nullable = false)
    var isValid: Boolean,
    @get:Column(name = "is_corp", nullable = false)
    var isCorp: Boolean,
) : BaseJpaEntity() {
}