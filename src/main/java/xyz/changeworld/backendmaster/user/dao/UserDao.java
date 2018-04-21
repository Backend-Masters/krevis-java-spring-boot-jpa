package xyz.changeworld.backendmaster.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.changeworld.backendmaster.user.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    User findBySeq(Long seq);
}