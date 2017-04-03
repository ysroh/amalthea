package org.eclipse.papyrus.amalthea.translator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ComponentInstance;
import org.eclipse.app4mc.amalthea.model.FInterfacePort;
import org.eclipse.app4mc.amalthea.model.IAnnotatable;
import org.eclipse.app4mc.amalthea.model.QualifiedPort;
import org.eclipse.papyrus.amalthea.profile.utils.ComponentModelUtils;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * @author epp
 */
@SuppressWarnings("all")
public class ComponentModelTranslator {
  protected IAnnotatable _translate(final Component element) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final org.eclipse.app4mc.amalthea.model.Component _result;
    synchronized (_createCache_translate) {
      if (_createCache_translate.containsKey(_cacheKey)) {
        return _createCache_translate.get(_cacheKey);
      }
      org.eclipse.app4mc.amalthea.model.Component _switchResult = null;
      boolean _matched = false;
      boolean _isComposite = ComponentModelUtils.isComposite(element);
      if (_isComposite) {
        _matched=true;
        _switchResult = AmaltheaFactory.eINSTANCE.createComposite();
      }
      if (!_matched) {
        boolean _isComponent = ComponentModelUtils.isComponent(element);
        if (_isComponent) {
          _matched=true;
          _switchResult = AmaltheaFactory.eINSTANCE.createComponent();
        }
      }
      _result = _switchResult;
      _createCache_translate.put(_cacheKey, _result);
    }
    _init_translate(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, IAnnotatable> _createCache_translate = CollectionLiterals.newHashMap();
  
  private void _init_translate(final org.eclipse.app4mc.amalthea.model.Component it, final Component element) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field getComposite is undefined for the type Component"
      + "\nThe method or field base_ConnectorEnd is undefined"
      + "\ngroundedPorts cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nmap cannot be resolved");
  }
  
  protected IAnnotatable _translate(final Port element) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final FInterfacePort _result;
    synchronized (_createCache_translate_1) {
      if (_createCache_translate_1.containsKey(_cacheKey)) {
        return _createCache_translate_1.get(_cacheKey);
      }
      FInterfacePort _xifexpression = null;
      boolean _isFInterfacePort = ComponentModelUtils.isFInterfacePort(element);
      if (_isFInterfacePort) {
        _xifexpression = AmaltheaFactory.eINSTANCE.createFInterfacePort();
      }
      _result = _xifexpression;
      _createCache_translate_1.put(_cacheKey, _result);
    }
    _init_translate_1(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, IAnnotatable> _createCache_translate_1 = CollectionLiterals.newHashMap();
  
  private void _init_translate_1(final FInterfacePort it, final Port element) {
    it.setName(element.getName());
  }
  
  protected IAnnotatable _translate(final Property element) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final ComponentInstance _result;
    synchronized (_createCache_translate_2) {
      if (_createCache_translate_2.containsKey(_cacheKey)) {
        return _createCache_translate_2.get(_cacheKey);
      }
      ComponentInstance _xifexpression = null;
      boolean _isComponentInstance = ComponentModelUtils.isComponentInstance(element);
      if (_isComponentInstance) {
        _xifexpression = AmaltheaFactory.eINSTANCE.createComponentInstance();
      }
      _result = _xifexpression;
      _createCache_translate_2.put(_cacheKey, _result);
    }
    _init_translate_2(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, IAnnotatable> _createCache_translate_2 = CollectionLiterals.newHashMap();
  
  private void _init_translate_2(final ComponentInstance it, final Property element) {
    it.setName(element.getName());
    Type _type = element.getType();
    IAnnotatable _translate = this.translate(((Component) _type));
    it.setType(((org.eclipse.app4mc.amalthea.model.Component) _translate));
  }
  
  protected IAnnotatable _translate(final Connector element) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final org.eclipse.app4mc.amalthea.model.Connector _result;
    synchronized (_createCache_translate_3) {
      if (_createCache_translate_3.containsKey(_cacheKey)) {
        return _createCache_translate_3.get(_cacheKey);
      }
      _result = AmaltheaFactory.eINSTANCE.createConnector();
      _createCache_translate_3.put(_cacheKey, _result);
    }
    _init_translate_3(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, IAnnotatable> _createCache_translate_3 = CollectionLiterals.newHashMap();
  
  private void _init_translate_3(final org.eclipse.app4mc.amalthea.model.Connector it, final Connector element) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field getConnector is undefined for the type Connector"
      + "\nThe method or field getConnector is undefined for the type Connector"
      + "\nsourcePort cannot be resolved"
      + "\nbase_ConnectorEnd cannot be resolved"
      + "\ntargetPort cannot be resolved"
      + "\nbase_ConnectorEnd cannot be resolved");
  }
  
  protected IAnnotatable _translate(final ConnectorEnd element) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final QualifiedPort _result;
    synchronized (_createCache_translate_4) {
      if (_createCache_translate_4.containsKey(_cacheKey)) {
        return _createCache_translate_4.get(_cacheKey);
      }
      _result = AmaltheaFactory.eINSTANCE.createQualifiedPort();
      _createCache_translate_4.put(_cacheKey, _result);
    }
    _init_translate_4(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, IAnnotatable> _createCache_translate_4 = CollectionLiterals.newHashMap();
  
  private void _init_translate_4(final QualifiedPort it, final ConnectorEnd element) {
    IAnnotatable _translate = this.translate(element.getPartWithPort());
    it.setInstance(((ComponentInstance) _translate));
    ConnectableElement _role = element.getRole();
    IAnnotatable _translate_1 = this.translate(((Port) _role));
    it.setPort(((org.eclipse.app4mc.amalthea.model.Port) _translate_1));
  }
  
  public IAnnotatable translate(final Element element) {
    if (element instanceof Component) {
      return _translate((Component)element);
    } else if (element instanceof Port) {
      return _translate((Port)element);
    } else if (element instanceof Property) {
      return _translate((Property)element);
    } else if (element instanceof Connector) {
      return _translate((Connector)element);
    } else if (element instanceof ConnectorEnd) {
      return _translate((ConnectorEnd)element);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element).toString());
    }
  }
}
