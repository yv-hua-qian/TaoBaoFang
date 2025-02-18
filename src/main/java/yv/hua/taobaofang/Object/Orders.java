package yv.hua.taobaofang.Object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private Integer indentId;
    private Integer userIndentTypeId;
    private Integer shoppingId;
    private Integer userId;
    private Integer priceQuantity;
}
