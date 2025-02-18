package yv.hua.taobaofang.Object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private Integer userId;
    private Integer userTypeId;
    private String username;
    private String password;
    private String userName;
}
