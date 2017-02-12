package samples.controller

/**
 * Created by version1 on 2017/02/11.
 */

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView
import samples.service.UserService


@Controller
class UserController @Autowired constructor(private val userService: UserService) {
    @RequestMapping("/")
    fun root(): ModelAndView{
        return users()
    }

    @RequestMapping("/users")
    fun users(): ModelAndView = ModelAndView("/user").apply { addObject("users", userService.findAllUser()) }
}