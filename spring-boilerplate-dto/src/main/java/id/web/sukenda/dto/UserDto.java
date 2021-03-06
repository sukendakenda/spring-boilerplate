package id.web.sukenda.dto;

import id.web.sukenda.common.enums.Role;
import id.web.sukenda.common.utils.DTOEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable, DTOEntity {

    private String id;

    private String username;

    private String password;

    private Boolean enabled;

    private List<Role> roles;

}
