/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.message.thrift.actor.cluser;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-09-20")
public class CluserInitMessage implements org.apache.thrift.TBase<CluserInitMessage, CluserInitMessage._Fields>, java.io.Serializable, Cloneable, Comparable<CluserInitMessage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CluserInitMessage");

  private static final org.apache.thrift.protocol.TField HOST_FIELD_DESC = new org.apache.thrift.protocol.TField("host", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField HOST_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("hostPort", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("port", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField SYSTEM_FIELD_DESC = new org.apache.thrift.protocol.TField("system", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PROTOCOL_FIELD_DESC = new org.apache.thrift.protocol.TField("protocol", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField LONG_UID_FIELD_DESC = new org.apache.thrift.protocol.TField("longUid", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CluserInitMessageStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CluserInitMessageTupleSchemeFactory();

  public java.lang.String host; // required
  public java.lang.String hostPort; // required
  public int port; // required
  public java.lang.String system; // required
  public java.lang.String protocol; // required
  public long longUid; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HOST((short)1, "host"),
    HOST_PORT((short)2, "hostPort"),
    PORT((short)3, "port"),
    SYSTEM((short)4, "system"),
    PROTOCOL((short)5, "protocol"),
    LONG_UID((short)6, "longUid");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // HOST
          return HOST;
        case 2: // HOST_PORT
          return HOST_PORT;
        case 3: // PORT
          return PORT;
        case 4: // SYSTEM
          return SYSTEM;
        case 5: // PROTOCOL
          return PROTOCOL;
        case 6: // LONG_UID
          return LONG_UID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PORT_ISSET_ID = 0;
  private static final int __LONGUID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HOST, new org.apache.thrift.meta_data.FieldMetaData("host", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HOST_PORT, new org.apache.thrift.meta_data.FieldMetaData("hostPort", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PORT, new org.apache.thrift.meta_data.FieldMetaData("port", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SYSTEM, new org.apache.thrift.meta_data.FieldMetaData("system", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROTOCOL, new org.apache.thrift.meta_data.FieldMetaData("protocol", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LONG_UID, new org.apache.thrift.meta_data.FieldMetaData("longUid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CluserInitMessage.class, metaDataMap);
  }

  public CluserInitMessage() {
  }

  public CluserInitMessage(
    java.lang.String host,
    java.lang.String hostPort,
    int port,
    java.lang.String system,
    java.lang.String protocol,
    long longUid)
  {
    this();
    this.host = host;
    this.hostPort = hostPort;
    this.port = port;
    setPortIsSet(true);
    this.system = system;
    this.protocol = protocol;
    this.longUid = longUid;
    setLongUidIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CluserInitMessage(CluserInitMessage other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHost()) {
      this.host = other.host;
    }
    if (other.isSetHostPort()) {
      this.hostPort = other.hostPort;
    }
    this.port = other.port;
    if (other.isSetSystem()) {
      this.system = other.system;
    }
    if (other.isSetProtocol()) {
      this.protocol = other.protocol;
    }
    this.longUid = other.longUid;
  }

  public CluserInitMessage deepCopy() {
    return new CluserInitMessage(this);
  }

  @Override
  public void clear() {
    this.host = null;
    this.hostPort = null;
    setPortIsSet(false);
    this.port = 0;
    this.system = null;
    this.protocol = null;
    setLongUidIsSet(false);
    this.longUid = 0;
  }

  public java.lang.String getHost() {
    return this.host;
  }

  public CluserInitMessage setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  public void unsetHost() {
    this.host = null;
  }

  /** Returns true if field host is set (has been assigned a value) and false otherwise */
  public boolean isSetHost() {
    return this.host != null;
  }

  public void setHostIsSet(boolean value) {
    if (!value) {
      this.host = null;
    }
  }

  public java.lang.String getHostPort() {
    return this.hostPort;
  }

  public CluserInitMessage setHostPort(java.lang.String hostPort) {
    this.hostPort = hostPort;
    return this;
  }

  public void unsetHostPort() {
    this.hostPort = null;
  }

  /** Returns true if field hostPort is set (has been assigned a value) and false otherwise */
  public boolean isSetHostPort() {
    return this.hostPort != null;
  }

  public void setHostPortIsSet(boolean value) {
    if (!value) {
      this.hostPort = null;
    }
  }

  public int getPort() {
    return this.port;
  }

  public CluserInitMessage setPort(int port) {
    this.port = port;
    setPortIsSet(true);
    return this;
  }

  public void unsetPort() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  /** Returns true if field port is set (has been assigned a value) and false otherwise */
  public boolean isSetPort() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  public void setPortIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PORT_ISSET_ID, value);
  }

  public java.lang.String getSystem() {
    return this.system;
  }

  public CluserInitMessage setSystem(java.lang.String system) {
    this.system = system;
    return this;
  }

  public void unsetSystem() {
    this.system = null;
  }

  /** Returns true if field system is set (has been assigned a value) and false otherwise */
  public boolean isSetSystem() {
    return this.system != null;
  }

  public void setSystemIsSet(boolean value) {
    if (!value) {
      this.system = null;
    }
  }

  public java.lang.String getProtocol() {
    return this.protocol;
  }

  public CluserInitMessage setProtocol(java.lang.String protocol) {
    this.protocol = protocol;
    return this;
  }

  public void unsetProtocol() {
    this.protocol = null;
  }

  /** Returns true if field protocol is set (has been assigned a value) and false otherwise */
  public boolean isSetProtocol() {
    return this.protocol != null;
  }

  public void setProtocolIsSet(boolean value) {
    if (!value) {
      this.protocol = null;
    }
  }

  public long getLongUid() {
    return this.longUid;
  }

  public CluserInitMessage setLongUid(long longUid) {
    this.longUid = longUid;
    setLongUidIsSet(true);
    return this;
  }

  public void unsetLongUid() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LONGUID_ISSET_ID);
  }

  /** Returns true if field longUid is set (has been assigned a value) and false otherwise */
  public boolean isSetLongUid() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LONGUID_ISSET_ID);
  }

  public void setLongUidIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LONGUID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case HOST:
      if (value == null) {
        unsetHost();
      } else {
        setHost((java.lang.String)value);
      }
      break;

    case HOST_PORT:
      if (value == null) {
        unsetHostPort();
      } else {
        setHostPort((java.lang.String)value);
      }
      break;

    case PORT:
      if (value == null) {
        unsetPort();
      } else {
        setPort((java.lang.Integer)value);
      }
      break;

    case SYSTEM:
      if (value == null) {
        unsetSystem();
      } else {
        setSystem((java.lang.String)value);
      }
      break;

    case PROTOCOL:
      if (value == null) {
        unsetProtocol();
      } else {
        setProtocol((java.lang.String)value);
      }
      break;

    case LONG_UID:
      if (value == null) {
        unsetLongUid();
      } else {
        setLongUid((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case HOST:
      return getHost();

    case HOST_PORT:
      return getHostPort();

    case PORT:
      return getPort();

    case SYSTEM:
      return getSystem();

    case PROTOCOL:
      return getProtocol();

    case LONG_UID:
      return getLongUid();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case HOST:
      return isSetHost();
    case HOST_PORT:
      return isSetHostPort();
    case PORT:
      return isSetPort();
    case SYSTEM:
      return isSetSystem();
    case PROTOCOL:
      return isSetProtocol();
    case LONG_UID:
      return isSetLongUid();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof CluserInitMessage)
      return this.equals((CluserInitMessage)that);
    return false;
  }

  public boolean equals(CluserInitMessage that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_host = true && this.isSetHost();
    boolean that_present_host = true && that.isSetHost();
    if (this_present_host || that_present_host) {
      if (!(this_present_host && that_present_host))
        return false;
      if (!this.host.equals(that.host))
        return false;
    }

    boolean this_present_hostPort = true && this.isSetHostPort();
    boolean that_present_hostPort = true && that.isSetHostPort();
    if (this_present_hostPort || that_present_hostPort) {
      if (!(this_present_hostPort && that_present_hostPort))
        return false;
      if (!this.hostPort.equals(that.hostPort))
        return false;
    }

    boolean this_present_port = true;
    boolean that_present_port = true;
    if (this_present_port || that_present_port) {
      if (!(this_present_port && that_present_port))
        return false;
      if (this.port != that.port)
        return false;
    }

    boolean this_present_system = true && this.isSetSystem();
    boolean that_present_system = true && that.isSetSystem();
    if (this_present_system || that_present_system) {
      if (!(this_present_system && that_present_system))
        return false;
      if (!this.system.equals(that.system))
        return false;
    }

    boolean this_present_protocol = true && this.isSetProtocol();
    boolean that_present_protocol = true && that.isSetProtocol();
    if (this_present_protocol || that_present_protocol) {
      if (!(this_present_protocol && that_present_protocol))
        return false;
      if (!this.protocol.equals(that.protocol))
        return false;
    }

    boolean this_present_longUid = true;
    boolean that_present_longUid = true;
    if (this_present_longUid || that_present_longUid) {
      if (!(this_present_longUid && that_present_longUid))
        return false;
      if (this.longUid != that.longUid)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetHost()) ? 131071 : 524287);
    if (isSetHost())
      hashCode = hashCode * 8191 + host.hashCode();

    hashCode = hashCode * 8191 + ((isSetHostPort()) ? 131071 : 524287);
    if (isSetHostPort())
      hashCode = hashCode * 8191 + hostPort.hashCode();

    hashCode = hashCode * 8191 + port;

    hashCode = hashCode * 8191 + ((isSetSystem()) ? 131071 : 524287);
    if (isSetSystem())
      hashCode = hashCode * 8191 + system.hashCode();

    hashCode = hashCode * 8191 + ((isSetProtocol()) ? 131071 : 524287);
    if (isSetProtocol())
      hashCode = hashCode * 8191 + protocol.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(longUid);

    return hashCode;
  }

  @Override
  public int compareTo(CluserInitMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetHost()).compareTo(other.isSetHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHost()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.host, other.host);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetHostPort()).compareTo(other.isSetHostPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHostPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hostPort, other.hostPort);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPort()).compareTo(other.isSetPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.port, other.port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSystem()).compareTo(other.isSetSystem());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSystem()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.system, other.system);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetProtocol()).compareTo(other.isSetProtocol());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtocol()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protocol, other.protocol);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLongUid()).compareTo(other.isSetLongUid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLongUid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.longUid, other.longUid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("CluserInitMessage(");
    boolean first = true;

    sb.append("host:");
    if (this.host == null) {
      sb.append("null");
    } else {
      sb.append(this.host);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hostPort:");
    if (this.hostPort == null) {
      sb.append("null");
    } else {
      sb.append(this.hostPort);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("port:");
    sb.append(this.port);
    first = false;
    if (!first) sb.append(", ");
    sb.append("system:");
    if (this.system == null) {
      sb.append("null");
    } else {
      sb.append(this.system);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("protocol:");
    if (this.protocol == null) {
      sb.append("null");
    } else {
      sb.append(this.protocol);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("longUid:");
    sb.append(this.longUid);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (host == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'host' was not present! Struct: " + toString());
    }
    if (hostPort == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'hostPort' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CluserInitMessageStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CluserInitMessageStandardScheme getScheme() {
      return new CluserInitMessageStandardScheme();
    }
  }

  private static class CluserInitMessageStandardScheme extends org.apache.thrift.scheme.StandardScheme<CluserInitMessage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CluserInitMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HOST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.host = iprot.readString();
              struct.setHostIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HOST_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hostPort = iprot.readString();
              struct.setHostPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.port = iprot.readI32();
              struct.setPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SYSTEM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.system = iprot.readString();
              struct.setSystemIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PROTOCOL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.protocol = iprot.readString();
              struct.setProtocolIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // LONG_UID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.longUid = iprot.readI64();
              struct.setLongUidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CluserInitMessage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.host != null) {
        oprot.writeFieldBegin(HOST_FIELD_DESC);
        oprot.writeString(struct.host);
        oprot.writeFieldEnd();
      }
      if (struct.hostPort != null) {
        oprot.writeFieldBegin(HOST_PORT_FIELD_DESC);
        oprot.writeString(struct.hostPort);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PORT_FIELD_DESC);
      oprot.writeI32(struct.port);
      oprot.writeFieldEnd();
      if (struct.system != null) {
        oprot.writeFieldBegin(SYSTEM_FIELD_DESC);
        oprot.writeString(struct.system);
        oprot.writeFieldEnd();
      }
      if (struct.protocol != null) {
        oprot.writeFieldBegin(PROTOCOL_FIELD_DESC);
        oprot.writeString(struct.protocol);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LONG_UID_FIELD_DESC);
      oprot.writeI64(struct.longUid);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CluserInitMessageTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CluserInitMessageTupleScheme getScheme() {
      return new CluserInitMessageTupleScheme();
    }
  }

  private static class CluserInitMessageTupleScheme extends org.apache.thrift.scheme.TupleScheme<CluserInitMessage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CluserInitMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.host);
      oprot.writeString(struct.hostPort);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPort()) {
        optionals.set(0);
      }
      if (struct.isSetSystem()) {
        optionals.set(1);
      }
      if (struct.isSetProtocol()) {
        optionals.set(2);
      }
      if (struct.isSetLongUid()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetPort()) {
        oprot.writeI32(struct.port);
      }
      if (struct.isSetSystem()) {
        oprot.writeString(struct.system);
      }
      if (struct.isSetProtocol()) {
        oprot.writeString(struct.protocol);
      }
      if (struct.isSetLongUid()) {
        oprot.writeI64(struct.longUid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CluserInitMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.host = iprot.readString();
      struct.setHostIsSet(true);
      struct.hostPort = iprot.readString();
      struct.setHostPortIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.port = iprot.readI32();
        struct.setPortIsSet(true);
      }
      if (incoming.get(1)) {
        struct.system = iprot.readString();
        struct.setSystemIsSet(true);
      }
      if (incoming.get(2)) {
        struct.protocol = iprot.readString();
        struct.setProtocolIsSet(true);
      }
      if (incoming.get(3)) {
        struct.longUid = iprot.readI64();
        struct.setLongUidIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
