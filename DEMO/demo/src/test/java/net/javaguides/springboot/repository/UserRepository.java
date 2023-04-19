package  net.javaguides.springboot.repository;
import net.javaguides.springboot.entity.user;
import  org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<user,Long>{

}



