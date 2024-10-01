package in.rohanit.Repository;



import org.springframework.data.jpa.repository.JpaRepository;


import in.rohanit.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
