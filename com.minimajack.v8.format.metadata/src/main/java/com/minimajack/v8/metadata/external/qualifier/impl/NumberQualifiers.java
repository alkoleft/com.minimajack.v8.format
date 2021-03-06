package com.minimajack.v8.metadata.external.qualifier.impl;

import com.minimajack.v8.annotation.V8Class;
import com.minimajack.v8.metadata.external.qualifier.Qualifiers;
import com.minimajack.v8.metadata.inner.enums.AllowedSign;
import com.minimajack.v8.metadata.inner.enums.V8Type;

@V8Class
public class NumberQualifiers extends Qualifiers {

  public V8Type type;
  
  public Integer digits;

  public Integer fractionDigits;

  public AllowedSign allowedSign;
}
