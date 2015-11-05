package com.mamitang.service.impl;

import com.mamitang.dao.ADPictureEntityMapper;
import com.mamitang.service.IADPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lyy on 10/15/15.
 */
@Service("adpictureService")
public class ADPictureServiceImpl implements IADPictureService {
    @Autowired
    ADPictureEntityMapper adpictureDao;
}
