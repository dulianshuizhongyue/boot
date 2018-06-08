package make.entity;

import lombok.*;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {
    private Integer id;
    private String name;
    private String password;
    private String phone;
}
