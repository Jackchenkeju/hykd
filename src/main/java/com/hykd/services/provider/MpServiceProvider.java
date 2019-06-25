package com.hykd.services.provider;

import io.jboot.aop.annotation.Bean;
import com.hykd.services.MpService;
import com.hykd.models.Mp;
import io.jboot.service.JbootServiceBase;


@Bean

public class MpServiceProvider extends JbootServiceBase<Mp> implements MpService {

}