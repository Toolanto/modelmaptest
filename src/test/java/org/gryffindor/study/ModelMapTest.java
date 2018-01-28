package org.gryffindor.study;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

public class ModelMapTest {

    @Test
    public void mappingEmailDtoInEmail() {
        final EmailDto emailDto = new EmailDto("email@email.it", "name");
        final Email email = new EmailMapper().map(emailDto);

        assertThat(email.getEmail(), is(emailDto.getEmail()));
        assertThat(email.getName(), is(emailDto.getName()));
    }

    @Test
    public void mappingEmailInEmailDto() {
        final Email email = new Email("email@email.it", "name");
        final EmailDto emailDto = new EmailMapper().map(email);

        assertThat(emailDto.getEmail(), is(email.getEmail()));
        assertThat(emailDto.getName(), is(email.getName()));
    }

    @Test
    public void mappingUserDtoInUser() {
        final UserDto userDto = new UserDto("name", new EmailDto("email@email.it", "name"));

        final User user = new UserMapper().map(userDto);

        assertThat(user.getID(), is(notNullValue()));
        assertThat(user.getName(), is(userDto.getName()));
        assertThat(user.getEmail().getEmail(), is(userDto.getEmail().getEmail()));
        assertThat(user.getEmail().getName(), is(userDto.getEmail().getName()));

    }

    @Test
    public void mappingUserInUserDto() {
        final User user = new User("name", new Email("email@email.it", "name"));

        final UserDto userDto = new UserMapper().map(user);

        assertThat(userDto.getID(), is(notNullValue()));
        assertThat(userDto.getName(), is(user.getName()));
        assertThat(userDto.getEmail().getEmail(), is(user.getEmail().getEmail()));
        assertThat(userDto.getEmail().getName(), is(user.getEmail().getName()));

    }



}
