package br.com.gomide.hello.mapper;

import java.util.ArrayList;
import java.util.List;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class DozerMapper {
  private static Mapper dozerMapper = DozerBeanMapperBuilder.buildDefault();

  public static <O, D> D parseObject(O origin,
      Class<D> destination) {
    return dozerMapper.map(origin, destination);
  }

  public static <O, D> List<D> parseListObjects(
      List<O> originList, Class<D> destination) {
    List<D> destinationObjects = new ArrayList<D>();

    for (O originObject : originList) {
      destinationObjects
          .add(dozerMapper.map(originObject, destination));
    }

    return destinationObjects;
  }
}