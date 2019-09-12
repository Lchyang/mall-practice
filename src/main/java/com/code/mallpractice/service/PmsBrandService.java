package com.code.mallpractice.service;

import com.code.mallpractice.mbg.model.PmsBrand;

import java.util.List;

public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int PageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
