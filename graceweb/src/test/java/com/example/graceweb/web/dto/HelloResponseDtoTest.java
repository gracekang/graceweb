package com.example.graceweb.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_테스트(){
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name,amount);

        assertThat(dto.getName()).isEqualTo(name); //assertThat은 검증하고 싶은 메소드를 인자로 받음
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
