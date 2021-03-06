package io.reactivesw.catalog.producttype.application.model.mapper;

import com.google.common.collect.Lists;

import io.reactivesw.catalog.product.application.model.AttributeDefinitionDraft;
import io.reactivesw.catalog.product.application.model.attributes.AttributeDefinition;
import io.reactivesw.catalog.product.application.model.attributes.AttributeType;
import io.reactivesw.catalog.producttype.domain.entity.AttributeDefinitionEntity;
import io.reactivesw.common.model.mapper.LocalizedStringMapper;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Davis on 16/12/8.
 */
public final class AttributeDefinitionMapper {

  /**
   * Model to entity set.
   *
   * @param attributeDefinitionList the attribute definition list
   * @return the set
   */
  public static List<AttributeDefinitionEntity> modelToEntity(List<AttributeDefinitionDraft>
                                                                 attributeDefinitionList) {
    List<AttributeDefinitionEntity> entities = Lists.newArrayList();
    if (attributeDefinitionList != null) {
      entities = attributeDefinitionList.stream().map(attributedefinition -> {
        return modelToEntity(attributedefinition);
      }).collect(Collectors.toList());
    }
    return entities;
  }

  /**
   * convert Model to AttributeDefinitionEntity.
   *
   * @param draft the draft
   * @return the AttributeDefinitionEntity
   */
  public static AttributeDefinitionEntity modelToEntity(AttributeDefinitionDraft draft) {
    AttributeDefinitionEntity entity = new AttributeDefinitionEntity();
    entity.setName(draft.getName());
    entity.setInputHint(draft.getInputHint());
    entity.setRequired(draft.getIsRequired());
    entity.setSearchable(draft.getIsSearchable());
    entity.setType(draft.getType());
    entity.setAttributeConstraint(draft.getAttributeConstraint());
    entity.setLabel(LocalizedStringMapper.modelToEntityDefaultNew(draft.getLabel()));
    entity.setInputTip(LocalizedStringMapper.modelToEntityDefaultNew(draft.getInputTip()));
    return entity;
  }

  /**
   * convert Model to AttributeDefinitionEntity.
   *
   * @param attributeType the attribute type
   * @return the attribute definition entity
   */
  public static AttributeDefinitionEntity modelToEntity(AttributeType attributeType) {
    AttributeDefinitionEntity entity = new AttributeDefinitionEntity();
    return entity;
  }

  /**
   * Entity to model list.
   *
   * @param entities the entity
   * @return the list
   */
  public static List<AttributeDefinition> entityToModel(List<AttributeDefinitionEntity> entities) {
    List<AttributeDefinition> models = entities.stream().map(entity -> {
      return entityToModel(entity);
    }).collect(Collectors.toList());
    return models;
  }

  /**
   * convert Entity to AttributeDefinition.
   *
   * @param entity the entity
   * @return the attribute definition
   */
  public static AttributeDefinition entityToModel(AttributeDefinitionEntity entity) {
    AttributeDefinition model = new AttributeDefinition();
    model.setName(entity.getName());
    model.setInputHint(entity.getInputHint());
    model.setInputTip(LocalizedStringMapper.entityToModelDefaultNull(entity.getInputTip()));
    model.setLabel(LocalizedStringMapper.entityToModelDefaultNull(entity.getLabel()));
    model.setIsRequired(entity.getRequired());
    model.setIsSearchable(entity.getSearchable());
    model.setType(entity.getType());
    model.setAttributeConstraint(entity.getAttributeConstraint());
    return model;
  }
}
