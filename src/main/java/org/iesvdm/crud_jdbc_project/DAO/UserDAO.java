package org.iesvdm.crud_jdbc_project.DAO;

import org.iesvdm.crud_jdbc_project.model.User;


public interface UserDAO {

    User create(User user);

    User findByUsername(String username);


}
