package com.ivb.englishApp.user;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;
    
    @Override
    public User createUser(User user) {
        User userSavedToDB = this.userRepository.save(user);
        return userSavedToDB;
    }

    @Override
    public UserDto  getUser(long userId) {
        User user = this.userRepository.getReferenceById(userId);
        UserDto userDto = this.modelMapper.map(user, UserDto.class);
        return userDto;
    }

}