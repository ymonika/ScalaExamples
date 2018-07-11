import java.lang.Iterable
import javax.sql.DataSource

import com.example.controller.{UserService, Users}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._


@RestController
@RequestMapping(path = Array("/api"))
class UserController(@Autowired val userService: UserService, @Autowired val dataSource: DataSource) {

  @GetMapping(path = Array("/users"))
  def getAllUsers(): Iterable[Users] = {
    userService.listUsers
  }

  @GetMapping(path = Array("/users/{id}"))
  def getUser(@PathVariable id: Long): Users = {
    userService.getUser(id)
  }


}