package yv.hua.taobaofang.Object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingComments {
    private Integer shoppingCommentId;
    private Integer shoppingId;
    private Integer userCommentId;
}
