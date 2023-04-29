package com.geekster.UserManagementSystem2.Model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class User {

    private @NotBlank String userId;
    private @NotEmpty(
            message = "Enter user Name"
    ) String userName;
    private
    @Pattern(
            regexp = "^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$"
//            dd/mm/yyyy || dd/mm/yy
    )String dateOfBirth;
    private @Email @NotEmpty String email;
    private @Size(
            min = 10,
            max = 12
    ) @Pattern(
            regexp = "^[0-9]+$"
    )String phoneNumber;
    private
    @Pattern(
            regexp = "^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$"
//            dd/mm/yyyy || dd/mm/yy
    )String date;

    private @Pattern(
            regexp = "([01]?[0-24]|2[0-24]):[0-5][0-9]"
    ) String time;




}
