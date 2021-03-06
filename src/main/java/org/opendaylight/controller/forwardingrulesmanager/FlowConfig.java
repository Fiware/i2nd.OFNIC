/**
 * 
 *
 * Generated by <a href="http://enunciate.codehaus.org">Enunciate</a>.
 */
package org.opendaylight.controller.forwardingrulesmanager;

/**
 * (no documentation provided)
 */
@javax.xml.bind.annotation.XmlType (
  name = "flowConfig",
  namespace = ""
)
@javax.xml.bind.annotation.XmlRootElement (
  name = "flowConfig",
  namespace = ""
)
public class FlowConfig extends org.opendaylight.controller.configuration.ConfigurationObject {

  private java.lang.String _tosBits;
  private java.util.List<java.lang.String> _actions;
  private java.lang.String _nwSrc;
  private java.lang.String _tpSrc;
  private java.lang.String _nwDst;
  private java.lang.String _vlanPriority;
  private java.lang.String _etherType;
  private java.lang.String _vlanId;
  private java.lang.String _dlSrc;
  private java.lang.String _tpDst;
  private java.lang.String _ingressPort;
  private java.lang.String _installInHw;
  private java.lang.String _idleTimeout;
  private java.lang.String _dlDst;
  private java.lang.String _priority;
  private java.lang.String _cookie;
  private java.lang.String _protocol;
  private org.opendaylight.controller.sal.core.Node _node;
  private java.lang.String _name;
  private java.lang.String _hardTimeout;

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "tosBits",
    namespace = ""
  )
  public java.lang.String getTosBits() {
    return this._tosBits;
  }

  /**
   * (no documentation provided)
   */
  public void setTosBits(java.lang.String _tosBits) {
    this._tosBits = _tosBits;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "actions",
    namespace = ""
  )
  public java.util.List<java.lang.String> getActions() {
    return this._actions;
  }

  /**
   * (no documentation provided)
   */
  public void setActions(java.util.List<java.lang.String> _actions) {
    this._actions = _actions;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "nwSrc",
    namespace = ""
  )
  public java.lang.String getNwSrc() {
    return this._nwSrc;
  }

  /**
   * (no documentation provided)
   */
  public void setNwSrc(java.lang.String _nwSrc) {
    this._nwSrc = _nwSrc;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "tpSrc",
    namespace = ""
  )
  public java.lang.String getTpSrc() {
    return this._tpSrc;
  }

  /**
   * (no documentation provided)
   */
  public void setTpSrc(java.lang.String _tpSrc) {
    this._tpSrc = _tpSrc;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "nwDst",
    namespace = ""
  )
  public java.lang.String getNwDst() {
    return this._nwDst;
  }

  /**
   * (no documentation provided)
   */
  public void setNwDst(java.lang.String _nwDst) {
    this._nwDst = _nwDst;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "vlanPriority",
    namespace = ""
  )
  public java.lang.String getVlanPriority() {
    return this._vlanPriority;
  }

  /**
   * (no documentation provided)
   */
  public void setVlanPriority(java.lang.String _vlanPriority) {
    this._vlanPriority = _vlanPriority;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "etherType",
    namespace = ""
  )
  public java.lang.String getEtherType() {
    return this._etherType;
  }

  /**
   * (no documentation provided)
   */
  public void setEtherType(java.lang.String _etherType) {
    this._etherType = _etherType;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "vlanId",
    namespace = ""
  )
  public java.lang.String getVlanId() {
    return this._vlanId;
  }

  /**
   * (no documentation provided)
   */
  public void setVlanId(java.lang.String _vlanId) {
    this._vlanId = _vlanId;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "dlSrc",
    namespace = ""
  )
  public java.lang.String getDlSrc() {
    return this._dlSrc;
  }

  /**
   * (no documentation provided)
   */
  public void setDlSrc(java.lang.String _dlSrc) {
    this._dlSrc = _dlSrc;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "tpDst",
    namespace = ""
  )
  public java.lang.String getTpDst() {
    return this._tpDst;
  }

  /**
   * (no documentation provided)
   */
  public void setTpDst(java.lang.String _tpDst) {
    this._tpDst = _tpDst;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "ingressPort",
    namespace = ""
  )
  public java.lang.String getIngressPort() {
    return this._ingressPort;
  }

  /**
   * (no documentation provided)
   */
  public void setIngressPort(java.lang.String _ingressPort) {
    this._ingressPort = _ingressPort;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "installInHw",
    namespace = ""
  )
  public java.lang.String getInstallInHw() {
    return this._installInHw;
  }

  /**
   * (no documentation provided)
   */
  public void setInstallInHw(java.lang.String _installInHw) {
    this._installInHw = _installInHw;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "idleTimeout",
    namespace = ""
  )
  public java.lang.String getIdleTimeout() {
    return this._idleTimeout;
  }

  /**
   * (no documentation provided)
   */
  public void setIdleTimeout(java.lang.String _idleTimeout) {
    this._idleTimeout = _idleTimeout;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "dlDst",
    namespace = ""
  )
  public java.lang.String getDlDst() {
    return this._dlDst;
  }

  /**
   * (no documentation provided)
   */
  public void setDlDst(java.lang.String _dlDst) {
    this._dlDst = _dlDst;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "priority",
    namespace = ""
  )
  public java.lang.String getPriority() {
    return this._priority;
  }

  /**
   * (no documentation provided)
   */
  public void setPriority(java.lang.String _priority) {
    this._priority = _priority;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "cookie",
    namespace = ""
  )
  public java.lang.String getCookie() {
    return this._cookie;
  }

  /**
   * (no documentation provided)
   */
  public void setCookie(java.lang.String _cookie) {
    this._cookie = _cookie;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "protocol",
    namespace = ""
  )
  public java.lang.String getProtocol() {
    return this._protocol;
  }

  /**
   * (no documentation provided)
   */
  public void setProtocol(java.lang.String _protocol) {
    this._protocol = _protocol;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "node",
    namespace = ""
  )
  public org.opendaylight.controller.sal.core.Node getNode() {
    return this._node;
  }

  /**
   * (no documentation provided)
   */
  public void setNode(org.opendaylight.controller.sal.core.Node _node) {
    this._node = _node;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "name",
    namespace = ""
  )
  public java.lang.String getName() {
    return this._name;
  }

  /**
   * (no documentation provided)
   */
  public void setName(java.lang.String _name) {
    this._name = _name;
  }

  /**
   * (no documentation provided)
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "hardTimeout",
    namespace = ""
  )
  public java.lang.String getHardTimeout() {
    return this._hardTimeout;
  }

  /**
   * (no documentation provided)
   */
  public void setHardTimeout(java.lang.String _hardTimeout) {
    this._hardTimeout = _hardTimeout;
  }

}
