package org.example.domain.common.service;

import com.systex.springboot.demo1.domain.PointType;

import java.util.List;
import java.util.UUID;

public interface PointTypeService {
    UUID createPointType(PointType type);
    List<PointType> allTypes();
}
