package com.gxq.controller;

import com.gxq.model.PackageModel;
import com.gxq.model.ResourceModel;
import com.gxq.service.PackageService;
import com.gxq.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by xuenianxiang on 2017/4/10.
 */

@RestController
@RequestMapping("/api/package")
@EnableSwagger2
public class PackageController {

    @Autowired
    private PackageService packageService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelMap add(@RequestBody PackageModel packageModel) {

        return packageService.insert(packageModel);
    }
}