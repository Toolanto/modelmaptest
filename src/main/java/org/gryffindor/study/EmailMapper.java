package org.gryffindor.study;

import org.modelmapper.ModelMapper;

public class EmailMapper {

    private final ModelMapper modelMapper;

    public EmailMapper() {
        this.modelMapper = new ModelMapper();
    }

    public Email map(EmailDto emailDto) {
       return modelMapper.map(emailDto, Email.class);
    }

    public EmailDto map(Email email) {
        return modelMapper.map(email, EmailDto.class);
    }
}
