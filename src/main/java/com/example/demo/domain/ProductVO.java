package com.example.demo.domain;

import lombok.Data;

/**
 * @author ChengJianSheng
 * @date 2019-05-26
 */
@Data
public class ProductVO {

    private Long productId;

    private String productName;

    private String category;

    private Integer showPrice;

    private Integer actualPrice;

}
