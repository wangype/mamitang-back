package com.mamitang.service;

import com.mamitang.request.AdvertisementAddRequest;
import com.mamitang.response.RetResponse;

import java.util.Date;

/**
 * Created by lyy on 10/15/15.
 */
public interface IAdvertisementService {

    RetResponse addAdvertisement(AdvertisementAddRequest request);

    //show the detail of an advertisement which it's id is parameter
    RetResponse getAdvertisementDetail(int id);

    RetResponse getAdvertisementList(int page, int numOfPage, String name, Date starttime, Date endtime);

    RetResponse deleteAdvertisement(int id);

    RetResponse updateAdvertisement(int id, AdvertisementAddRequest request_info);
}
