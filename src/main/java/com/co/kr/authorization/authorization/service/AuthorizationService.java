package com.co.kr.authorization.authorization.service;

import com.co.kr.authorization.authorization.domain.authorization.user.UserRepository;
import com.co.kr.authorization.authorization.dto.User.UserSaveRequestDto;
import com.co.kr.authorization.authorization.vo.Authorization.register.AuthorizationRequestBodyVo;
import org.json.simple.JSONObject;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AuthorizationService {
    private final UserRepository userRepository;

    public AuthorizationService(@Lazy UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<Object> Register(@RequestBody AuthorizationRequestBodyVo body) {
        try {
            userRepository.save(UserSaveRequestDto.builder()
                    .identity(body.getIdentity())
                    .password(body.getPassword())
                    .address(body.getAddress())
                    .age(body.getAge())
                    .build()
                    .toEntity()
            );

            JSONObject Response = new JSONObject();
            JSONObject Entity = new JSONObject();

            //Data
            Entity.put("identity", body.getIdentity());
            Entity.put("nickname", body.getNickName());
            Entity.put("address", body.getAddress());

            Response.put("status", HttpStatus.OK);
            Response.put("data", Entity);


            return new ResponseEntity<>(Response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
