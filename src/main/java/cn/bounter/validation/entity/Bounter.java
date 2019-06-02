package cn.bounter.validation.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@Accessors(chain = true)
public class Bounter {

    @NotBlank
    private String name;

    @Min(18)
    private Integer age;
}
