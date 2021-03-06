package com.minimajack.v8.metadata.filtercriteria;

import com.minimajack.v8.annotation.V8Class;
import com.minimajack.v8.annotation.V8Version;
import com.minimajack.v8.metadata.external.common.V8Synonym;
import com.minimajack.v8.metadata.external.unknown.MetadataObjectPropertyValueCollection;

import java.util.UUID;

@V8Class
public class FilterCriteriaBlock {

  @V8Version
  public Integer version;
  public UUID unk1;
  public UUID unk2;
  public UUID unk3;
  public UUID unk4;
  public FilterCriteriaDesciptionBlock fcdb;
  public MetadataObjectPropertyValueCollection content;
  public Boolean useStandardCommands;
  public UUID defaultForm;
  public UUID auxiliaryForm;
  public V8Synonym listPresentation;
  public V8Synonym extendedListPresentation;
  public V8Synonym explanation;

}
