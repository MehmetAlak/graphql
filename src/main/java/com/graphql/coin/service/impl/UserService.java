
package com.graphql.coin.service.impl;

import com.graphql.coin.graphql.inputs.UserInput;
import com.graphql.coin.model.entity.User;
import com.graphql.coin.repository.UserRepository;
import com.graphql.coin.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @Transactional
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepository userRepository;

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }

    @Override
    public List<User> allUser() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(UserInput input) {
        User user = User.builder()
                .id(input.getId())
                .email(input.getEmail())
                .firstName(input.getFirstName())
                .lastName(input.getLastName())
                .build();
        return userRepository.save(user);
    }
}
