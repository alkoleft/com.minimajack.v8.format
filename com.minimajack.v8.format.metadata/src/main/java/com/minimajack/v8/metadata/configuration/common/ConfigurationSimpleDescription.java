package com.minimajack.v8.metadata.configuration.common;

import com.minimajack.v8.annotation.Required;
import com.minimajack.v8.annotation.V8Class;
import com.minimajack.v8.metadata.external.common.MetaDataInfo;
import com.minimajack.v8.metadata.external.common.V8Synonym;
import com.minimajack.v8.metadata.external.type.ListArrayTypes;
import com.minimajack.v8.metadata.external.type.ListTypes;
import com.minimajack.v8.metadata.external.unknown.Fields;
import com.minimajack.v8.metadata.external.unknown.MetadataObjectPropertyValueCollection;

import java.util.UUID;

@V8Class
public class ConfigurationSimpleDescription {

  public Integer type;

  public MetaDataInfo name;

  public String unk1;

  public Integer unk2;

  public V8Synonym detailedInfo;

  public V8Synonym shortInfo;

  public V8Synonym copyrights;

  public V8Synonym addressSeller;

  public V8Synonym addressInfo;

  public UUID unk8;

  public UUID unk9;

  public UUID unk10;

  public UUID unk11;

  public Integer unk12;

  public String seller;

  public String version;

  public String addressUdates;

  public Integer unk16;

  public Fields unk17;

  public Integer unk18;

  public Fields unk19;

  public Integer configurationType;

  public UUID unk21;

  public UUID unk22;

  public UUID unk23;

  public UUID unk24;

  public Integer unk25;

  public Fields unk26;

  public Integer unk27;

  public Integer unk28;

  public UUID unk29;

  public UUID unk30;

  public UUID unk31;

  @Required(required = false)
  public ListTypes unk32;

  @Required(required = false)
  public UUID unk33;

  @Required(required = false)
  public UUID unk34;

  @Required(required = false)
  public Integer unk35;

  @Required(required = false)
  public UUID unk36;

  @Required(required = false)
  public Integer unk37;

  @Required(required = false)
  public MetadataObjectPropertyValueCollection unk38;

  @Required(required = false)
  public ListArrayTypes unk39;

  @Required(required = false)
  public Integer unk40;

  @Required(required = false)
  public String unk41;

  @Required(required = false)
  public Integer unk42;

  public void afterUnmarshal() {}
}
