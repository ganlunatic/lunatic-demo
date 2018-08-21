package cn.lunatic.dubbo.demo.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ganluantic
 * @Description
 * @date 2018/8/11 13:57
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class UserInfo {
    private String userId;

    private String userName;

    private Integer age;

    private String garden;
}
