package com.moamen.search.api.data.specifications;

import com.moamen.search.api.data.entities.Device;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.EqualIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And({
        @Spec(path = "id", spec = Equal.class),
        @Spec(path = "brand", spec = EqualIgnoreCase.class),
        @Spec(path = "phone", spec = EqualIgnoreCase.class),
        @Spec(path = "picture", spec = Equal.class),
        @Spec(path = "sim", spec = EqualIgnoreCase.class),
        @Spec(path = "resolution", spec = Equal.class),
        @Spec(path = "release.announceDate", params = "announceDate",spec = Like.class),
        @Spec(path = "release.priceEur", params = "priceEur",spec = Equal.class),
        @Spec(path = "hardware.audioJack", params = "audioJack",spec = EqualIgnoreCase.class),
        @Spec(path = "hardware.gps", params = "gps",spec = EqualIgnoreCase.class),
        @Spec(path = "hardware.battery", params = "battery",spec = EqualIgnoreCase.class)
})
public interface DeviceSpecification extends Specification<Device> {
}
