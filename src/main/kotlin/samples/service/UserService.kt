package samples.service

/**
 * Created by version1 on 2017/02/11.
 */

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import samples.model.User
import samples.repository.UserRepository

/**
 * DBからのデータ取得と加工を行う.
 */
@Service
open class UserService @Autowired constructor(private val userRepository: UserRepository) {

    /**
     * 全書籍リストの取得
     * @return 書籍リスト
     */
    fun findAllUser(): MutableList<User> = userRepository.findAll()
}