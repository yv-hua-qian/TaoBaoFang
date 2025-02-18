package yv.hua.taobaofang.Object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
    public class Shopping {
        private Integer shoppingId;
        private Integer userCommentId;
        private String shoppingJpg;
        private Float price;
        private String name;
        private String text;
    }
