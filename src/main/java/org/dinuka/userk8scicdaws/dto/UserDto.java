package org.dinuka.userk8scicdaws.dto;

public record UserDto(
         Long id,
         String username,
         String email
) {
    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", userName='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
