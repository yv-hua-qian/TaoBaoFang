package yv.hua.taobaofang.Object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserComments {
    private Integer userCommentId;
    private Integer userId;
    private String text;
    private Timestamp time;
}
